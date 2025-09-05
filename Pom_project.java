package Project;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.opentelemetry.context.Context;

public class Pom_project{
	
	WebDriver d;
	
	@FindBy(id="search_string")
	public static WebElement search;
	
	@FindBy(id="btnSearch")
	public static WebElement btnSearch;
	
	@FindBy(id="city_suggest")
	public static WebElement city;
	
	@FindBy(xpath="/html/body/div[4]/ul/li/a/b[2]")
	public static WebElement District;
	
	@FindBy(className="sidebarText")
	public static WebElement Gb;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[3]/div[1]/div[2]/div[2]/div/ul/li[1]/span")
	public static WebElement black;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/div/div[3]/div[1]/div[3]/div/ul/li[1]/span")
	public static WebElement Manufacture;
	
	@FindBy(id="search_string")
	public static WebElement Newsearch;
	
	@FindBy(xpath="/html/body/div[4]")
	public static WebElement Enter;
	
	@FindBy(id="dispid2853908507973")
	public static WebElement contact;
	
	@FindBy(id="t0901_Prodname0L")
	public static WebElement tex;
	
	@FindBy(id="t0901_nextbtnR")
	public static WebElement rightclick;
	
	@FindBy(id="t0901_prebtnR")
	public static WebElement leftclick;

	@FindBy(id="t0901_cls")
	public static WebElement close;
	
}



