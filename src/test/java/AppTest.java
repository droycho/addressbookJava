import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest{

  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
 public WebDriver getDefaultDriver() {
   return webDriver;
 }

 @ClassRule
 public static ServerRule server = new ServerRule();

 @Test
 public void rootTest() {
   goTo("http://localhost:4567/");
   assertThat(pageSource()).contains("Address Book");
 }





















//
//
//   @Test
//   public void runBlank_CheckifPageIsBlank_true(){
//     Blank ->MAIN CLASS<- myBlank = new Blank();  ->THIS CREATES A INSTANCE THE MAIN CLASS<-
//     assertEquals(FirstArgument, SecondArgument()) <-METHOD THAT COMPARES 1ST AND 2ND ARGUMENTS->
//   }
}
