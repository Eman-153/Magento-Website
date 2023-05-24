import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

public class Parameter {
	
	 static WebDriver driver = new EdgeDriver();
	String website = "https://magento.softwaretestingboard.com/";
	String SingInPage = "https://magento.softwaretestingboard.com/customer/account/login";
	String SingOut = "https://magento.softwaretestingboard.com/customer/account/logout/"; 
	
	String[] FirstName = {"Sama","Leen","Joud","Saly","Raneem","Asmaa"};
	String [] LastName = {"mousa","Ahma","Sami","Ali","Kamal","Khaled"};
	String PartEmail= "user";
	String RestEmail = "@yahoo.com";
	String Password = "abc@@12345";
	String EmailToLogin;
	
	Random rand = new Random();
	
	int RandName = rand.nextInt(0, 6);
	int RandEmail = rand.nextInt(0, 100);
	
	String FullEmail;
	
	String Address = "amman st";
	String City = "Amman";
	String Zipcode = "00962";
	String phonenumber = "0987654321";
	Assertion myassert = new Assertion();
	
	
	
	
	public void selectSize () throws InterruptedException {
		Thread.sleep(2000);
		WebElement sizesection = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
		List <WebElement> sizelist = sizesection.findElements(By.className("text"));
		int randomsize = rand.nextInt(0,sizelist.size());
		WebElement sizeoption = sizelist.get(randomsize);
		//System.out.println(sizeoption.getText());
		sizeoption.click();
		Thread.sleep(2000);
	}
	
	public void selectColor() throws InterruptedException {
		Thread.sleep(2000);
		WebElement colorsection = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
		List <WebElement> colorlist = colorsection.findElements(By.className("color"));
		int randomcolor = rand.nextInt(0,colorlist.size());
		 WebElement coloroption = colorlist.get(randomcolor);
		 //System.out.println(randomcolor);
		 coloroption.click();
		 Thread.sleep(2000);
	}
	
	

}
