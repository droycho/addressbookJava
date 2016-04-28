import java.util.ArrayList;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest extends FluentTest{

  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
 public WebDriver getDefaultDriver() {
   return webDriver;
 }

 @ClassRule
 public static ServerRule server = new ServerRule();

 @After
   public void tearDown() {
     Contact.clear();
     Phone.clear();
     Email.clear();
     Mailing.clear();
   }

 @Test
 public void rootTest() {
   goTo("http://localhost:4567/");
   assertThat(pageSource()).contains("Address Book");
 }

@Test
public void contactIsCreatedTest() {
  goTo("http://localhost:4567/");
  click("a", withText("Add a New Contact"));
  fill("#firstName").with("John");
  fill("#lastName").with("Doe");
  fill("#month").with("January");
  submit(".btn");
  assertThat(pageSource()).contains("Your contact has been saved.");
}

@Test
public void contactIsDiplayedTest() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("John");
  fill("#lastName").with("Doe");
  fill("#month").with("January");
  submit(".btn");
  click("a", withText("View Contacts"));
  assertThat(pageSource()).contains("John Doe");
}

@Test
public void contactShowPageDisplaysContact() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("John");
  fill("#lastName").with("Doe");
  fill("#month").with("January");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("John Doe"));
  assertThat(pageSource()).contains("John Doe");
}

@Test
public void contactPhoneFormIsDisplayed() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("Bob");
  fill("#lastName").with("Smith");
  fill("#month").with("February");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  click("a", withText("Add a new phone number"));
  assertThat(pageSource()).contains("Add a phone number for Bob Smith");
}

@Test
public void contactPhoneIsAddedAndDisplayed() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("Bob");
  fill("#lastName").with("Smith");
  fill("#month").with("February");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  click("a", withText("Add a new phone number"));
  fill("#areaCode").with("619");
  fill("#number").with("555-5555");
  fill("#type").with("Home");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  assertThat(pageSource()).contains("(619)555-5555");
}

@Test
public void contactEmailFormIsDisplayed() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("Bob");
  fill("#lastName").with("Smith");
  fill("#month").with("February");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  click("a", withText("Add a new email address"));
  assertThat(pageSource()).contains("Add an email for Bob Smith");
}

@Test
public void contactEmailIsAddedAndDisplayed() {
  goTo("http://localhost:4567/contacts/new");
  fill("#firstName").with("Bob");
  fill("#lastName").with("Smith");
  fill("#month").with("February");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  click("a", withText("Add a new email address"));
  fill("#email").with("hello@hi.com");
  fill("#type").with("Work");
  submit(".btn");
  click("a", withText("View Contacts"));
  click("a", withText("Bob Smith"));
  assertThat(pageSource()).contains("hello@hi.com");
}


}
