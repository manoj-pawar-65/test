package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("C:/Users/Group018/Desktop/testcasefolder/index.html");
				String dataset[]= new String[]{"~","`","!","'","@","#","$","%","^","&","*","(",")","_","+","=","-","`","[","]","{","}","/",".",",","<",">","?","\",'",",",":",";"};
				for(int i=0;i<dataset.length;i++) {
					driver.findElement(By.xpath("/html/body/input[1]")).sendKeys(dataset[i]);
					driver.findElement(By.id("submitbutt")).click();
					String errorcode=driver.findElement(By.id("errusername")).getText();
					if(errorcode.matches("Alphabets only!!!")) {
						try {
							Thread.sleep(0);
						}catch (Exception e) {
							System.out.println("Error related to thread sleep");
						}
						driver.close();
					}
			}
	}

}