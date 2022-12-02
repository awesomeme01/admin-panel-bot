package tg.bot.admin.panel.data.entity;

import javax.persistence.Entity;

@Entity
public class PrincipalRole extends AbstractEntity {

    private String role;
    private String principal;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getPrincipal() {
        return principal;
    }
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

}
