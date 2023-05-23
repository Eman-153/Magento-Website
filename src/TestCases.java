import java.nio.channels.Selector;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCases extends Parameter {

	@BeforeTest 
	public void beforTesting() {
		driver.get(website);
		driver.manage().window().maximize();
		
	}
	
//	@Test()
//	public void Signup() {
//		WebElement signupButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a"));
//		signupButton.click();
//		
//		WebElement FirstNameField = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
//		FirstNameField.sendKeys(FirstName);
//		WebElement LastNameField = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
//		LastNameField.sendKeys(LastName);
//		WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
//		EmailField.sendKeys(Email);
//		WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		PasswordField.sendKeys(Password);
//		WebElement ConfPasswordField = driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
//		ConfPasswordField.sendKeys(Password);
//		WebElement CreatButton = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
//		CreatButton.click();
//		WebElement welcomesection = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
//		String welcomeMsg = welcomesection.getText();
//		
//		myassert.assertEquals(welcomeMsg.contains("Thank you for registering with Main Website Store."), true);
//	
//	}
	
//	@Test()
//	public void searchItems() {
//		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		String [] ItemsList = {"Jacket"," t-shirt","jeans for men","jeans for women","pants"};
//		int itemsIndex = rand.nextInt(0,5);
//		String selectedItem = ItemsList[itemsIndex];
//		searchBar.sendKeys(selectedItem);
//		searchBar.submit();
//		System.out.println("The Selected Item "+selectedItem);
//	}
	
//	@Test( priority= 1)
//	public void AddRadiantTee () throws InterruptedException {
//		//WebElement ItemsSection = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol"));
//		WebElement RadiantTee=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[1]/div/div"));
//		RadiantTee.click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		for(int i = 0; i<3; i++) {		
//			selectSize();
//			selectColor();
//			WebElement addbutton = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
//			addbutton.click();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//		}
//		driver.navigate().back();
//	}
//		
//		@Test(priority = 2)
//		public void addbreatheeasy() throws InterruptedException {
//
//		WebElement breathe_easy = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[2]/div"));
//		breathe_easy.click();
//		
//		for(int i = 0; i<2; i++) {
//			selectSize();
//			selectColor();
//			WebElement addbutton = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
//			addbutton.click();
//			Thread.sleep(5000);
//			driver.navigate().refresh();	
//		}
//		Thread.sleep(5000);
//		driver.navigate().back();
//		}
//		
//		@Test(priority = 3)
//		public void addargus () throws InterruptedException {
//		WebElement argus= driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[3]/div"));
//		argus.click();
//           for(int i = 0; i<4; i++) {
//			selectSize();
//			selectColor();
//			WebElement addbutton = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
//			addbutton.click();
//			Thread.sleep(3000);
//			driver.navigate().refresh();
//           }
//           driver.navigate().back();
//}
//		
//	@Test(priority = 4)
//	public void addherohoodie () throws InterruptedException {
//		WebElement hero_hoodie = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[4]/div"));
//		hero_hoodie.click();
//		selectSize();
//		selectColor();
//		WebElement addbutton = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
//		addbutton.click();
//		Thread.sleep(5000);
//	
//	}
//	
////	@Test(priority = 5)
////	public void addfusionbackpack () {
////		WebElement fusionbackpack = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]/div/div/ol/li[5]/div"));
////		fusionbackpack.click();
////		WebElement quantitybox = driver.findElement(By.xpath("//*[@id=\"qty\"]"));
////		quantitybox.clear();
////		quantitybox.sendKeys("5");
////		WebElement addbutton = driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]"));
////		addbutton.click();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
////		
////		}

//	@Test(priority = 5)
//	public void checkout() throws InterruptedException {
//		WebElement cartbutton = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]"));
//		cartbutton.click();
//		WebElement proceedToCheckOut = driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]"));
//		proceedToCheckOut.click();
//		
//		Thread.sleep(5000);
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"customer-email\"]"));
//		email.sendKeys(Email);
//		Thread.sleep(5000);
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"customer-password\"]"));
//		password.sendKeys(Password);
//		
//		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button"));
//		loginbutton.click();
//		Thread.sleep(7000);
//
////		WebElement address = driver.findElement(By.name("street[0]"));
////		address.sendKeys(Address);
////	
////		WebElement city = driver.findElement(By.name("city"));
////		city.sendKeys(City);
////
////		WebElement zipcode = driver.findElement(By.name("postcode"));
////		zipcode.sendKeys(Zipcode);
////		
////		WebElement phoneno = driver.findElement(By.name("telephone"));
////		phoneno.sendKeys(phonenumber);
////		
////		WebElement country = driver.findElement(By.name("country_id")); 
////		Select mycountry = new Select(country);
////		mycountry.selectByVisibleText("Jordan");
////		
//		Thread.sleep(7000);	
//		
//		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
//		nextButton.click();
//		Thread.sleep(5000);	
//	}
	
//	@Test (priority = 6)
//	public void Place_order () throws InterruptedException {
//		WebElement placeOrderButton = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
//		placeOrderButton.click();
//		Thread.sleep(5000);
//		WebElement ordernumber = driver.findElement(By.className("order-number"));
//		ordernumber.click();
//		
//		WebElement pricesection = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]"));
//		List <WebElement> listOfPrice = pricesection.findElements(By.className("subtotal"));
//		Thread.sleep(5000);
//		int sum = 0;
//			
//		for(int i=0; i<listOfPrice.size()-1; i++) {
//			if (listOfPrice.get(i).getText().contains("$")) {
//				System.out.println(listOfPrice.get(i).getText());
//				String price = listOfPrice.get(i).getText().substring(1);//
//				double newprice = Double.parseDouble(price);
//				sum +=newprice;
//				System.out.println(sum);
//				System.out.println(listOfPrice.size());
//				}
//			else{
//				continue;
//			}
//			Thread.sleep(5000);
//			WebElement shipping = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[2]/td/span"));
//			String shippingtext = shipping.getText().substring(1);
//			System.out.println(shippingtext);
//			double shippingprice = Double.parseDouble(shippingtext);
//			double expectedtotalprice = shippingprice + sum;
//			
//			System.out.println(expectedtotalprice);
//			WebElement totalprice = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tfoot/tr[3]/td/strong/span"));
//			String totalpriceString = totalprice.getText().substring(1);
//			System.out.println(totalpriceString);
//			double actualtotalprice = Double.parseDouble(totalpriceString);
//			
//			myassert.assertEquals(actualtotalprice ==expectedtotalprice , true);
//			}
//		}
	
//	@Test (priority= 7)
//	public void reorder () throws InterruptedException {
//		
//		WebElement signinbutton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a"));
//		signinbutton.click();
//		
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		email.sendKeys(Email);
//		
//		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
//		password.sendKeys(Password);
//		
//		WebElement submit = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
//		submit.click();
//		
//		for (int i=0; i<5; i++) {
//			
//			WebElement customerButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button"));
//			customerButton.click();
//			
//			WebElement myaacount = customerButton.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a"));
//			myaacount.click();
//			
//			WebElement myorders = driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a"));
//			myorders.click();
//			Thread.sleep(5000);
//			
//		WebElement order = driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]"));
//		order.click();
//		Thread.sleep(5000);
//		
//		WebElement placeorder = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
//		placeorder.click();
//		Thread.sleep(5000);
//		
//		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
//		nextButton.click();
//		Thread.sleep(5000);
//		
//		WebElement placeordebutton = driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button"));
//		placeordebutton.click();
//		Thread.sleep(5000);	
//		}	
//		}
		
		@Test (priority= 8)
		public void CheckThePrice () throws InterruptedException {
			
			WebElement signinbutton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a"));
			signinbutton.click();
			
			WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
			email.sendKeys(Email);
			
			WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
			password.sendKeys(Password);
			
			WebElement submit = driver.findElement(By.xpath("//*[@id=\"send2\"]"));
			submit.click();
			Thread.sleep(5000);
			WebElement customerButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button"));
			customerButton.click();
			
			WebElement myaacount = customerButton.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a"));
			myaacount.click();
			
			WebElement myorders = driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a"));
			myorders.click();
			Thread.sleep(5000);
						
			List <WebElement> Allprice = driver.findElements(By.className("price"));
			String FirstPrice = Allprice.get(5).getText();
			boolean PriceIsSame = false;

			for (int i=0; i<5;i++) {
				String actualprice = Allprice.get(i).getText();
				if(actualprice.equals(FirstPrice)) {
					PriceIsSame = true;
				}
			}
			myassert.assertEquals(PriceIsSame, true);
					
	}		
}