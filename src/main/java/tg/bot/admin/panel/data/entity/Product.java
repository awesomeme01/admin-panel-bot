package tg.bot.admin.panel.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candy")
public class Product extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "description")
    private String description;

    @Column(name = "price_per_gram")
    private Double price;

    @Override
    public String toString() {
        return name + " [" + code + "]";
    }
}
