package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    public void logintest() {
        driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
        driver.findElement(By.xpath ("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("cbinitish@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Nitish1!");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }


}
