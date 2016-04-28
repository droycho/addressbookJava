import java.util.ArrayList;

public class Contact{
  private String mName;
  private static ArrayList<Contact> instances = new ArrayList<Contact>();

  public Contact (String name) {
    mName = name;
    instances.add(this);
    }

  public String getName() {
    return mName;
  }

  public static ArrayList<Contact> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
 }
