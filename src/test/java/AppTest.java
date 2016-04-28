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


















//
//
//   @Test
//   public void runBlank_CheckifPageIsBlank_true(){
//     Blank ->MAIN CLASS<- myBlank = new Blank();  ->THIS CREATES A INSTANCE THE MAIN CLASS<-
//     assertEquals(FirstArgument, SecondArgument()) <-METHOD THAT COMPARES 1ST AND 2ND ARGUMENTS->
//   }
}
