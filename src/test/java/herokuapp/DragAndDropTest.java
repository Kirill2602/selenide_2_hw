package herokuapp;

import herokuapp.pages.DragAndDropPage;
import herokuapp.testbase.TestBase;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends TestBase {
    private static final String dragAndDropUrl = "/drag_and_drop";

    @Test
    public void herokuappTest() {

        new DragAndDropPage(dragAndDropUrl).checkHeader()
                .checkInitValues().dragAndDrop().checkAfterDragAndDrop();
    }
}
