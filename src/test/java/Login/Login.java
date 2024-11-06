package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;

import static Base_Class.browsers.*;

public class Login extends Browser {

    public static void main(String[] args) {

        edge_launch();
        open_URL("https://timf.imikrof.com");
        Login_TC_001();

    }

    public static void Login_TC_001() {

        WebElement Username=driver.findElement(By.name("user_name"));
        Username.clear();
        Username.sendKeys(" ");

        WebElement Password=driver.findElement(By.name("password"));
        Password.clear();
        Password.sendKeys(" ");

        WebElement Login=driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input"));
        Login.click();

    }

}