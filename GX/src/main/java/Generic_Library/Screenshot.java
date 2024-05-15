package Generic_Library;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.util.Date;

public class Screenshot {
    public static void capture(WebDriver driver) throws Exception{
        Date d=new Date();
        String s=d.toString();
        String res=s.replace(":","-");
        TakesScreenshot tss= (TakesScreenshot) driver;
        File temp=tss.getScreenshotAs(OutputType.FILE);
        File per=new File("./resources/photos/"+res+".png");
        FileHandler.copy(temp,per);
    }
}
