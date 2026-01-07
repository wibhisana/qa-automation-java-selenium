package com.qa.automation.ui;

import com.qa.automation.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void openWebsiteTest() {
        driver.get("https://example.com");

        String title = driver.getTitle();
        Assert.assertTrue(
                title.contains("Example"),
                "Page title should contain 'Example'"
        );
    }
}
