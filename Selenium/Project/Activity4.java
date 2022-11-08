import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/\n");
        String Header2=driver.findElement(By.xpath("//h2")).getText();
        System.out.println("Header 2 is -" + Header2);
        String temp ="Quia quis non";
        if(Header2.equals(temp))
        {
            System.out.println("Title matches.Closing browser");
            driver.close();
        }
        else
            System.out.println("Title do not match");


    }
}
