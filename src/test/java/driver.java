import org.openqa.selenium.WebDriver;

public class driver {
    private WebDriver driver;
    public  driver(WebDriver driver,String url){
        this.driver = driver;
        this.driver.get(url);
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
