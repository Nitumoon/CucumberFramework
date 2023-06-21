package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateHandle4 {
	public WebDriver driver;

	public void selectDate() {

		driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']")).click();

		String MonthYear = driver.findElement(By.xpath("September 2022")).getText();
		System.out.println(MonthYear);
		while (!(MonthYear.equals("November 2023"))) {
			driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();
			MonthYear = driver
					.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']"))
					.getText();

			System.out.println(MonthYear);
		}
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]//p[text()='10']")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();

	}

}
