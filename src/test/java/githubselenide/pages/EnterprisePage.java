package githubselenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
    SelenideElement header = $(By.tagName("h1"));
    public void checkHeaderText() {
        header.shouldHave(text("Build like the best"));
    }
}
