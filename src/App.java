import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    double[] lotteryNums = new double[] { 45, 92, 38, 33, 21 };
    System.out.println("Ausgabe = " + lotteryNums[1]);

    for (int i = lotteryNums.length - 1; i >= 0; i = i - 2) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println("/n");
    for (double item : lotteryNums) {
      System.out.println(item);
    }
    System.out.println("/--");
    Arrays.stream(lotteryNums).forEach(System.out::println);

  }

}