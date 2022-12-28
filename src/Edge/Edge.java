package Edge;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Toshiba-com\\Desktop\\udemyfiles\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
//screen shot for one website
//		
//		TakesScreenshot src = ((TakesScreenshot)driver);
//		File SrcFile = src.getScreenshotAs(OutputType.FILE);
//		File Dest = new File("C://mypictures/image1.png");
//		FileUtils.copyFile(SrcFile, Dest);
		
// screen shot for many websites  with new names>::
		Date currentDate = new Date();
		String actualDate = currentDate.toString().replace(":", "-");
		TakesScreenshot src = ((TakesScreenshot)driver);
		File SrcFile = src.getScreenshotAs(OutputType.FILE);
		File Dest = new File("C://mynewpicture/"+actualDate+".png");
		FileUtils.copyFile(SrcFile, Dest); 
		

	}

}
