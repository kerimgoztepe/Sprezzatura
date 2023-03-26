package Playwrightlearn;
import com.microsoft.playwright.*;
public class Test2 {

            public static void main(String[] args) {

            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch();
                Page page = browser.newPage();

                page.navigate("https://staging.shvp-xftw-ctdtm.com");
                String pageTitle = page.title();
                System.out.println(pageTitle);

                if (pageTitle.equals("Sign In | Cydeo")) {
                    System.out.println("Title test passed");
                } else {
                    System.out.println("Title test failed");
                }

                browser.close();
            } catch (Exception e) {
                System.err.println("Error: " + e);
            }
        }


}
