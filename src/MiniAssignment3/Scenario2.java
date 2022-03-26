package MiniAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       DragAndDrop(driver);
    }
    public static void DragAndDrop(WebDriver driver){
        final String url= "https://jqueryui.com/droppable/";
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions act = new Actions(driver);
        act.dragAndDrop(from,to).build().perform();
    }
}
