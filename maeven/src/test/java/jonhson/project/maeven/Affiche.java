package jonhson.project.maeven;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Affiche {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", 
                            "C:\\Users\\1916RATSIMBAHERISON\\scoop\\apps\\chromedriver\\current\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testAfficheHelloWorld() {
           
            // Charge le fichier HTML directement
    driver.get("C:/Users/1916RATSIMBAHERISON/Desktop/Etude de java/maeven/src/test/resources/formulaire.html");

    // Code de test pour interagir avec le formulaire
    WebElement h1 = driver.findElement(By.tagName("h1"));
    System.out.println("Le texte de h1 est : " + h1.getText());

        // Simuler la soumission du formulaire avec Selenium
        driver.findElement(By.id("nom")).sendKeys();
        driver.findElement(By.id("prenom")).sendKeys();
        driver.findElement(By.id("age")).sendKeys();
        driver.findElement(By.id("adresse")).sendKeys();
        driver.findElement(By.id("contact")).sendKeys();
        driver.findElement(By.id("email")).sendKeys();

        // Soumettre le formulaire en cliquant sur le bouton
        WebElement button = driver.findElement(By.xpath("//button[text()='Soumettre']"));
        button.click();

        driver.navigate().to("C:/Users/1916RATSIMBAHERISON/Desktop/Etude de java/maeven/src/test/resources/liste.html");

        // Affichage des résultats de débogage
        System.out.println("Formulaire soumis et ligne ajoutée dans le tableau.");
    }

    @After
    public void tearDown() {
        // Garder le navigateur ouvert pour vérifier
        // driver.quit(); 
    }
}
