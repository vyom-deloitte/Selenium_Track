package MiniAssignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsProblem1 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver();
        final String URL = "https://www.phptravels.net/hotels";
        driver.get(URL);

        driver.findElement(By.className("logo"));//Locating Logo
        driver.findElement(By.xpath("//div[@class=\"logo\"]//img[@alt=\"logo\"]"));//Writing Xpath for logo


        driver.findElement(By.linkText("home"));//Locating Home
        driver.findElement(By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/\"]"));//Writing Xpath for Home

        driver.findElement(By.linkText("flights"));//Locating Flights
        driver.findElement(By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/flights\"]"));//Writing Xpath for Flights

        driver.findElement(By.linkText("Tours"));//Locating Tours
        driver.findElement(By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"https://www.phptravels.net/tours\"]"));//Writing Xpath for Tours

        driver.findElement(By.linkText("Company "));//Locating Company
        driver.findElement(By.xpath("//div[@class=\"main-menu-content\"]//a[@href=\"company\"]"));//Writing Xpath for Company

        driver.findElement(By.className("theme-btn theme-btn-small waves-effect"));//Locating Login Button
        driver.findElement(By.xpath("//a[@class=\"theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect\"]"));//Writing Xpath for Login

        driver.findElement(By.xpath("//a[text()='Signup' and @class='theme-btn theme-btn-small waves-effect']"));//Writing Xpath for SignUp


    }
}
