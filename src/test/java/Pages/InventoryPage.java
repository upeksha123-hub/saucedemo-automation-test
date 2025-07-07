package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class InventoryPage {
	    WebDriver driver;
       
	    By BackPack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	    By addToCartBtn = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
	    By cartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

	    public InventoryPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
       public void findItem(String Bag) {
	    	
	    	driver.findElement(BackPack).sendKeys(Bag);
	    }

	    public void addToCart() {
	        driver.findElement(addToCartBtn).click();
	    }

      
	    public void goToCart() {
	        driver.findElement(cartIcon).click();
	    }
	}



