package tg.bot.admin.panel.data.entity;

import javax.persistence.Entity;

@Entity
public class MessageResponseTemplate extends AbstractEntity {

    private String message;
    private String botRequestUrl;
    private String response;
    private String lang;
    private String pattern;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getBotRequestUrl() {
        return botRequestUrl;
    }
    public void setBotRequestUrl(String botRequestUrl) {
        this.botRequestUrl = botRequestUrl;
    }
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getPattern() {
        return pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
