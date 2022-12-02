package tg.bot.admin.panel.data.entity;

import javax.persistence.Entity;

@Entity
public class MessageKeyboard extends AbstractEntity {

    private Integer templateId;
    private String version;
    private String buttons;
    private boolean isActive;

    public Integer getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getButtons() {
        return buttons;
    }
    public void setButtons(String buttons) {
        this.buttons = buttons;
    }
    public boolean isIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}
