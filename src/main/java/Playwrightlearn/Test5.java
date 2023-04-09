package Playwrightlearn;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test5 {

        private Playwright playwright;
        private Browser browser;
        private Page page;

        @BeforeAll
        public static void setUpBeforeAll() {
            // Set up any necessary preconditions before running tests
        }

        @BeforeEach
        public void setUp() throws Exception {
            playwright = Playwright.create();
            browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            page = browser.newPage();
        }

       // @AfterEach
        public void tearDown() throws Exception {
            page.close();
            browser.close();
            playwright.close();
        }

        @Test
        public void myTest() throws Exception {
            // Navigate to the website to test
            page.navigate("https://www.example.com");

            // Assert that the page title is correct
            assertEquals("Example Domain", page.title());

            // Click on a link on the page
            ElementHandle link = page.querySelector("a");
            link.click();

            // Wait for the new page to load
            //page.waitForNavigation();

            // Assert that the new page's URL is correct
            assertEquals("https://www.iana.org/domains/reserved", page.url());
        }

        @Test
        public void newTest() {
            page.navigate("https://www.amazon.com/");

            // Search for an item
            page.fill("#twotabsearchtextbox", "gift for my son");
            page.click("[type='submit']");
            //ElementHandle search = page.querySelector("//input[@id='twotabsearchtextbox']");
           // search.fill("test");
        }

        @Test
        public void epic1(){
            page.navigate("https://app.epicflow.io/login");
            page.fill("#username","kerimgoztepe@gmail.com");
            page.fill("#password","K@rim5568a2");
            page.click("//button[normalize-space()='LOG IN']");
            assertEquals("Epicflow.io", page.title());


        }
    }


