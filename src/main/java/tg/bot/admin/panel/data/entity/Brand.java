package tg.bot.admin.panel.data.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
@Getter
@Setter
@NoArgsConstructor
public class Brand extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return this.name;
    }
}
