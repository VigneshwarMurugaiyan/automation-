package org.automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Automation\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("vignesh13");
	Thread.sleep(1000);
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("123456");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	Thread.sleep(2000);
	
	WebElement locations = driver.findElement(By.id("location"));
	Select s=new Select(locations);
	s.selectByIndex(8);
	Thread.sleep(2000);
	
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select s1 = new Select(hotels);
	s1.selectByValue("Hotel Sunshine");
	Thread.sleep(2000);
	
	WebElement rooms = driver.findElement(By.id("room_type"));
	Select s2 =new Select(rooms);
	s2.selectByVisibleText("Super Deluxe");
	Thread.sleep(2000);
	
	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.clear();
	checkIn.sendKeys("13/09/2022");
	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	checkOut.clear();
	checkOut.sendKeys("14/09/2022");
	Thread.sleep(1000);
	
	WebElement adults = driver.findElement(By.id("adult_room"));
	Select s3=new Select(adults);
	s3.selectByIndex(2);
	Thread.sleep(1000);
	
	WebElement child = driver.findElement(By.id("child_room"));
	Select s4=new Select(child);
	s4.selectByIndex(1);
	Thread.sleep(1000);
	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	Thread.sleep(2000);
	
	WebElement button = driver.findElement(By.id("radiobutton_0"));
	button.click();
	Thread.sleep(1000);
	
	WebElement nextPage = driver.findElement(By.id("continue"));
    nextPage.click();
    Thread.sleep(1000);
    
    WebElement firstName = driver.findElement(By.id("first_name"));
	firstName.sendKeys("vignesh");
	Thread.sleep(1000);
	
	WebElement lastName = driver.findElement(By.id("last_name"));
	lastName.sendKeys("m");
	Thread.sleep(1000);
	
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("39/7,petite rue");
	Thread.sleep(1000);
	
	WebElement creditCard = driver.findElement(By.id("cc_num"));
	creditCard.sendKeys("1234567891011123");
	Thread.sleep(1000);
	

	WebElement cardType = driver.findElement(By.id("cc_type"));
	Select s5 =new Select(cardType);
	s5.selectByVisibleText("VISA");
	Thread.sleep(1000);
	
	WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
	Select s6 =new Select(expMonth);
	s6.selectByVisibleText("December");
	Thread.sleep(1000);
	
	WebElement expYear = driver.findElement(By.id("cc_exp_year"));
	Select s7 =new Select(expYear);
	s7.selectByVisibleText("2022");
	Thread.sleep(1000);
	
	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	ccv.sendKeys("123");
	Thread.sleep(1000);
	
	WebElement book = driver.findElement(By.id("book_now"));
	book.click();
		
	}

}
