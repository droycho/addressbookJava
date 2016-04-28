import java.util.ArrayList;

public class Contact{
  private String mFirstName;
  private String mLastName;
  private String mBirthMonth;
  private static ArrayList<Contact> instances = new ArrayList<Contact>();
  private int mId;
  private ArrayList<Phone> mPhones;
  private ArrayList<Email> mEmails;
  private ArrayList<Mailing> mMailings;

  public Contact (String firstName, String lastName, String birthMonth) {
    mFirstName = firstName;
    mLastName = lastName;
    mBirthMonth = birthMonth;
    instances.add(this);
    mId = instances.size();
    mPhones = new ArrayList<Phone>();
    }

  public String getName() {
    return mFirstName + " " + mLastName;
  }

  public String getBirthMonth() {
    return mBirthMonth;
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

  public ArrayList<Phone> getPhones() {
    return mPhones;
  }

  public void addPhone(Phone phone) {
    mPhones.add(phone);
  }
 }
