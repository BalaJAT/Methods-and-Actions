package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {
	
	public static void main(String[] args) {
        // Set the path to your Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\Automation directory\\TestAutomation\\drivers\\msedgedriver.exe");

        // Open Edge browser
        WebDriver driver = new EdgeDriver();

        // Navigate to facebook website 
        driver.get("https://www.facebook.com/");
       
        //click on the new account button 
        WebElement Newaccountbutton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        Newaccountbutton.click();
        
        //pop up windows time sleep is implemented
        try {
            Thread.sleep(5000); // You might want to use a more robust method for waiting in a real-world scenario
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        //send value for first name
        WebElement firstname=driver.findElement(By.name("firstname"));
       firstname.sendKeys("vijay");
       //send value for last name
       WebElement lastname=driver.findElement(By.name("lastname"));
       lastname.sendKeys("bala");
     //send value for emailid 
       WebElement email=driver.findElement(By.name("reg_email__"));
       email.sendKeys("vijaybala19595@gmail.com");
     //send value for reenter emailid 
       WebElement emailconfirmation=driver.findElement(By.name("reg_email_confirmation__"));
       emailconfirmation.sendKeys("vijaybala19595@gmail.com");
     //send value for password
       WebElement password=driver.findElement(By.name("reg_passwd__"));
       password.sendKeys("karthick@1");
     //select birth date from drop down
       WebElement birthday=driver.findElement(By.name("birthday_day"));
       Select select=new Select(birthday);
       select.selectByVisibleText("11");
     //select birth month from drop down
       WebElement birthmonth=driver.findElement(By.name("birthday_month"));
       Select month=new Select(birthmonth);
       birthmonth.sendKeys("may");
     //select birth year from drop down
       WebElement birthyear=driver.findElement(By.name("birthday_year"));
       Select year=new Select(birthyear);
       birthyear.sendKeys("1985");
     //select sex from radio button
       WebElement male =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
       male.click();
     //click on the sign up button 
       WebElement signup =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
       signup.click();
	}
}
