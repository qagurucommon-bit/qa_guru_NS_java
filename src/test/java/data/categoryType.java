package data;

public enum categoryType {
    Услуги("Услуги"),
    Недвижимость("Недвижимость"),
    Животные("Животные"),
    Вакансии("Вакансии");

    public final String header;

    categoryType(String header) {
        this.header = header;
    }
}
