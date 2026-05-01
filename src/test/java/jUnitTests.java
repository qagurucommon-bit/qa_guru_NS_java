import data.categoryType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class jUnitTests {

    @BeforeEach
    void setUp() {

        open("https://youla.ru/");
    }

    @ValueSource(strings = {
            "ослик", "акула", "енотик"
    })
    @ParameterizedTest(name = "При поиске товара {0} отображается список с карточками")
    @Tag("BLOCKER")
    void searchResultsShouldNotBeEmpty(String toys) {
        $("#downshift-0-input").setValue(toys).pressEnter();
        $$("[data-test-component='ProductOrAdCard']")

                .shouldBe(sizeGreaterThan(0));
    }


    @CsvSource(value = {
            "Свадебный наряд , Объявления по запросу «Свадебный наряд»",
            "Свадебный костюм , Объявления по запросу «Свадебный костюм»"
    })
    @ParameterizedTest(name = "При поиске товара {0} в заголовке результатов поиска должно быть название {1}")
    @Tag("BLOCKER")
    void searchResultsShouldContainName(String searchDress, String expectedDescription) {
        $("#downshift-0-input").setValue(searchDress).pressEnter();
        $("h1").shouldHave(text(expectedDescription));
    }

    @EnumSource(categoryType.class)
    @ParameterizedTest(name = "При выборе каегории {0} отображается соответствующий заголовок")
    @Tag("BLOCKER")
    void correctHeaderCheck(categoryType CategoryType) {

        $("[data-test-action='CategoriesClick']").click();
        $$(".sc-hhOBVt").find(text(CategoryType.name())).click();
        $("h1").shouldHave(text(CategoryType.header));

    }

}