/**
 * 
 */
package com.selenium.cucumber;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

/**
 * @author smita
 *
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:reports/test-report" })
public class CucumberSeleniumRunner {

}
