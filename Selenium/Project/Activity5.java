import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/\n");
        driver.findElement(By.xpath("//*[@id=\"menu-item-24\"]/a")).click();
        String heading = driver.findElement(By.xpath("//h1")).getText();
        System.out.println("Heading of the second page is -" + heading);
        String Expected ="Jobs";

        if(heading.equals(Expected))
        {
            System.out.println("Page title as expected");
        }
        else
            System.out.println("Page title NOT as expected !");
    }

}






