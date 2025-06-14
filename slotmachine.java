import java.util.*;
public class slotmachine{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int balance = 100;
    int bet;
    int payout;
    String [ ] row;
    String playAgain;


    //welcome msg
    System.out.println("*************************");
    System.out.println("  Welcome to JAVA Slots  ");
    System.out.println("Symbols: 1 2 3 4 5  ");
    System.out.println("*************************");

    while(balance>0){
        System.out.println("Current balance: $" + balance);
        System.out.print("Place your bet amount: ");
        bet = sc.nextInt();
        sc.nextLine();

        if(bet>balance){
            System.out.println("Insuufficient Balance");
            continue;
        }else if(bet<=0){
            System.out.println("Bet must be greater than 0");
            continue;
        }else{
            balance -= bet;
            System.out.println("$" + balance);
        }


        System.out.println("Spining.....");
        row = spinRow();
        printRow(row);
         payout = getPayout(row,bet);

         if(payout>0){
            System.out.println("You won : $" + payout);
            balance +=payout;
         }else{
            System.out.println("You lost");
         }
         System.out.print("Do yo want to play again(Y/N): ");
         playAgain = sc.nextLine().toUpperCase();

         if(!playAgain.equals("Y")){
            break;
         }
    }
    System.out.println("Thank you for playing!");

    sc.close();
   } 
   static String[] spinRow(){
    String [] symbols = {"1","2","3","4","5"};
    String [] row = new String[3];
    Random rc = new Random();

    for(int i =0;i<3 ; i++){
        row[i] = symbols[rc.nextInt(symbols.length)];
    }

    
    return row;
   }
   static void printRow(String [] row){
    System.out.println("*************");
    System.out.println(" " + String.join(" | ", row));
    System.out.println("*************");

   }

   static int getPayout(String [] row , int bet){
    if(row[0].equals(row[1]) && row[1].equals(row[2])){
        return switch(row[0]){
            case "1"-> bet * 3;
            case "2"-> bet * 4;
            case "3"-> bet * 5;
            case "4"-> bet * 6;
            case "5"-> bet * 20;
            default-> 0;
        };
        }
        else if(row[0].equals(row[1]) ){
            return switch(row[0]){
            case "1"-> bet * 2;
            case "2"-> bet * 3;
            case "3"-> bet * 4;
            case "4"-> bet * 5;
            case "5"-> bet * 10;
            default-> 0;
        };
    }
    return 0;
   }
}

