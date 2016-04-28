import java.util.ArrayList;

public class Phone {
  private String mAreaCode;
  private String mNumber;
  private String mType;
  private static ArrayList<Phone> instances = new ArrayList<Phone>();

  public Phone (String areaCode, String number, String type) {
    mAreaCode = areaCode;
    mNumber = number;
    mType = type;
    instances.add(this);
  }

  public String getPhoneNumber() {
    return "(" + mAreaCode + ")" + mNumber;
  }

  public static ArrayList<Phone> all() {
    return instances;
  }

}
