import java.util.*;

public class numberguesinggame{
    public static void main (String args[]){
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int randomnumber = rm.nextInt(1,100);

        do{
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempt++;

            if(guess < randomnumber){
                System.out.println("Guessed too low , try again");
            }else if(guess > randomnumber){
                System.out.println("Guessed too high , try again");
            }else{
                System.out.println("Correct the number was " + randomnumber);
                System.out.println("no of attempts: "+attempt);
            }
        }while(guess != randomnumber);
        System.out.println("You have won");
        sc.close();
    }
}