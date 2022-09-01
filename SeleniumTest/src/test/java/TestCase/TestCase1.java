package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.sql.DriverManager.println;

public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stfilip\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
       //String actual = driver.findElement(By.xpath("//span[@class='title']")).getText();
        //Assert.assertEquals(actual, expected, "No match!");

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("item_4_title_link")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        //back-to-products

        driver.findElement(By.id("back-to-products")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("shopping_cart_container")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("checkout")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Filip");
        driver.findElement(By.id("last-name")).sendKeys("Stefanovic");
        driver.findElement(By.id("postal-code")).sendKeys("34000");
        driver.findElement(By.id("continue")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.findElement(By.id("finish")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        boolean message = driver.findElement(By.xpath("//h2[@class='complete-header']")).isDisplayed();
        Assert.assertEquals(message, true, "No match!");

        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("logout_sidebar_link")).click();

        System.out.println("Test passed");
        driver.close();
    }
}
