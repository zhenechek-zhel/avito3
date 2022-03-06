package com.amr.project.model.entity;

import com.amr.project.model.enums.Status;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    private List<Item> items;//список заказанных товаров

    @Column(name = "data", nullable = false)
    private Calendar orderDate;//дата заказа

    @Column(name = "delyv_data")
    private Calendar expectedDeliveryDate;//ожидаемая дата доставки

    @Column(name = "descript")
    private String description;//комментарий к заказу со стороны user'a

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private Status status;//статус заказа

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    /*@Column(name = "")
    private Shop shop;//магазин-продавец (или магазины?) - подумать над необходимостью данного поля (информация продублирована в items)
*/

    @ManyToOne
    @JoinColumn(name = "delivery_address_ID")
    private Address deliveryAddress;//адрес доставки товара (указывается user'ом)

    @Column(name = "total")
    private BigDecimal grandTotal;

    @Column(name = "currency")
    private String currency;

    public Order() {}
}
