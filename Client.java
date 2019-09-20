public class Client {

  public static void main(String[] args) {
    genericAdd m = new genericAdd();
    int a = 3;
    double b = 4.555;
    System.out.println(m.addToDouble(a, b));
    System.out.println(m.addToInteger(a, b));
  }

}
