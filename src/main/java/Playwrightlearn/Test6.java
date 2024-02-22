package Playwrightlearn;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class Test6 {

        private Playwright playwright;
        private Browser browser;
        private Page page;

        @BeforeEach
        public void setUp() {
            playwright = Playwright.create();
            browser = playwright.chromium().launch();
            page = browser.newPage();
            page.navigate("https://staging.shvp-xftw-ctdtm.com/");
            page.fill("//input[@type='email']", "kasheen@densebpoqq.com");
            page.fill("//input[@type='password']", "T3st123!");
            page.click("#submit");
            //page.waitForNavigation();
        }

        @AfterEach
        public void tearDown() {
            page.close();
            browser.close();
            playwright.close();
        }

        @Test
        public void testClickOnLavitaButton() {
            page.click("#Calendar");
            assertEquals("Cydeo", page.title());
        }
    }


