package sample.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class IndexPage {

    @FindBy(name = "content")
    public SelenideElement content;
    @FindBy(name = "post")
    public SelenideElement post;
    @FindBy(id = "echo")
    public SelenideElement echo;

    public static IndexPage open() {
        return Selenide.open("/", IndexPage.class);
    }
}
