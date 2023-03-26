package Playwrightlearn;
import com.microsoft.playwright.*;
public class Test1 {

    // src/main/java/org/example/App.java



        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch();
                Page page = browser.newPage();
                //page.navigate("http://playwright.dev");
                page.navigate("https://staging.shvp-xftw-ctdtm.com");
                System.out.println(page.title());
            }
        }

}
