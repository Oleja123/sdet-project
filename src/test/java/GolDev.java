import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class GolDev {
    private final Logger logger = LoggerFactory.getLogger(GolDev.class);

    @BeforeClass
    void init(){
        logger.info("Пошла потеха");
        Configuration.baseUrl = "https://goldev.org/";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
    }

    @DataProvider(name = "header")
    public static Object[][] headerProvider(){
        return new Object[][]{
                {"О компании","/#about"},
                {"Проекты","/#projects"},
                {"Услуги","/#services"},
                {"Процесс работы","/#process"},
                {"Контакты","/#contacts"}
        };
    }

    @DataProvider(name = "services")
    public static Object[] servicesProvider(){
        return new Object[]{
                "/analytics",
                "/web-dev",
                "/frontend",
                "/backend",
                "/support",
        };
    }

    @Test(description = "Тестируем вкладки хэдера", dataProvider = "header")
    void test1(String text, String url){
        open("/");
        $(By.xpath(String.format("//header//a[text()='%s']", text))).click();
        webdriver().shouldHave(urlContaining(url));
        sleep(3000);
    }

    @Test(description = "Тестируем вкладки услуг", dataProvider = "services")
    void test2(String url){
        open("/");
        $(By.xpath(String.format("//a[@href='%s']", url))).click();
        $(By.xpath("//div[@class='offer-section__items']")).shouldBe(visible);
        webdriver().shouldHave(urlContaining(url));
        sleep(4000);
    }
}
