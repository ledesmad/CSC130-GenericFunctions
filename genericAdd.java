import java.lang.Integer;
public class genericAdd {

  //Constructor
  public genericAdd() {
  }

  //Converts two values of different data types to double and adds them.
  public <E extends Number, T extends Number> double addToDouble(E a, T b) {
    return a.doubleValue() + b.doubleValue() ;
  }

  //Converts two values of different data types to integer and adds them.
  public <E extends Number, T extends Number> int addToInteger(E a, T b) {
    return a.intValue() + b.intValue();
  }
}