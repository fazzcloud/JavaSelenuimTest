package Element;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @Author: Fazzcloud
 * @Date: 2022/1/17 10:44
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ByName {
    /*
    通过页面元素中的name去定位
    例如：定位百度首页的搜索输入框，并输入内容
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        driver.findElement(By.name("wd")).sendKeys("自动化测试");
        driver.findElement(By.id("su")).click();

        driver.close();
    }
}
