package Playwrightlearn;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.microsoft.playwright.Playwright.*;
public class Test4 {


        @Test
        public void testNavigateToWebsite() {
            // Launch browser
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch();

                // Create a new page
                Page page = browser.newPage();

                // Navigate to website
                page.navigate("https://www.google.com/");

                // Verify title
                String pageTitle = page.title();
                assertEquals("Google", pageTitle);

                // Close the browser
                browser.close();
            }
        }
}


