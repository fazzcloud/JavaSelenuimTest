package Element;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/17 9:31
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ByID {
    /*
    通过页面元素中的ID去定位
    例如：定位百度首页的搜索输入框，并输入内容
     */
    public static void main(String[] args) throws InterruptedException {
        //第一步一定是实例化driver对象，然后打开访问地址
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        //将定位到的元素赋予存储对象
        WebElement webid = driver.findElement(By.id("kw"));
        webid.sendKeys("自动化测试");
        //定位搜索按钮，并点击
        driver.findElement(By.id("su")).click();

        driver.quit();
    }
}
