package MiniAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsProblem2 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver();
        final String url = "https://www.phptravels.net/hotels";
        driver.get(url);
        driver.findElement(By.xpath("//input[@name='checkin']"));
        driver.findElement(By.xpath("//input[@name='checkout']"));
        driver.findElement(By.xpath("//i[@class='la la-minus']//following::i[3]"));
        driver.findElement(By.xpath("//i[@class='la la-plus']//following::i[3]"));
        driver.findElement(By.xpath("//i[@class='la la-minus']//following::i[4]"));
        driver.findElement(By.xpath("//i[@class='la la-plus']//following::i[4]"));

    }
}
