import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class modelo extends driver{
    public modelo(WebDriver driver, String url){
        super(driver, url);
        PageFactory.initElements(driver, this);
    }
    WebDriver driver;
    String username;
    String pass;
    String btnLogin;
    String[] usuarios = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
    public void ingresarValores(String usuario, String pass){
        System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\billy\\OneDrive\\Documentos\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @FindBy(id="user-name")
    private WebElement inputUsuario;

    public WebElement getInputUsuario(){
        return inputUsuario;
    }

    @FindBy(id="password")
    private WebElement inputPass;

    public WebElement getInputPass() {
        return inputPass;
    }

    @FindBy(id="login-button")
    private WebElement btnInciarSesion;

    public WebElement getBtnLogin() {
        return btnInciarSesion;
    }
    @FindBy(id="logout_sidebar_link")
    private WebElement btnSalirSesion;

    public WebElement getBtnLogout() {
        return btnSalirSesion;
    }

    @FindBy(css = "img[alt=Google]")
    private WebElement logo;
    public String getLogoClass() {
        return logo.getAttribute("class");
    }

    public String password (){
        return "secret_sauce";
    }
}
