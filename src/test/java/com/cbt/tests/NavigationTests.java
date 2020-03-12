package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    static WebDriver driver;

    public static void main(String[] args) throws Exception {

        chromeTest();
        firefoxTest();
        safariTest();

    }

    public static void chromeTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.ca/");
        Thread.sleep(2000);
        String googleTitle = driver.getTitle();


        driver.navigate().to("https://etsy.com");
        Thread.sleep(3000);
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(3000);
        StringUtility.verifyEquals("Google", googleTitle);

        driver.navigate().forward();
        Thread.sleep(3000);
        String expectedEtsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        StringUtility.verifyEquals(expectedEtsyTitle, etsyTitle);

        driver.close();

    }

    public static void firefoxTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.google.ca/");
        Thread.sleep(2000);
        String googleTitle = driver.getTitle();


        driver.navigate().to("https://etsy.com");
        Thread.sleep(3000);
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(3000);
        StringUtility.verifyEquals("Google", googleTitle);

        driver.navigate().forward();
        Thread.sleep(3000);
        String expectedEtsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        StringUtility.verifyEquals(expectedEtsyTitle, etsyTitle);

        driver.close();

    }

    public static void safariTest() throws Exception{
        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://www.google.ca/");
        Thread.sleep(2000);
        String googleTitle = driver.getTitle();


        driver.navigate().to("https://etsy.com");
        Thread.sleep(3000);
        String etsyTitle = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(3000);
        StringUtility.verifyEquals("Google", googleTitle);

        driver.navigate().forward();
        Thread.sleep(3000);
        String expectedEtsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        StringUtility.verifyEquals(expectedEtsyTitle, etsyTitle);

        driver.close();

    }
}
