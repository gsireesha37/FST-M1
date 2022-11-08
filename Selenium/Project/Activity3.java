import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/\n");
        String URL=driver.findElement(By.xpath("//*[@id=\"post-16\"]/header/div/img")).getAttribute("src");
        System.out.println("URL of the image is -"+URL);

    }

}
