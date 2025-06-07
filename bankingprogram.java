import java.util.*;

public class bankingprogram{
     static Scanner sc = new Scanner(System.in);
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;
        int choice;
        
        while(isRunning){
        System.out.println("******************");
        System.out.println("Banking Program");
        System.out.println("******************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("******************");

        System.out.print("Enter your choice(1-4): ");
        choice = sc.nextInt();

        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance +=deposit();
            case 3 -> balance -= Withdraw(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("Invalid choice");

        }


        }
        System.out.println("******************");
        System.out.println("Thank you , Have a nice day!!");

        
        sc.close();
   }
    static void showBalance( double balance){
    System.out.println("******************");
    System.out.printf("$%.2f\n" , balance);
   }
    static double deposit(){
    double amount;
    System.out.print("Enter the amount to deposit: ");
    amount = sc.nextDouble();
    if(amount < 0){
        System.out.println("Amount can't be negative!!");
        return 0;

    }else{
        return amount;
    }


    
}
    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient Funds!!");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount can't be less then 0");
            return 0;
        }else{
            return amount;
        }
        
    }
}
