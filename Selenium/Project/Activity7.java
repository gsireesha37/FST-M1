import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//a[@href=\"https://alchemy.hguy.co/jobs/post-a-job/\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"user_login\"]")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id=\"user_pass\"]")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id=\"wp-submit\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"job_title\"]")).sendKeys("Test Specialist");
        driver.findElement(By.xpath("//input[@id=\"job_location\"]")).sendKeys("Mumbai");
        Select select = new Select(driver.findElement(By.xpath("//select[@id=\"job_type\"]")));
        select.selectByVisibleText("Internship");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.xpath("//*[@id=\"tinymce\"]")).sendKeys("Anything Anything Anything Anything ");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@class=\"button\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"job_preview_submit_button\"]")).click();
        driver.findElement(By.xpath("//a[@href=\"https://alchemy.hguy.co/jobs/jobs/\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"position\"]//h3)[10]")));
        System.out.println("One");
        WebElement FirstElement = (WebElement) driver.findElement(By.xpath("(//div[@class=\"position\"]//h3)[10]"));
        String jobname = FirstElement.getText();
        System.out.println("Job name is " +jobname);
        boolean isequal = jobname.equals("Test Specialist");
        Assert.isTrue(isequal,"Not verified");
        driver.close();
    }
}
