public enum Season {
    SPRING("Wiosna", new String[]{"Marzec", "Kwiecień", "Maj"}),
    SUMMER("Lato", new String[]{"Czerwiec", "Lipiec", "Sierpień"}),
    AUTUMN("Jesien", new String[]{"Wrzesień", "Październik", "Listopad"}),
    WINTER("Zima", new String[]{"Grudzień", "Styczeń", "Luty"});

    private final String polishName;
    private final String[] months;

    Season(String polishName, String[] months) {
        this.polishName = polishName;
        this.months = months;
    }

    public String getPolishName() {
        return polishName;
    }

    public String[] getMonths() {
        return months;
    }
}
