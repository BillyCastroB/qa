
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class actividad1 {
    private  WebDriver driver;
    private modelo modelo;
    @BeforeEach
    public void configuracion(){
        System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\billy\\OneDrive\\Documentos\\chromedriver.exe");
        driver = new ChromeDriver();
        modelo = new modelo(driver, "https://www.saucedemo.com/v1/index.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    @Test
    public void primerUsuario() {
        //primer usuario = standard_user
        modelo.getInputUsuario().sendKeys("standard_user");
        modelo.getInputPass().sendKeys(modelo.password());
        modelo.getBtnLogin().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement btnMenu = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        btnMenu.click();
        modelo.getBtnLogout().click();
    }
    @Test
    public void segundoUsuario() {
        //primer usuario = standard_user
        modelo.getInputUsuario().sendKeys("locked_out_user");
        modelo.getInputPass().sendKeys(modelo.password());
        modelo.getBtnLogin().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement btnMenu = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        btnMenu.click();
        modelo.getBtnLogout().click();
    }
    @Test
    public void tercerUsuario() {
        //primer usuario = standard_user
        modelo.getInputUsuario().sendKeys("problem_user");
        modelo.getInputPass().sendKeys(modelo.password());
        modelo.getBtnLogin().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement btnMenu = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        btnMenu.click();
        modelo.getBtnLogout().click();
    }
    @Test
    public void cuartoUsuario() {
        //primer usuario = standard_user
        modelo.getInputUsuario().sendKeys("performance_glitch_user");
        modelo.getInputPass().sendKeys(modelo.password());
        modelo.getBtnLogin().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement btnMenu = driver.findElement(By.xpath("//button[normalize-space()='Open Menu']"));
        btnMenu.click();
        modelo.getBtnLogout().click();
    }
}
