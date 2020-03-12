package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        WebDriver driver = BrowserFactory.getDriver("chrome");

        //Below: Visit all the websites from step 3 and verify that they all have the same title.
        ArrayList<String> titles = new ArrayList<>();// to store all 3 titles of URLs here

        for (String eachLink : urls){
            driver.get(eachLink);
            Thread.sleep(3000);
            titles.add(driver.getTitle());
        }

        String title1= titles.get(0);
        String title2= titles.get(1);
        String title3= titles.get(2);
        if(title1.equals(title2) && title2.equals(title3)){
            System.out.println("All have SAME title!");
        }


        //Below: Verify that all URLs of all pages start with http://practice.cybertekschool.com
        for (String eachURL : urls ){
            driver.get(eachURL);
            Thread.sleep(3000);
            String currentPage = driver.getCurrentUrl();
            if(currentPage.startsWith("http://practice.cybertekschool.com")){
                System.out.println("URL of current page start with: http://practice.cybertekschool.com");
            }
        }

        driver.close();



    }
}
