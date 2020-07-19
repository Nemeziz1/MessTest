package ru.yandex;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FirstTest {

    @Test
    public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Andrey/Desktop/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://passport.yandex.ru/auth");

        driver.findElement(By.id("passp-field-login")).sendKeys("koryakina.marina2018");
        driver.findElement(By.id("passp-field-login")).sendKeys(Keys.RETURN);


        driver.findElement(By.id("passp-field-passwd")).sendKeys("qwerty1324");
        driver.findElement(By.id("passp-field-passwd")).sendKeys(Keys.RETURN);


        driver.findElement(By.cssSelector("#root > div > div.dheader > div.dheader-user > div > div > a.user-account.user-account_has-accent-letter_yes.user-account_has-ticker_yes.user2__current-account")).click();


        driver.findElement(By.cssSelector("body > div.popup2.popup2_view_classic.popup2_theme_normal.popup2_direction_bottom-right.popup2_visible_yes.popup2_target_anchor.user2__popup > ul > ul > li:nth-child(1) > a")).click();


        driver.findElement(By.className("mail-ComposeButton-Text")).click();


        driver.findElement(By.className("composeYabbles")).sendKeys("korjakin21@yandex.ru");


        driver.findElement(By.xpath("//*[@id=\"nb-1\"]/body/div[2]/div[10]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/div[3]/form/div/div/input")).sendKeys("QA");


        driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/div/div")).sendKeys("Обеспечение качества");


        driver.findElement(By.xpath("//*[@id=\"nb-1\"]/body/div[2]/div[10]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/button")).click();
    }
}
