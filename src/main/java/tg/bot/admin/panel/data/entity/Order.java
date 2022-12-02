package tg.bot.admin.panel.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.bot.admin.panel.data.entity.enums.OrderStatus;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "c_order")
@Getter
@Setter
@NoArgsConstructor
public class Order extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "selling_item_id")
    private SellingItem sellingItem;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Client orderedBy;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id", referencedColumnName = "id")
    private Payment payment;

}
