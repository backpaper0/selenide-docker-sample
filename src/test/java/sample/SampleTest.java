package sample;

import static com.codeborne.selenide.Condition.*;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

import sample.page.IndexPage;

public class SampleTest {

    @Test
    public void test() throws Exception {

        IndexPage indexPage = IndexPage.open();

        indexPage.echo.shouldBe(empty);

        Selenide.screenshot("init");

        indexPage.content.val("Hello, world!");
        indexPage.post.click();

        indexPage.echo.shouldBe(text("Hello, world!"));

        Selenide.screenshot("echo");
    }
}
