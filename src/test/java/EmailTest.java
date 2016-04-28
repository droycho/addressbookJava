import org.junit.*;
import static org.junit.Assert.*;

public class EmailTest {

  @Test
  public void Email_instantiatesCorretly_true() {
    Email myEmail = new Email("hello@hi.com", "work");
    assertEquals(true, myEmail instanceof Email);
  }

  @Test
  public void getEmailNumber_instantiatesWithEmail_String() {
    Email myEmail = new Email("hello@hi.com", "work");
    assertEquals("hello@hi.com", myEmail.getEmail());
  }

  @Test
  public void all_returnsAllInstancesOfEmail_true() {
    Email firstEmail = new Email("hello@hi.com", "work");
    Email secondEmail = new Email("goodbye@bye.com", "home");
    assertTrue(Email.all().contains(firstEmail));
    assertTrue(Email.all().contains(secondEmail));
  }

  @Test
  public void clear_emptiesAllEmailsFromArrayList_0() {
    Email myEmail = new Email("hello@hi.com", "work");
    Email.clear();
    assertEquals(Email.all().size(), 0);
  }
}
