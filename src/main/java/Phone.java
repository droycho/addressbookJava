import java.util.ArrayList;

public class Phone {
  private String mAreaCode;
  private String mNumber;
  private String mPhoneType;
  private static ArrayList<Phone> instances = new ArrayList<Phone>();

  public Phone (String areaCode, String number, String phoneType) {
    mAreaCode = areaCode;
    mNumber = number;
    mPhoneType = phoneType;
    instances.add(this);
  }

  public String getPhoneNumber() {
    return "(" + mAreaCode + ")" + mNumber;
  }

  public String getPhoneType() {
    return mPhoneType;
  }

  public static ArrayList<Phone> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
