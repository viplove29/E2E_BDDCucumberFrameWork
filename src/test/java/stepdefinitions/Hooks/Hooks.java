package stepdefinitions.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

/** Hooks manage preconditions and cleanup for Cucumber scenarios. */
public class Hooks {

  @Before
  public void setUp() {
    // Can  use Initialize WebDriver
    System.out.println("Starting a new test scenario.");
  }

  @After
  public void tearDown() {
    // Quit WebDriver
    DriverFactory.quitDriver();
    System.out.println("Test scenario completed.");
  }
}
