package tg.bot.admin.panel.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends AbstractEntity {

    private Client user;
    private Integer orderId;
    private Integer amount;
    private String currency;

}
