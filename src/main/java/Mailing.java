import java.util.ArrayList;

public class Mailing {
  private String mStreetAddress;
  private String mCity;
  private String mState;
  private String mZip;
  private String mType;
  private static ArrayList<Mailing> instances = new ArrayList<Mailing>();

  public Mailing (String street, String city, String state, String zip, String type) {
    mStreetAddress = street;
    mCity = city;
    mState = state;
    mZip = zip;
    mType = type;
    instances.add(this);
  }

  public String getMailing() {
    return mStreetAddress + ", " + mCity + ", " + mState + ", " + mZip;
  }

  public String getType() {
    return mType;
  }

  public static ArrayList<Mailing> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
