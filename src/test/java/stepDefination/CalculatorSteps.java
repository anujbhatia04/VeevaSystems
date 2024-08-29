// src/test/java/com/veeva/steps/CalculatorSteps.java

package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CalculatorSteps {

    private WebDriver driver;

    @Given("I am on the carbohydrate calculator page")
    public void i_am_on_the_carbohydrate_calculator_page() {
      
 

    	  WebDriverManager.firefoxdriver().setup();
    	  
        driver = new  FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/carbohydrate-calculator.html"); 
    }

    @When("I enter age as {string}")
    public void i_enter_age_as(String age) {
        WebElement clear = driver.findElement(By.xpath("//input[@value='Clear']"));
        clear.click(); 
        WebElement ageInput = driver.findElement(By.name("cage"));
        ageInput.sendKeys(age);
    }
    
    @When("I enter height as {string}")
    public void i_enter_height_as(String height) {
        WebElement heightInput = driver.findElement(By.name("cheightmeter"));
        heightInput.sendKeys(height);
    }

    @When("I enter weight as {string}")
    public void i_enter_weight_as(String weight) {
        WebElement weightInput = driver.findElement(By.name("ckg"));
        weightInput.sendKeys(weight);
    }

    @When("I select gender as {string}")
    public void i_select_gender_as(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            WebElement genderMale = driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[2]/td[2]/label[1]/span"));
            genderMale.click();
        } else if (gender.equalsIgnoreCase("Female")) {
            WebElement genderFemale = driver.findElement(By.id("genderFemale"));
            genderFemale.click();
        }
    }


    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonLabel) {
    	WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        
    	calculateButton.click();
        
      driver.close();
    }

   
}
