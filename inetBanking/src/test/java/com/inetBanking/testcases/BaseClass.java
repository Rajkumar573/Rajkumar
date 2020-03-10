package com.inetBanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/v4/";
    public String UserNmae="mngr164225";
    public String Password="jahetAp";
    public static  WebDriver driver;
    

    @BeforeClass
    public void Setup() {
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
    driver = new ChromeDriver();
    
    }
    @AfterClass
    
    
    public void teardown() {
    	driver.quit();
    }
    
    
    }
