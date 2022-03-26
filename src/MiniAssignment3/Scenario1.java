package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver();
        DoTask(driver);
    }
    public static void DoTask(WebDriver driver){
        final String url = "https://the-internet.herokuapp.com/";
        driver.get(url);// Launching the givrn url
        driver.findElement(By.xpath("//li//child::a[text()='Frames']")).click();//Clicking on frames
        driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();//Clicking on nested frames
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        WebElement title = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));//Getting title of Left Frame
        System.out.println(title.getText());
    }
}
