import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String Header = driver.findElement(By.xpath("//h1[@class=\"entry-title\"]")).getText();
        System.out.println("Header1 is : " +Header);
        String Expected = "Welcome to Alchemy Jobs";
        if (Header.equals(Expected)){
            System.out.println("Title Matched");
        }
        else {
            System.out.println("Title not Matched");
        }
        driver.close();



    }
}
