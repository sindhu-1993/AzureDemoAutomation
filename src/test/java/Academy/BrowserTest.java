package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager; // Add this import

public class BrowserTest {

    @Test
    public void getData()
    {
        System.out.println("Hello Guys");
        WebDriverManager.chromedriver().setup(); // Use WebDriverManager to set up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahylshettyacademy.azurewebsites.net/webapp/");
        String text = driver.findElement(By.cssSelector("h1")).getText();
        System.out.println(text);
        Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
        driver.close();
    }
}
