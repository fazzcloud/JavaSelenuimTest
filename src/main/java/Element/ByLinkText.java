package Element;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/17 16:12
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class ByLinkText {
    /*
    通过超链接去定位，就会用到LinkText和partialLinkText
    这二者的区别是，一个是精确匹配，一个是模糊匹配
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");

        driver.findElement(By.linkText("贴吧")).click();

        //使用断言判断打开的页面是否正确
        assert driver.getCurrentUrl() == "https://tieba.baidu.com/index.html";
        System.out.println("test pass!");
        //linkText也是遵循“匹配第一个”的原则，同一网页多次出现的话找第一个。

        //模糊匹配时，要注意，不可以用截断的内容拼接后进行模糊匹配
        driver.findElement(By.partialLinkText("冰雪")).click();
        assert driver.getCurrentUrl() == "https://www.baidu.com/s?cl=3&tn=baidutop10&fr=top1000&wd=%E8%AE%B2%E5%A5%BD%E5%86%AC%E5%A5%A5%E6%95%85%E4%BA%8B+%E5%85%B1%E8%B5%B4%E5%86%B0%E9%9B%AA%E4%B9%8B%E7%BA%A6&rsv_idx=2&rsv_dl=fyb_n_homepage&sa=fyb_n_homepage&hisfilter=1";
        System.out.println("test pass!");

        driver.close();
    }
}
