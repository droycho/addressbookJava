import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Test
  public void Phone_instantiatesCorretly_true() {
    Phone myPhone = new Phone("916", "365-3065", "cell");
    assertEquals(true, myPhone instanceof Phone);
  }

  @Test
  public void getPhoneNumber_instantiatesWithAreaCodeAndNumber_String() {
    Phone myPhone = new Phone("916", "365-3065", "cell");
    assertEquals("(916)365-3065", myPhone.getPhoneNumber());
  }

  @Test
  public void all_returnsAllInstancesOfPhone_true() {
    Phone firstPhone = new Phone("916", "365-3065", "cell");
    Phone secondPhone = new Phone("503", "837-3034", "home");
    assertTrue(Phone.all().contains(firstPhone));
    assertTrue(Phone.all().contains(secondPhone));
  }

  @Test
  public void clear_emptiesAllPhonesFromArrayList_0() {
    Phone myPhone = new Phone("916", "365-3065", "cell");
    Phone.clear();
    assertEquals(Phone.all().size(), 0);
  }
}
