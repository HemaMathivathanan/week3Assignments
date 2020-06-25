package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		//to click on sort date
	//	driver.findElementByXPath("//input[contains(@title,'Select Departure')]").click();
		Thread.sleep(3000);
		
		
	    driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		driver.findElementById("txtStationFrom").clear();
		
		driver.findElementById("txtStationFrom").sendKeys("Chennai");
		
		driver.findElementByXPath("(//strong[text()='Chennai'])[3]").click();
		
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Madurai");
		
		driver.findElementByXPath("(//strong[text()='Madurai'])[2]").click();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		List<WebElement> elements = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2] ");
	//	List<WebElement> elements = driver.findElementsByXPath("//td[@style=';']//a");
		List <String> list = new ArrayList< String >();
		
		for (int i = 0; i < elements.size(); i++) {
			WebElement ele = elements.get(i);
			list.add(ele.getText());
		    System.out.println(list.get(i));
			
		} 
		
		
		  System.out.println(list.size());
		  
		  Set<String> set = new LinkedHashSet<String>(); set.addAll(list);
		  System.out.println(set); System.out.println(set.size());
		  
		  if (list.size()==set.size()) { System.out.println(" no duplicates "); } else
		  { System.out.println( " duplicates in train name "); }
		  
		 driver.close();
		
	
		
	}
	
	
	
}
