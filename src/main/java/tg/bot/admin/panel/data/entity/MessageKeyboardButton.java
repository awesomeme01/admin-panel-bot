package tg.bot.admin.panel.data.entity;

import javax.persistence.Entity;

@Entity
public class MessageKeyboardButton extends AbstractEntity {

    private Integer keyboardId;
    private String label;
    private String url;
    private boolean isActive;

    public Integer getKeyboardId() {
        return keyboardId;
    }
    public void setKeyboardId(Integer keyboardId) {
        this.keyboardId = keyboardId;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public boolean isIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
