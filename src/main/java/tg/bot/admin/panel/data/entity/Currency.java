package tg.bot.admin.panel.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.bot.admin.panel.data.entity.enums.MoneyType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Currency extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private MoneyType type;

    @Column(name = "amount_in_usd")
    private Integer amountInUsd;

}
