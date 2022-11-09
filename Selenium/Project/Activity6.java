import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"search_keywords\"]")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value=\"Search Jobs\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"position\"]//h3)[1]")));
        WebElement FirstElement = (WebElement) driver.findElement(By.xpath("(//div[@class=\"position\"]//h3)[1]"));
        FirstElement.click();
        driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/input")).click();
        String email= driver.findElement(By.xpath("//*[@id=\"post-5867\"]/div/div/div/div[3]/div/p/a")).getText();
        System.out.println("The email ID to apply for job is - "+email);
    }
}
