package Com.Aviva.Aviva_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.AutomationFramework.Browser_Manager.launch_browser;
import com.AutomationFramework.ReportManager.Reports;

import junit.framework.Assert;

public class No_of_Links extends launch_browser{
	//Extends ---> is a relation in java - Inheritance
	//Here By using inheritance concept, i'm calling driver obj
	
	static No_of_Links instance = null; 
// i'm Making class Name as Static & Creating Instance... for changing this class as singleton class
		public static No_of_Links getInstace() 
		{
			if (instance == null) 
			{
				instance = new No_of_Links();
			}
			return instance;
		}
			
public void get_Count_of_links() {
	// getting all //a tag links count and printing that
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println("Total No.of link's Count is -->  " +links.size());
}

public void get_specfic_link_text(String link_no) throws Throwable{
	int no = Integer.parseInt(link_no);
	List<WebElement> links = driver.findElements(By.xpath("//a")); //taking all "//a" tags list
	Thread.sleep(2000);
	String link_text = links.get(no).getText();
	if(link_text.isEmpty()) {
		System.out.println("For "+no+"th link- text not available");
		Reports.getinstance().test_fail();
	}
	else {
	System.out.println("This is the "+no+"th link text--> "  +link_text); //printing 5th link text
	}
	Reports.getinstance().test_pass();
	}
		
		
public void Compare_links_with_Aviva(String url) {
	String current_URL = launch_browser.getDriver().getCurrentUrl();
	try {
	if(current_URL.equalsIgnoreCase(url)) {
	Reports.getinstance().test_pass();
	}
	}
	catch (Exception ex) {
		Reports.getinstance().test_fail();
	}
	}

	
	
	
	
	
	
	
	
	

}
