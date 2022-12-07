package tg.bot.admin.panel.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tg.bot.core.domain.base.AbstractAuditableEntity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends AbstractAuditableEntity {

    @Column(name = "name")
    private String firstName;

    @Column(name = "surname")
    private String lastName;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "is_active")
    private Boolean isActive = true;

    private LocalDate dateOfBirth;
    private String occupation;
    private boolean important;

    @Override
    public String toString() {
        return username;
    }
}
