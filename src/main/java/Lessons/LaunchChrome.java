package Lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/14 16:17
 * @Description: 手握日月摘星辰，世间无我这般人
 */
//java&selenium测试
public class LaunchChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        //get（）打开一个站点
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面的标题
        System.out.println("当前打开的页面标题是:"+driver.getTitle());

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        //关闭并退出浏览器
        driver.close();
    }
}
