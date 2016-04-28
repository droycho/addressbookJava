import org.junit.*;
import static org.junit.Assert.*;

public class MailingTest {

  @Test
  public void Mailing_instantiatesCorretly_true() {
    Mailing myMailing = new Mailing("123 First Ave", "Portland", "OR", "97210", "Work");
    assertEquals(true, myMailing instanceof Mailing);
  }

  @Test
  public void getMailing_instantiatesWithMailing_String() {
    Mailing myMailing = new Mailing("123 First Ave", "Portland", "OR", "97210", "Work");
    assertEquals("123 First Ave, Portland, OR, 97210", myMailing.getMailing());
  }

  @Test
  public void all_returnsAllInstancesOfMailing_true() {
    Mailing firstMailing = new Mailing("123 First Ave", "Portland", "OR", "97210", "Work");
    Mailing secondMailing = new Mailing("456 Second", "Portland", "OR", "97210", "Home");
    assertTrue(Mailing.all().contains(firstMailing));
    assertTrue(Mailing.all().contains(secondMailing));
  }

  @Test
  public void clear_emptiesAllMailingsFromArrayList_0() {
    Mailing myMailing = new Mailing("123 First Ave", "Portland", "OR", "97210", "Work");
    Mailing.clear();
    assertEquals(Mailing.all().size(), 0);
  }
}
