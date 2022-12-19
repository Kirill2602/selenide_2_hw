package githubselenide;

import com.codeborne.selenide.Configuration;
import githubselenide.pages.MainPage;
import githubselenide.testbase.TestBase;
import org.junit.jupiter.api.Test;


public class GithubTest extends TestBase {
    private static final String BASE_URL = "https://github.com/";

    @Test
    public void solutionTest() {
        new MainPage(BASE_URL).hoverByLink().clickByLink().checkHeaderText();
    }
}
