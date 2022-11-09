import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String [] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String title = driver.getTitle();
        System.out.println("The title of page is " +title );
        String Expected = "Alchemy Jobs – Job Board Application";
        if (title.equals(Expected)){
            System.out.println("Title Matched");
        }
        else {
            System.out.println("Title not Matched");
        }


        driver.close();

    }
}
