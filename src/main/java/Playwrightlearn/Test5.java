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

        @AfterEach
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
    }


