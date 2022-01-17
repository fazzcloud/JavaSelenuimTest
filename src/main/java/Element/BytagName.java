package Element;

import com.sun.deploy.util.JVMParameters;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/17 14:53
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class BytagName{
    /*
    通过tagname定位元素，一般是用findElements，返回一个标签组
    以博客园为例，获取博客园的title
     */
    public static void main(String[] args)  throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cnblogs.com/");

        //若没有重复标签，使用findElement
        WebElement webElement  = driver.findElement(By.tagName("body"));
        System.out.println(webElement.getText());
        System.out.println("===============================");

        //若润在重复标签，使用findElement
        //返回的是一组元素，所以需要有list去操作
        List<WebElement> webElements = driver.findElements(By.tagName("article"));
        int i = webElements.size();
        for(int j = 0;j < i;j++){
            System.out.println(webElements.get(j).getText());
        }

    }
}
