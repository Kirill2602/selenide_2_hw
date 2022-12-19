package githubselenide.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement solutionLink = $(withText("Solutions")),
            enterpriseLink = $(byPartialLinkText("Enterprise"));

    public MainPage(String url) {
        open(url);
    }

    public MainPage hoverByLink() {
        solutionLink.hover();
        return this;
    }

    public EnterprisePage clickByLink() {
        enterpriseLink.click();
        return new EnterprisePage();
    }
}
