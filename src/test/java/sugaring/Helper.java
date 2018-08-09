package sugaring;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class Helper {
    public WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String login= "olgakimtx@gmail.com";
    String pass="Lotos";

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/andrejkim/IdeaProjects/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        openWebsite();
        logPass();
    }

    public void openArticleCommonMistakes() {
        driver.findElement(By.linkText("Articles")).click();
        driver.findElement(By.xpath("//div[@id='content']//h3[1]//div[1]")).click();
    }

    public void itemAddToCart() {
        driver.findElement(By.xpath("(//a[contains(text(),'Supplies')])[2]")).click();
        driver.findElement(By.xpath("//ul[@class='row']//li[13]//div[2]//div[3]//div[1]//div[2]//div[1]//a[1]//span[1]")).click();
        driver.findElement(By.xpath("//div[@id='cart']")).click();
    }

    public void openWebsite() {
        driver.get("https://sugaringfactory.com/");
    }

    public void isDisplayed() {
        driver.findElement(By.xpath("//a[contains(text(),'WholeSALE')]")).click();
        driver.findElement(By.xpath("//body[@class='product-category']/div[@id='body']/div[@id='page']/div[@id='shadow']/section/div[@id='container']/div[@class='container']/div[@class='row']/div[@class='span12']/div[@class='row']/div[@id='content']/div[@class='product-grid-board']/ul[@class='row']/li[2]/div[2]/div[3]/a[1]")).isDisplayed();

    }

    protected void logPass() {
        driver.findElement(By.xpath("//div[@class='toprow']//li[@class='login_h']//a")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.xpath("//div[@class='login-buttons']//a[@class='button-cont-right']")).click();

    }

    @AfterClass(alwaysRun = true)

    public void teardown() {

       // driver.quit();

    }


    }

