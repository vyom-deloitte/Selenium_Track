package MiniAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario2 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("headless")); //Executing scenario 1 in headless mode
       // driver.manage().window().maximize(); //Maximizing the browser window
        Navigate(driver);
    }
    public static void Navigate(WebDriver driver){
        final String url = "https://phptravels.com/demo";
        driver.get(url);
        WebElement title = driver.findElement(By.xpath("//*[@id=\"PHPTRAVELS\"]"));
        if(check(title)){
            System.out.println("Pass,Title contains PHPTRAVELS");
        }else{
            System.out.println("Fail,Title does not contains PHPTRAVELS");
        }
        Login(driver);
    }
    public static void Login(WebDriver driver){
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
        driver.navigate().to("https://phptravels.org/login");
        WebElement loginTitle = driver.findElement(By.xpath("//a[@class='logo visible-xs visible-sm visible-md']//child::img[@title='PHPTRAVELS']"));
        if(driver.getTitle().equals("PHPTRAVELS")){
            System.out.println("Pass, Title in step 4 and step 5 is same");
        }else{
            System.out.println("Fail,Title in step 4 and step 5 is not same");
        }
        driver.navigate().back();// Navigating to previous tab
        System.out.println(driver.getCurrentUrl());//Printing URL of current page
        driver.findElement(By.xpath("//a[text()='Pricing']")).click();
        driver.navigate().back();//navigating backwards
        driver.navigate().refresh();//Refreshing the page
        driver.quit();
    }
    private static boolean check(WebElement title){
        if(title.getText().equals("PHPTRAVELS")){
            return true;
        }
        return false;
    }
}
