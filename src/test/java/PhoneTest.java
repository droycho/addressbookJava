import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Test
  public void Phone_instantiatesCorretly_true() {
    Phone myPhone = new Phone("916", "365-3065", "cell");
    assertEquals(true, myPhone instanceof Phone);
  }
}
