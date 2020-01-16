package Com.AutomationFramework.GherkinImplementation;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.AutomationFramework.Browser_Manager.launch_browser;
import com.AutomationFramework.ReportManager.Reports;

import Com.Aviva.Aviva_Project.No_of_Links;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition_class {
// Global declarations
	Scenario s;
	Properties p; 
	File f;
	FileReader fr;
	
@Before()
public void before(Scenario s) throws Exception {
	this.s = s; // When Scenario s is equal to to current class s then This Code will code
	p = new Properties(); // initializing Property files
	f = new File("E:\\enag\\Aviva_Project_final\\Property_files\\Property.properties"); // Giving Property file path -> to open file
	fr = new FileReader(f); // reading data from file
	p.load(fr); // loading that data to property file to use in required methods/places
}

@Given("^user will open Browser with \"([^\"]*)\"$")
public void user_will_open_Browser_as(String arg1) throws Throwable {
	// Browser_name, Property files data passing as arguments to open_browser()method in Launch browser
	//launch_browser is a Singleton Class (which calls itself)
	launch_browser.getInstace().open_browser(arg1, p.getProperty("cdpath"));
	
}
@When("^user will enter \"([^\"]*)\" text into Google text box$")
public void user_will_enter_text_into_Google_text_box(String arg1) throws Throwable {
 // Entering text into Google Text Field
	launch_browser.getDriver().findElement(By.name("q")).sendKeys(arg1 + Keys.ENTER);
	// launch_browser.getDriver() ---> Calling driver obj from launch_browser class
}
@When("^user will wait untill Search results will display$")
public void user_will_wait_untill_Search_results_will_display() throws Throwable {
	  Thread.sleep(10000); //fixed wait to load page
// if u want to change it as Webdriverwait u can change   
}

@When("^user will get \"([^\"]*)\" th link text and print it in console$")
public void user_will_get_th_link_text_and_print_it_in_console(String arg1) throws Throwable {
	No_of_Links.getInstace().get_specfic_link_text(arg1);
}

@Then("^user will get Number of links in page and display count in console$")
public void user_will_get_Number_of_links_in_page_and_display_it_in_console() throws Throwable {
	No_of_Links.getInstace().get_Count_of_links();
}

@When("^User will get Current page URL and compare with Aviva site URL$")
public void user_will_get_Current_page_URL_and_compare_with_Aviva_site_URL() throws Throwable {
	No_of_Links.getInstace().Compare_links_with_Aviva(p.getProperty("Aviva_url"));
}
@When("^User will save reports$")
public void user_will_save_reports() throws Throwable {
	Reports.getinstance().test_pass();
}
@Then("^user will close site$")
public void user_will_close_site() throws Throwable {
   launch_browser.getInstace().Close_browser();
}




}
