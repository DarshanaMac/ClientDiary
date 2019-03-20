import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.thoughtworks.gauge.screenshot.*;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {
    WebDriver driver = new ChromeDriver();



    @Step("Create User  profile")
    public void CreateProfile() {
        driver.navigate().to("https://Storefront:shaver123@development-web-shavershop.demandware.net/s/Shaver_Shop_au/register");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_firstname")).sendKeys("darshana");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_lastname")).sendKeys("konara");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_email")).sendKeys("thaveeshadarshana11@gmail.com");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_emailconfirm")).sendKeys("thaveeshadarshana11@gmail.com");
        driver.findElement(By.cssSelector("#RegistrationForm>fieldset:nth-of-type(2)>div:nth-of-type(3)>input")).sendKeys("User@123@gmail.com");
        driver.findElement(By.cssSelector(" #RegistrationForm>fieldset:nth-of-type(2)>div:nth-of-type(4)>input")).sendKeys("User@123@gmail.com");
        driver.findElement(By.cssSelector(" #RegistrationForm>fieldset:nth-of-type(2)>div:nth-of-type(7)>button")).click();
    }

    @Step("Navigate to Product Details Page")
    public void NavigateToProductDetailsPage() {
        driver.navigate().to("https://Storefront:shaver123@development-web-shavershop.demandware.net/s/Shaver_Shop_au/wahl/salon-series-v5000-hair-clipper-009123.html");
        driver.quit();
    }

    @Step("Create User  profile with IncorrectData")

    public void CreateProfileInvalid() {
        driver.navigate().to("https://Storefront:shaver123@development-web-shavershop.demandware.net/s/Shaver_Shop_au/register");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_firstname")).sendKeys("darshana");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_lastname")).sendKeys("konara");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_email")).sendKeys("thaveeshadarshana11@gmail.com");
        driver.findElement(By.cssSelector("#dwfrm_profile_customer_emailconfirm")).sendKeys("thaveeshadarshana11@gmail.com");
        driver.findElement(By.cssSelector("#RegistrationForm>fieldset:nth-of-type(2)>div:nth-of-type(3)>input")).sendKeys("User@123");
        driver.findElement(By.cssSelector(" #RegistrationForm>fieldset:nth-of-type(2)>div:nth-of-type(4)>input")).sendKeys("User");
        driver.findElement(By.cssSelector(" #oodo")).click();

        driver.quit();
    }

}
