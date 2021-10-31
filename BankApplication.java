import java.util.Scanner;

public class BankApplication {
  // Main class
  public static void main(String[] args) {

    BankAccount obj1 = new BankAccount("Rob", "001");
    obj1.showMenu();
  }
  
}
// Bank account object
class BankAccount {

  int balance;
  int previousTransaction;
  String customerName;
  String customerId;
  

  // constructor
  BankAccount(String cName, String cId){
    customerName = cName;
    customerId = cId;
  }

  // deposit method
  void deposit(int amount) {
    if(amount != 0){
      balance = balance + amount;
      previousTransaction = amount;
    }
  }

  // withdraw method
  void withdraw(int amount) {
    if(amount != 0) {
      balance = balance - amount;
      previousTransaction = -amount;
    }
  }

  // Get previous transaction method
  void getPreviousTransaction() {
    if(previousTransaction > 0) {
      System.out.println("Deposited: " + previousTransaction);
    } else if (previousTransaction < 0) {
      System.out.println("Withdrawn: " + Math.abs(previousTransaction));
    } else {
      System.out.println("No transaction occurred");
    }
  }

  // show menu method
  void showMenu() {
    // Input char for switch
    char option = '\0';
    char capOption = '\0';

    // create scanner
    Scanner scanner = new Scanner(System.in);

    // show options
    System.out.println("Welcome " + customerName);
    System.out.println("Your Id is " + customerId);
    System.out.println("\n");
    System.out.println("A) Check Balance");
    System.out.println("B) Deposit");
    System.out.println("C) Withdraw");
    System.out.println("D) Previous transaction");
    System.out.println("E) Exit");

    // Keep allowing options unless exit
    do {
      System.out.println("==========================");
      System.out.println("Enter an option");
      System.out.println("==========================");
      // Get case option
      option = scanner.next().charAt(0);
      // Make sure selection is capitalized for switch
      capOption = Character.toUpperCase(option);
      System.out.println("");

      // options
      switch(capOption){
        case 'A':
            System.out.println("-------------------");
            System.out.println("Balance = " + balance);
            System.out.println("-------------------");
            System.out.println("\n");
            break;

          case 'B':
            System.out.println("-------------------");
            System.out.println("Enter amount to deposit");
            System.out.println("-------------------");
            int amount = scanner.nextInt();
            deposit(amount);
            System.out.println("\n");
            break;

          case 'C':
            System.out.println("-------------------");
            System.out.println("Enter amount to withdraw");
            System.out.println("-------------------");
            amount = scanner.nextInt();
            withdraw(amount);
            System.out.println("\n");
            break;

          case 'D':
            System.out.println("-------------------");
            getPreviousTransaction();
            System.out.println("-------------------");
            System.out.println("\n");
            break;

          case 'E':
            System.out.println("*******************");
            break;
          
          default:
            System.out.println("Invalid option, try again");
            break;
      }

    } while(capOption != 'E' );
    // close scanner
    scanner.close();
    // exit message
    System.out.println("Thank You for using our services.");

  }
}

