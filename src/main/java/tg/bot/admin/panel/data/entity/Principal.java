package tg.bot.admin.panel.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;

@Entity
public class Principal extends AbstractEntity {

    private String username;
    @JsonIgnore
    private String password;
    private boolean isActive;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
