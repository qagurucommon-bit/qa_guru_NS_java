package data;

public enum categoryType {
    Услуги("Услуги"),
    Недвижимость("Недвижимость"),
    Вакансии("Вакансии"),
    Животные("Животные");

    public final String header;

    categoryType(String header) {
        this.header = header;
    }
}
