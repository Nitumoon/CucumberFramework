package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateHandling3 {

	public static void selectDate() {
		// set driver path
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		// open link
		driver.get("https://www.goibibo.com/");

		// click on calender
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		// select DayPicker-Caption
		String title = driver
				.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']"))
				.getText();

		// print current month and year caption text
		System.out.println(title);

		// using while loop
		while (!(title.equals("November 2023"))) {

			// navigate to next month on clicking ">" key
			driver.findElement(By.xpath("//span[contains(@class,'NavButton--next')]")).click();

			// select year and month caption text
			title = driver
					.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']"))
					.getText();
			// print month and year
			System.out.println(title);
		}
		// select date
		driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]//p[text()='10']")).click();

		// get the date in string
		String date = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]//p[text()='10']")).getText();

		// click on done button
		driver.findElement(By.xpath("//span[text()='Done']")).click();

		// print final selected date
		System.out.println("---Selected Date is : " + date + "-" + title + "----");

	}

	public static void main(String[] args) throws InterruptedException {
		// create obkect of class
		DateHandling3 d = new DateHandling3();

		// call method
		d.selectDate();

	}

}
