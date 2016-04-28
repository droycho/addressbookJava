import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {
  @After
  public void tearDown() {
    Contact.clear();
  }

  @Test
  public void contact_instantiatesCorrectly_true() {
    Contact testContact = new Contact("John Doe");
    assertEquals(true, testContact instanceof Contact);
  }

  @Test
  public void getName_contactInstantiatesWithName_JohnDoe() {
    Contact testContact = new Contact("John Doe");
    assertEquals("John Doe", testContact.getName());
  }

  @Test
  public void all_returnsAllInstancesOfContact_true() {
    Contact firstContact = new Contact("John Doe");
    Contact secondContact = new Contact("Bob Smith");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void clear_emptiesAllContactsFromList_0() {
    Contact firstContact = new Contact("John Doe");
    Contact.clear();
    assertEquals(Contact.all().size(), 0);
  }
}
