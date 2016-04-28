import java.util.ArrayList;

public class Email {
  private String mEmail;
  private String mType;
  private static ArrayList<Email> instances = new ArrayList<Email>();

  public Email (String email, String type) {
    mEmail = email;
    mType = type;
    instances.add(this);
  }

  public String getEmail() {
    return mEmail;
  }

  public String getType() {
    return mType;
  }

  public static ArrayList<Email> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
