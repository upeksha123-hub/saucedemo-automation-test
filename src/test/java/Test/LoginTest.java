

	package Test;

	
    import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

	import Pages.InventoryPage;
	import Pages.LoginPage;
	import Utilities.BaseTest;

	public class LoginTest extends BaseTest {

	    @Test
	    public void testLoginAndAddToCart() throws InterruptedException {
	        LoginPage loginPage = new LoginPage(driver);
			InventoryPage inventoryPage = new InventoryPage(driver);

	        loginPage.Login("standard_user", "secret_sauce");
	        Thread.sleep(2000); // wait just for visual (not recommended in real)

	        inventoryPage.addToCart();
	        inventoryPage.goToCart();
	        
	        WebElement cartItem = driver.findElement(By.className("inventory_item_name"));
	        Assert.assertEquals(cartItem.getText(), "Sauce Labs Backpack");

	        System.out.println("Test passed: Item added to cart and navigated to cart page.");
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

