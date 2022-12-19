package herokuapp.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropPage {
    public DragAndDropPage(String url) {
        open(url);
    }

    SelenideElement header = $("div h3"),
            blockA = $("#column-a"),
            blockB = $("#column-b");

    @Step("Проверка заголовка")
    public DragAndDropPage checkHeader() {
        header.shouldHave(text("Drag and Drop"));
        return this;
    }

    @Step("Проверка стартовых значений в блоках")
    public DragAndDropPage checkInitValues() {
        blockA.shouldHave(text("A"));
        blockB.shouldHave(text("B"));
        return this;
    }

    @Step("Перетаскиваем блок А в блок Б")
    public DragAndDropPage dragAndDrop() {
        blockA.dragAndDropTo(blockB);
        return this;
    }

    @Step("Проверка значений в блоках, после перетаскивания блока А в блок Б")
    public void checkAfterDragAndDrop() {
        blockA.shouldHave(text("B"));
        blockB.shouldHave(text("A"));
    }
}
