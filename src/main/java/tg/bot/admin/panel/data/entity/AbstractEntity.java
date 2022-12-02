package tg.bot.admin.panel.data.entity;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedDate
    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @LastModifiedDate
    @Column(name = "date_updated")
    private LocalDateTime dateUpdated;

    @Override
    public int hashCode() {
        if (id != null) {
            return id.hashCode();
        }
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractEntity other)) {
            return false; // null or other class
        }

        if (id != null) {
            return id.equals(other.id);
        }
        return super.equals(other);
    }
}
