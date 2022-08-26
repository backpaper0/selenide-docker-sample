package sample.page;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class IndexPage {

	public void setContent(String content) {
		$(By.name("content")).val(content);
	}

	public void post() {
		$(By.name("post")).click();
	}

	public SelenideElement echo() {
		return $(By.id("echo"));
	}

	public static IndexPage open() {
		return Selenide.open("/", IndexPage.class);
	}
}
