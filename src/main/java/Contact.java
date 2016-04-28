import java.util.ArrayList;

public class Contact{
  private String mName;
  private static ArrayList<Contact> instances = new ArrayList<Contact>();
  private int mId;

  public Contact (String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
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

  public int getId() {
    return mId;
  }

  public static Contact find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
 }
