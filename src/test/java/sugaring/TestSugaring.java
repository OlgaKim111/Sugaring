package sugaring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestSugaring extends Helper {

    @Test
    public void testSuga() throws Exception {
        itemAddToCart();
        openArticleCommonMistakes();
        isDisplayed();


        }

        @Test
        public void loginSuga() {
            //openWebsite();
            //logPass();
            Assert.assertEquals("Logout", driver.findElement(By.xpath("//ul[@class='links']//li[7]//a[1]")).getText());
        }


    @Test

    public void amountElem(){

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@class='cat_2']")).click();
        List<WebElement> amount=driver.findElements(By.xpath("//a[@class='product-grid-item__background-link']"));
        Assert.assertEquals(14, amount.size());

    }


    @Test
    public void addProductsToWishList() {
        //try {

            driver.findElement(By.xpath("//li[@class='cat_1']/a")).click();
            driver.findElement(By.xpath("//body[@class='product-category']/div[@id='body']/div[@id='page']/div[@id='shadow']/section/div[@id='container']/div[@class='container']/div[@class='row']/div[@class='span12']/div[@class='row']/div[@id='content']/div[@class='product-grid-board']/ul[@class='row']/li[1]/div[2]/div[3]/div[1]/a[1]/span[1]")).click();
            driver.findElement(By.xpath("//div[@class='wishlist']")).click();
            driver.findElement(By.xpath("//li[@class='cat_1']/a")).click();
            //driver.findElement(By.xpath("//body[@class='product-category']/div[@id='body']/div[@id='page']/div[@id='shadow']/section/div[@id='container']/div[@class='container']/div[@class='row']/div[@class='span12']/div[@class='row']/div[@id='content']/div[@class='product-grid-board']/ul[@class='row']/li[1]/div[2]/div[3]/div[1]/a[1]/span[1]")).click();
            //driver.findElement(By.xpath("//i[@class='icon-star']")).click();
            //driver.findElement(By.xpath("//li[@class='cat_1']/a")).click();
            //driver.findElement(By.xpath("//body[@class='product-category']/div[@id='body']/div[@id='page']/div[@id='shadow']/section/div[@id='container']/div[@class='container']/div[@class='row']/div[@class='span12']/div[@class='row']/div[@id='content']/div[@class='product-grid-board']/ul[@class='row']/li[18]/div[2]/div[3]/div[1]/a[1]/span[1]")).click();
            //driver.findElement(By.xpath("//i[@class='icon-star']")).click();
       // } catch (Exception e) {
        //    e.printStackTrace();
          //  System.out.println(e.getMessage());

        }
    }






















