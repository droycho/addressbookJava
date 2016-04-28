import java.util.ArrayList;

public class Email {
  private String mEmail;
  private String mEmailType;
  private static ArrayList<Email> instances = new ArrayList<Email>();

  public Email (String email, String emailType) {
    mEmail = email;
    mEmailType = emailType;
    instances.add(this);
  }

  public String getEmail() {
    return mEmail;
  }

  public String getEmailType() {
    return mEmailType;
  }

  public static ArrayList<Email> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
