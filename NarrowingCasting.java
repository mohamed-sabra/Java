public class NarrowingCasting {
  public static void main(String[] args) {
    double vDouble = 33.33d;
    int vInt = (int) vDouble; // Casting is done manually from double to int by addind explicitly (int)

    System.out.println(vDouble);   // Outputs 33.33
    System.out.println(vInt);      // Outputs 33
  }
}