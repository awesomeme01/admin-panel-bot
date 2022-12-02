package tg.bot.admin.panel.data.entity.enums;

public enum OrderStatus {
    CREATED             ("Created",             "badge success"),
    PAYMENT_AUTHORIZED  ("Payment Authorized",  "badge"),
    FINISHED            ("Finished",            "badge primary"),
    CANCELLED           ("Cancelled",           "badge contrast"),
    ERROR               ("Error",               "badge error primary");

    private final String friendlyName;
    private final String vaadinTheme;

    OrderStatus(String friendlyName, String vaadinTheme) {
        this.friendlyName = friendlyName;
        this.vaadinTheme = vaadinTheme;
    }

    public String friendlyName() {
        return this.friendlyName;
    }

    public String vaadinTheme() {
        return this.vaadinTheme;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
