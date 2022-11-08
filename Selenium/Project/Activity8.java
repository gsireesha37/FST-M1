import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        //Username and password fields
        WebElement userName = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_pass"));
        // Passing values
        userName.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();
        if(driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed())
        {
            System.out.println("Successfully loggedIn");
        }
        else
        {
            System.out.println("Please enter Correct Details");
        }
        driver.close();
    }
}
