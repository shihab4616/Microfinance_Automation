package Base_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers {
    public static WebDriver driver;
    public static void main(String[] args) {

        //chrome_launch();
        //chrome_close();
        firefox_launch();
        //edge_launch();

    }

    public static void chrome_launch() {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
    }

    public static void firefox_launch() {
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
    }

    public static void edge_launch() {

        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }

    public static void chrome_close() {

        driver.close();

    }

    public static void open_URL(String URL)
    {
        driver.get(URL);

    }
}
