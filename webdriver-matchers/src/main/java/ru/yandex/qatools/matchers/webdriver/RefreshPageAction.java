package ru.yandex.qatools.matchers.webdriver;

import org.hamcrest.Description;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.matchers.decorators.Action;

/**
 * @author Alexander Tolmachev starlight@yandex-team.ru
 *         Date: 28.02.13
 */
public class RefreshPageAction implements Action {
    private final WebDriver driver;

    public static RefreshPageAction pageRefresh(final WebDriver driver) {
        return new RefreshPageAction(driver);
    }

    public RefreshPageAction(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void perform() {
        driver.navigate().refresh();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("page refresh");
    }
}
