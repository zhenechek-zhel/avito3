package com.amr.project.model.entity;

import com.amr.project.model.enums.Roles;
import com.stripe.model.BalanceTransaction;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = {"id", "email", "username", "password"})
@EqualsAndHashCode(of = {"id", "email", "username"})
public class User implements UserDetails {
    //TODO надо продумать юзера, слишком много у него связей,
    // нужны-ли они, возможно где-то вместо связи с ентити использовать id,
    // иначе есть вероятность попасть в констрейнты и не отстроить нормальную структуру


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "username", unique = true)
    private String username;

    private String password;
    private boolean activate;
    private String activationCode;
    private boolean isUsingTwoFactorAuth;
    private String secret;

    @Enumerated(EnumType.STRING)
    private Roles role;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private UserInfo userInfo;


    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private Favorite favorite;


    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;





    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private Set<Image> images;


    @OneToMany(
            mappedBy = "user",
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.DETACH,
                    CascadeType.REFRESH},
            orphanRemoval = true)
    private Set<Coupon> coupons;


    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<CartItem> cart;


    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Order> orders;


    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Review> reviews;


    @OneToMany(
            mappedBy = "user",
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.DETACH,
                    CascadeType.REFRESH},
            orphanRemoval = true
    )
    private Set<Shop> shops;


    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private Set<Discount> discounts;


    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Message> messages;


    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "user_chat",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "chat_id"))
    private Set<Chat> chats;



    @OneToMany(
            mappedBy = "user",
            cascade = {CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH,
            CascadeType.DETACH},
            orphanRemoval = true
    )
    private Set<Feedback> feedbacks;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
