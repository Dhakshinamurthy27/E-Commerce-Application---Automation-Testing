package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Final {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Testing\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.indiamart.com/?srsltid=AfmBOoqLbbZUR4iHnrOVNikGbygwTM2yf7LdSwcbxGoZidBgOlMSHA0k");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)d;
		Actions a=new Actions(d);
		PageFactory.initElements(d, Pom_project.class);
		PageFactory.initElements(d, TestNGproject.class);
		WebElement s=Pom_project.search;
		s.sendKeys("Mobile");
		Pom_project.btnSearch.click();
		Pom_project.city.sendKeys("Chennai");
		Pom_project.District.click();
		Pom_project.Gb.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		Pom_project.black.click();
		Pom_project.Manufacture.click();
		WebElement e=Pom_project.Newsearch;
		s.clear();
		e.sendKeys("new mobiles");
		Pom_project.btnSearch.click();
		Pom_project.city.sendKeys("Bangalore");
		Pom_project.Enter.click();
		WebElement con=Pom_project.contact;
		con.click();
	
		WebElement b=Pom_project.rightclick;
		b.click();
		Thread.sleep(2000);
		WebElement left = Pom_project.leftclick;
		left.click();
		Thread.sleep(2000);
		Pom_project.close.click();
		e.clear();
		e.sendKeys("Laptops and Mobiles");
		Pom_project.btnSearch.click();
		
		Thread.sleep(5000);
		d.close();
		
		
	}
}