package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception {


        List<String> urls = Arrays.asList("https://www.luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com/", "https://www.westelm.com/");

        for ( String eachURL : urls){
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(eachURL);
            Thread.sleep(2000);
            String title = driver.getTitle().replaceAll(" ", "").toLowerCase();
            String currentURL = driver.getCurrentUrl();
            if(currentURL.contains(title)){
                System.out.println("URL contains Title, title<" + title +"> has no space, and all Char in lowercase!");
            } else {
                System.out.println("Test is failed! Because website title is: " + title);
            }
            driver.close();
        }

    }
}
