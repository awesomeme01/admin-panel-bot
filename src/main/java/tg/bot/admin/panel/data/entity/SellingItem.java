package tg.bot.admin.panel.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "selling_item")
@Getter
@Setter
@NoArgsConstructor
public class SellingItem extends AbstractEntity {

    @Lob
    @Column(length = 1000000)
    private byte[] picture;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "candy_id")
    private Product product;

    @OneToOne(mappedBy = "sellingItem", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "booking_id")
    private Booking bookedBy;

    @Column(name = "weight")//in grams
    private Double weight;

    @Column(name = "price")
    private Double price;

    @Override
    public String toString() {
        return String.format("%s[%s] %sg. for %s", product.getName(), product.getBrand().getName(), weight, price);
    }
}
