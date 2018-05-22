package com.framework.automation.framework.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.internal.Utils;

import com.framework.automation.framework.dataReader.Excel_Reader;
import com.framework.automation.framework.testlistner.Listener;

public class TestBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	public  WebDriver driver;
	private  ChromeDriverService service;
	//String url = "http://automationpractice.com/index.php";
	//String browser = "chrome";
	Excel_Reader excel_reader;
	Listener list;
	

	public Properties properties=new Properties();
	public void init() throws IOException {
		rundata();
		selectBrowser(properties.getProperty("browser"));
		getUrl(properties.getProperty("url"));
		String Log4jConfigPath = "log4j.properties";
		PropertyConfigurator.configure(Log4jConfigPath);

	}

	public void rundata() throws IOException{
		File file=new File(System.getProperty("user.dir")+"/src/main/java/com/AutomationFramework/config/config.properties");
	    FileInputStream f=new FileInputStream(file);
	    properties.load(f);
	}
	
	public void selectBrowser(String browser) throws IOException {
		if (browser.equalsIgnoreCase("chrome")) {

			service = new ChromeDriverService.Builder().usingDriverExecutable(new File("./driver/chromedriver"))
					.usingAnyFreePort().build();
			service.start();
			log.info("creating object of  " + browser);
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver");

			log.info("creating object of  " + browser);
			driver = new FirefoxDriver();

		}

	}

	public void getUrl(String url) {
		log.info("navigating to " + url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public String[][] getData(String excelName, String dataFileName) {
		String path = System.getProperty("user.dir") + "/DataXLSfile/" + excelName;
		excel_reader = new Excel_Reader(path);
		String[][] data = excel_reader.readDataFromSheet(dataFileName, excelName);
		return data;
	}

	public void waitForElement(int timeoutInSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void takeScreenShot(String name){
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try{
			String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/com/AutomationFramework/test/screenshot/";
			File destFile=new File((String) reportDirectory+name+"_"+formater.format(calendar.getTime())+".png");
		   Utils.copyFile(scrFile, destFile);
		   Reporter.log("<a href='" +destFile.getAbsolutePath()+ "'> <image src='" +destFile.getAbsolutePath()+ "' height='100' width='100'/> </a>");
				
				}catch (Exception e) {
			
			e.printStackTrace();
		
		}
	}
	public Iterator<String> getAllWindows(){
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		return itr;
	


}


}
