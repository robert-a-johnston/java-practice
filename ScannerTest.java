import java.util.Scanner;

public class ScannerTest {
  
  public static void main(String[] args) {
    // create a scanner
    Scanner scanner = new Scanner(System.in);

    // text to ask for imput
    System.out.println("Enter an int:");
    // get next integer
    int a = scanner.nextInt();
    // output int
    System.out.println("Value = " + a);

    System.out.println("Enter a char: ");
    char b = scanner.next().charAt(0);
    System.out.println("Char = " + b);
  }
}