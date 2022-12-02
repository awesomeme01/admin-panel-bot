package tg.bot.admin.panel.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
@Getter
@Setter
@NoArgsConstructor
public class Booking extends AbstractEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Client user;

    @OneToOne
    @MapsId
    @JoinColumn(name = "selling_item_id")
    private SellingItem sellingItem;

    @Override
    public String toString() {
        return user.toString();
    }
}
