package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

import java.util.List;


public class GoogleSearchPage extends DriverUtil {

    By SearchBox = By.name("q");
    By AgreeCookieButton = By.xpath("/html/body/div/c-wiz/div[2]/div/div/div/div/div[2]/form/div/span/span");
    By ImageButton = By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a");
    By TotalNumberOfCars = By.name("\"result-stats\"");
    By NumberOfGumtreeLinks = By.linkText("www.gumtree.com");
    By GumtreeTotalNumbersOfCars = By.xpath("//div[@id='srp-results-header-main']//h1[@class='h1-responsive srp-desktop-title']");


    public void launchUrl(String BaseUrl){
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    public void SearchForCarInLondon(String CarsInLondon){

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(SearchBox)).sendKeys(CarsInLondon);
        driver.findElement(SearchBox).sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[src^='https://consent.google.com']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"introAgreeButton\"]/span/span"))).click();

   /*     try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Agree."));
        } catch (Exception e)
        {System.out.println("Cookie Alert not Present");

        } */
         // wait.until(ExpectedConditions.elementToBeClickable(AgreeCookieButton)).click();

    }

    public void ValidateResultsPage(){
        Boolean status = driver.findElement(ImageButton).isDisplayed();
        if (status)
        {System.out.println("Search Page is Displayed");
        }else {System.out.println("Search Page not Displayed");}
    }

    public void ValidateNoOfGumtree(){

    }

    public void NavigateToAllGumtreePages(){

    }

    public void ValidatePageTitle(){

    }

    public void VerifyNumberGreaterThan0(){

    }
}
