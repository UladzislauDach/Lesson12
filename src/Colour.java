public enum Colour {
    BLACK("black", "чорны"),
    WHITE("white", "белы"),
    YELLOW("yellow", "жоуты"),
    BLUE("blue", "галубы");
    private String coulorName;
    private String ressianCoulorName;

    Colour(String coulorName, String ressianCoulorName) {
        this.coulorName = coulorName;
        this.ressianCoulorName = ressianCoulorName;
    }

    public String getCoulorName() {
        return coulorName;
    }

    public String getRessianCoulorName() {
        return ressianCoulorName;
    }
}
