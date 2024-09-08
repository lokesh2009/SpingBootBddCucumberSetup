package base;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.AfterClass;

@SpringBootTest
    public class BaseUITest {

        protected WebDriver driver;

        @Value("${ui.base.url}")
        private String baseUrl;

        @BeforeClass
        public void setUp() {
            // Initialize WebDriver
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.get(baseUrl);
        }

        @AfterClass
        public void tearDown() {
            // Close the browser
            if (driver != null) {
                driver.quit();
            }
        }
    }
