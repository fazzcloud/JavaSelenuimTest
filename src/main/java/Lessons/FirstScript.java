package Lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author: Fazzcloud
 * @Date: 2022/1/14 16:38
 * @Description: 手握日月摘星辰，世间无我这般人
 */
public class FirstScript {
    public static void main(String[] args) {
        //第一步一定是，将webdriver实例化为一个对象
        WebDriver driver = new ChromeDriver();
        //将窗口最大化
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //地址栏输入地址
        driver.get("https://www.baidu.com");

        //判断输入的地址是否是百度
        try{
            String baiduTitle = "百度一下，你就知道";
            //获取的标题和预期结果做比较
            assert driver.getTitle() == baiduTitle; //assert是断言，后面跟表达式，返回的值是布尔类型（true/false）
            System.out.println("Test pass");//断言结果为true则输出测试通过
        }catch (Exception e){
            e.printStackTrace();
        }

        //在输入框中输入
        driver.findElement(By.id("kw")).sendKeys("Selenium");
        //点击搜索按钮
        driver.findElement(By.id("su")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //通过xpath表达式来确定该元素显示在结果列表，从而判断selenium官网这个连接显示在列表
        WebElement eleString =  driver.findElement(By.xpath("//*[@id='1']/h3/a[1]"));

        String eleString2 = eleString.getText();//定义一个变量的值为定位的连接内容
        System.out.println(eleString2);

        //将eleString2和预期结果做比较
        try{
            if (eleString2.equals("Selenium automates browsers. That's it!")){
                System.out.println("Testing is successful!");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        };

        driver.close();


    }
}
