package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {
    public static void w3schoolTable()
    {
        Driver.getdriver().get("https://www.w3schools.com/html/html_tables.asp");
    }

    public static List<WebElement> getbasliklar()
    {
        return Driver.getdriver().findElements(By.xpath("(//table)[1]//th"));
    }

    public static  List<WebElement> getsatirlar()
    {
        return Driver.getdriver().findElements(By.xpath("(//table)[1]/tbody/tr"));
    }

    public static List<WebElement> getdatalar()
    {
        return  Driver.getdriver().findElements(By.xpath("(//table)[1]/tbody//td"));
    }

    public static List<WebElement> getSatirdakiElement(int satir)
    {
        return Driver.getdriver().findElements(By.xpath("(//table)[1]/tbody/tr)["+satir+"]"));
    }

    public static List<WebElement> getsutunelement(int sutun)
    {
        return Driver.getdriver().findElements(By.xpath("(//table)[1]//tr/td["+sutun+"]"));
    }

    public static WebElement satirsutun(int satir, int sutun)
    {
        return Driver.getdriver().findElement(By.xpath("(//table)[1]//tr["+satir+"]/td["+sutun+"]"));
    }
}
