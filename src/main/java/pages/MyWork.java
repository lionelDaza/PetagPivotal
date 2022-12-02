package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.AssertJUnit.assertEquals;

public class MyWork extends AbstractBasePage{


    @FindBy(css= "div[data-type=\"my_work\"] div.StoryPreviewItem__clickToExpand span[data-aid=\"StoryPreviewItem__title\"]")
    private WebElement storyMyWork;

    public void verifyStoryInMyWork(String storyName) {
        assertEquals(storyMyWork.getText(),storyName);
    }
}
