import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;


public class firsttest {

    @Test
    public void navigateyandex() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\negot\\IdeaProjects\\test2\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://yandex.ru/");
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        WebElement market = driver.findElement(By.linkText("Маркет"));
        market.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        WebElement searchField = driver.findElement(By.cssSelector("#header-search"));
        searchField.clear();
        searchField.sendKeys("Сотовые телефоны");
        WebElement searchButton =driver.findElement(By.cssSelector("body._12JXUyMYfl.fonts-loaded:nth-child(2) div._111XIPXNiH.main:nth-child(4) div._2lRCim4LLL:nth-child(4) div.oMEJSNSCob div._36kgbCia_Q._2_nBCUHdjM div._1GYM8vbLKv div._2zPWBCw2Ic div:nth-child(2) form._3dcusroRzn div._3sZwu9drAz:nth-child(4) > button._2wuJA52A2R._3kQ_UrpEXf._3Qvx14Vxa2._2pIvSHK-5e.BQHgUWjkfR.OYmR1s6scn._3Z0LezQuvR._2x51v2fAZ5._3RQEmYp37K._29kdR5rtZk._1F-1kgSFyP.q4GoUF_kNY"));
        searchButton.click();
        driver.findElement(By.cssSelector("body._12JXUyMYfl:nth-child(2) div._111XIPXNiH.main:nth-child(3) div.tamefSzMtq:nth-child(3) aside._2SUmDOuJb1 div._1dg-mVVfwq:nth-child(2) div._1vMoBTNhsM div._3U2TeVBOWN div:nth-child(1) div._2Wdscr8iIC > a.zsSJkfeAPw._2sWJL7-h2E.eD98J84A1g._36y1jOUHs5")).click();

       WebElement price_min = driver.findElement(By.cssSelector("body > div._111XIPXNiH.main > section > div:nth-child(2) > div > div > div._3aaVQypSph > div:nth-child(1) > div:nth-child(1) > div > div > div > div:nth-child(2) > input"));
       price_min.sendKeys("20000)");
       driver.findElement(By.cssSelector(("#\\31 53087"))).click();
        driver.findElement(By.cssSelector(("#\\31 0556303"))).click();
        driver.findElement(By.cssSelector(("#\\31 5292504"))).click();
        driver.findElement(By.cssSelector(("#\\34 59710"))).click();
        driver.findElement(By.cssSelector(("#\\31 5884616"))).click();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("window.scrollBy(0,1000)");
       driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > section > div:nth-child(2) > div > div > div._3aaVQypSph > div:nth-child(1) > div:nth-child(13)"))).click();
       driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > section > div:nth-child(2) > div > div > div._3aaVQypSph > div:nth-child(1) > div:nth-child(13) > div > div > div > div:nth-child(1) > input"))).sendKeys("3");
       driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > section > div:nth-child(2) > div > div > div:nth-child(3) > div > div > a._2qvOOvezty._3qN-vKmEan._1Rc6LxE3Tr"))).click();
       String firstElement = driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > div:nth-child(4) > div.tamefSzMtq > div:nth-child(4) > div > div:nth-child(1) > div > div > div > article:nth-child(1) > div._1OAvzJPfIW > div._1B9w_GzQuM > h3 > a"))).getAttribute("href");

       driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > div:nth-child(4) > div.tamefSzMtq > div:nth-child(3) > div > div._3_l6GZZNkG > button:nth-child(7)"))).click();
       driver.get(firstElement);

       String value = driver.findElement((By.cssSelector("body > div._111XIPXNiH.main > div:nth-child(6) > div > div:nth-child(4) > div > div._1_OV2Lbe5i > div > div > div.pDcI-PvSUI > div.f5NETPBdlL > div._3tPFJYQO2f.Er3sMgmCMf._1NfPDrAuri > span"))).getText();
       System.out.print(value);
       driver.quit();


















    }


}

