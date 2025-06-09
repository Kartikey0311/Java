import java.util.*;
public class dicerolling {
    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);
    Random rc = new Random();

    int numofDice;
    int total = 0;

    System.out.print("Enter the no. of dice to be rolled: ");
    numofDice = sc.nextInt();

    if(numofDice > 0){
        for(int i = 0;i<numofDice ; i++){
            int roll = rc.nextInt(1,7);
            printDie(roll);
            System.out.println("You rolled: " + roll);
            total = total + roll;
        }
        System.out.println("Total: " + total);
    }else{
        System.out.println("No. of dice must be greater than 0");
    }
    sc.close();
    
    }
    static void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;

         String dice2 = """
                -------
               | ●     |
               |       |
               |      ●|
                -------
                """;

         String dice3 = """
                -------
               | ●     |
               |   ●   |
               |      ●|
                -------
                """;

         String dice4 = """
                -------
               | ●    ●|
               |       |
               | ●    ●|
                -------
                """;

        String dice5 = """
                -------
               | ●    ●|
               |   ●   |
               | ●    ●|
                -------
                """;
          String dice6 = """
                -------
               | ●    ●|
               | ●    ●|
               | ●    ●|
                -------
                """;

        switch(roll){
            case 1-> System.out.print(dice1);
            case 2-> System.out.print(dice2);
            case 3-> System.out.print(dice3);
            case 4-> System.out.print(dice4);
            case 5-> System.out.print(dice5);
            case 6-> System.out.print(dice6);
            default-> System.out.print("invalid roll");
        }
    }
}
