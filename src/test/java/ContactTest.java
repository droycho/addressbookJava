import org.junit.*;
import static org.junit.Assert.*;

public class ContactTest {
  @After
  public void tearDown() {
    Contact.clear();
  }

  @Test
  public void contact_instantiatesCorrectly_true() {
    Contact testContact = new Contact("John", "Doe", "January");
    assertEquals(true, testContact instanceof Contact);
  }

  @Test
  public void getName_contactInstantiatesWithName_JohnDoe() {
    Contact testContact = new Contact("John", "Doe", "January");
    assertEquals("John Doe", testContact.getName());
  }

  @Test
  public void getBirthMonth_contactInstantiatesWithBirthMonth_January() {
    Contact testContact = new Contact("John", "Doe", "January");
    assertEquals("January", testContact.getBirthMonth());
  }

  @Test
  public void all_returnsAllInstancesOfContact_true() {
    Contact firstContact = new Contact("John", "Doe", "January");
    Contact secondContact = new Contact("Bob", "Smith", "February");
    assertTrue(Contact.all().contains(firstContact));
    assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void clear_emptiesAllContactsFromList_0() {
    Contact firstContact = new Contact("John", "Doe", "January");
    Contact.clear();
    assertEquals(Contact.all().size(), 0);
  }

  @Test
  public void getId_contactsInstantiateWithAnId_1() {
    Contact testContact = new Contact("John", "Doe", "January");
    assertEquals(1, testContact.getId());
  }

  @Test
  public void find_returnsContactWithSameId_secondContact() {
    Contact firstContact = new Contact("John", "Doe", "January");
    Contact secondContact = new Contact("Bob", "Smith", "February");
    assertEquals(Contact.find(secondContact.getId()), secondContact);
  }

  @Test
  public void find_returnsNullWhenNoContactFound_null() {
    assertTrue(Contact.find(999) == null);
  }
}
