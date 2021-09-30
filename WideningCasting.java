public class WideningCasting {
  public static void main(String[] args) {
    int vInt = 33;
    double vDouble = vInt; // Cating happens automatically from int to double
    System.out.println(vInt);      // Outputs 33
    System.out.println(vDouble);   // Outputs 33.0
  }
}