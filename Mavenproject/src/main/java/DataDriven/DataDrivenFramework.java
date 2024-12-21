package DataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenFramework {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("https://biodataking.com/");
		Thread.sleep(2000);
		
		
		FileInputStream f=new FileInputStream(new File("C:\\Users\\LAB 1 PC-6\\Desktop\\datadriven.xlsx"));
		
		XSSFWorkbook w=new XSSFWorkbook(f);
		
		XSSFSheet sh=w.getSheetAt(0);
		
		XSSFCell cell;
		
		
		//for reading excel sheet data for loop is used
		//for reading Database data while loop is used 
		
		for(int i=1; i<=sh.getLastRowNum(); i++)
		{
			d.findElement(By.xpath("//a[@id='open-login-modal']")).click();
			Thread.sleep(2000);
			
			
			
			cell=sh.getRow(i).getCell(0);
			//row 1 column 0
			cell.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@id='username']")).sendKeys(cell.getStringCellValue());
			Thread.sleep(2000);
			
			cell=sh.getRow(i).getCell(1);
			//row 1 column 0
			cell.setCellType(CellType.STRING);
			d.findElement(By.xpath("//input[@id='userpassword']")).sendKeys(cell.getStringCellValue());
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(2000);
			
			
			d.findElement(By.xpath("//input[@value='mobile']")).click();
			Thread.sleep(2000);
			
			cell=sh.getRow(i).getCell(2);
			//row 1 column 0
			cell.setCellType(CellType.STRING);

			new Select(d.findElement(By.xpath("//select[@id='login_mob_ctry_code']"))).selectByVisibleText(cell.getStringCellValue());
			Thread.sleep(2000);
			
			
			
			
			d.navigate().refresh();
			Thread.sleep(2000);
			
			
			
			
			
			
			
			
			
			

			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
