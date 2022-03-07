package com.amr.project.model.entity;

import com.amr.project.model.enums.Gender;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"id", "email", "username", "password", "phone", "firstName", "lastName", "age", "gender"})
@EqualsAndHashCode(of = {"id", "email", "username"})
public class User implements UserDetails {
    //TODO надо продумать юзера, слишком много у него связей,
    // нужны-ли они, возможно где-то вместо связи с ентити использовать id,
    // иначе есть вероятность попасть в констрейнты и не отстроить нормальную структуру
    // для взаимодействия с БД

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "activate")
    private boolean activate;

    @Column(name = "activationCode")
    private String activationCode;

    @Column(name = "phone")
    private String phone;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "Address_id")
    private List<Address> address;

    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "birthday")
    private Calendar birthday;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "image_id")
    private List<Image> images;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "user_coupons",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "coupons_id"))
    private List<Coupon> coupons;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    @JoinTable(name = "user_cartItem",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "cartItem_id"))
    private Set<CartItem> cart;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "user_orders",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "orders_id"))
    private List<Order> orders;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "user_reviews",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "reviews_id"))
    private List<Review> reviews;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "user_shops",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "shops_id"))
    private List<Shop> shops;

    // private Favorite favorite;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinTable(name = "user_discount",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "discount_id"))
    private List<Discount> discounts;

    private boolean isUsingTwoFactorAuth; // transcient ??

    private String secret;  // transcient ??

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
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
