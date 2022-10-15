package com.example.saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class SauceDemo {

    WebDriver driver;

    public WebDriver setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1740, 680));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");

        return null;
    }
// Поиск по name, id и css value (id)
    @Test
    public void Authorization () {
        WebDriver driver = setUp();
        WebElement UserName = driver.findElement(By.name("user-name"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[value='Login']")).click(); // #login-button
        WebElement RegisterButton = driver.findElement(By.cssSelector("input[value='Login']"));
        Assert.assertTrue("User log in website", RegisterButton.isDisplayed());
    }
// Поиск по classname
    @Test
    public void AddToCart () {
            WebDriver driver = setUp();
            WebElement UserName = driver.findElement(By.name("user-name"));
            UserName.sendKeys("standard_user");
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("secret_sauce");
            driver.findElement(By.cssSelector("input[value='Login']")).click();
            WebElement AddToCart = driver.findElement(By.className("btn btn_primary btn_small btn_inventory"));
        }
    @Test
    public void Test3 () {
        WebDriver driver = setUp();
        WebElement UserName = driver.findElement(By.name("user-name"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        driver.findElement(By.className("btn btn_primary btn_small btn_inventory")).click();
        driver.findElement(By.className("shopping_cart_link")).click();

    }
    @Test
    public void Test4 () {
        WebDriver driver = setUp();
        WebElement UserName = driver.findElement(By.name("user-name"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        WebElement Cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    }
    @Test
    public void Test5 () {
        WebDriver driver = setUp();
        WebElement UserName = driver.findElement(By.name("user-name"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        WebElement Swag = driver.findElement(By.xpath("//meta[text()='Sauce Labs Swag Labs app']"));

        }

    @Test
    public void Test6 () {
        WebDriver driver = setUp();
        WebElement UserName = driver.findElement(By.name("user-name"));
        UserName.sendKeys("standard_user");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("secret_sauce");
        WebElement Swag = driver.findElement(By.xpath("//meta[contain(text()='Sauce')]"));
    }
        @Test
        public void Test7 () {
            WebDriver driver = setUp();
            WebElement UserName = driver.findElement(By.name("user-name"));
            UserName.sendKeys("standard_user");
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("secret_sauce");
            WebElement Cart = driver.findElement(By.xpath("//a[contains(@class='shopping')]"));
// By.xpath("//tag[contains(@attribute,'text')]");
        }

    //efweorkfowijeriofuhwerfgwuerygfiwueyrgf

     @AfterMethod(alwaysRun  = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();

        }

    }

}


