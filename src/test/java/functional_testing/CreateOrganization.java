package functional_testing;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.POM.HomePagePOM;
import com.crm.POM.OrganizationsPagePOM;

import java_utility.RandomNumber;
import java_utility.TestData;

public class CreateOrganization extends BaseClass {
	
	@Test
	public void createOrganization() throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		HomePagePOM homePagePOM=new HomePagePOM(driver);
		
		homePagePOM.organizationsLink();
		
		OrganizationsPagePOM organizationsPagePOM=new OrganizationsPagePOM(driver);
		
		organizationsPagePOM.plusIcon();
		
		TestData testData=new TestData();
		
		String name=testData.data("sheet2", 0, 0);
		
		name=name+new RandomNumber().randomNumber();
		
		organizationsPagePOM.organizationName(name);
		
		organizationsPagePOM.saveBtn();
		
		Thread.sleep(2000);
		
		String expectedName=driver.findElement(By.xpath("//div[@class='small']//span[1]")).getText();
		
		System.out.println(expectedName);
		
		assertTrue(expectedName.contains(name),"Failed to Create Organization");
		
		System.out.println("Successfully Organization Created");
		
	}
}
