import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity9
{

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");

        WebElement userName = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_pass"));
        WebElement login = driver.findElement(By.id("wp-submit"));

        userName.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        login.click();

        WebElement JobListings = driver.findElement(By.xpath("//div[contains(text(), 'Job Listings')]"));
        JobListings.click();
        WebElement AddNew = driver.findElement(By.xpath("//a[contains(@class, 'page-title-action')]"));
        AddNew.click();

        WebElement next = driver.findElement(By.xpath("//button[@aria-label=\"Close dialog\"]"));
        next.click();

        WebElement position = driver.findElement(By.id("post-title-0"));
        position.sendKeys("Test_Specialist");

        WebElement jobData = driver.findElement(By.xpath("//h2[contains(@class, 'hndle ui-sortable-handle')]"));
        jobData.click();

        driver.findElement(By.xpath("//*[@id=\"_company_website\"]")).sendKeys("www.ibm.com");
        driver.findElement(By.xpath("//*[@id=\"_job_location\"]")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//*[@id=\"_company_name\"]")).sendKeys("IBM");
        driver.findElement(By.xpath("//*[@id=\"_company_tagline\"]")).sendKeys("Lets create");
        driver.findElement(By.xpath("//*[@id=\"_filled\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"_featured\"]")).click();

    }

}










