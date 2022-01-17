package Element;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/17 10:54
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        driver.findElement(By.className("s_ipt")).sendKeys("自动化测试");
        driver.findElement(By.id("su")).click();

        driver.close();
    }
}
