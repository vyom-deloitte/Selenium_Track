package MiniAssignment3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.InputMismatchException;

public class Scenario3 {
    public static void main(String[] args) {
        String DriverPath = "C:\\SdetSoftwares\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", DriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Alerts(driver);
    }
    public static void Alerts(WebDriver driver){
        final String URL = "https://the-internet.herokuapp.com/";
        driver.get(URL);
        driver.findElement(By.xpath("//li//child::a[text()='JavaScript Alerts']")).click();//Clicking on JavaScript Alerts
        driver.findElement(By.xpath("//li//child::button[text()='Click for JS Prompt']")).click();//Clicking on Click for JS Prompt
        Alert a = driver.switchTo().alert();
        a.getText();
        a.sendKeys("Test");//Writing "Test" into the alert
        a.accept();
        String res = driver.findElement(By.xpath("//p[@id='result']")).getText();
        System.out.println(res);
        if(!Verify(res)){ //Verifying
            System.out.println("Wrong Input");
        }else{
            System.out.println("Correct Input");
        }
    }
    public static boolean Verify(String res) throws InputMismatchException {
        int i = 0;
        int n = res.length();
        while(i < n && !(res.charAt(i) == ':')){
            i++;
        }
        i += 2;
        String temp = res.substring(i,n);
        System.out.println(temp);
        if(!temp.equals("Test"))return false;

        return true;
    }
}
