import java.util.*;

public class quizagme {
    public static void main(String[] args) {
        
        String [] questions = {"What is the main function of a router?",
                               "Which part of the computer is considered as its brain?",
                               "What year was facebook launched?",
                               "Who is known as the father of computer?",
                               "What was the first programming language?"};  
                               
        String [] [] choices = {{"1. Storing files" , "2. Collecting frames" , "3. Directing Internet Traffic" , "4. Managing Passwords"},
                                {"1. CPU " , "2. Hardware " , "3. RAM " , "4. GPU "},
                                {"1. 2000 " , "2. 2004 " , "3. 2006 " , "4. 2008 "},
                                {"1. Steve Jobs " , "2. Bill gates " , "3. Alan Turing " , "4. Charles Babbage "},
                                {"1. COBOL " , "2. C " , "3. Fortram " , "4. Assembly "}};

        int [] answers = {3 , 1 , 2 , 4 , 3};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the JAVA quiz game");
        System.out.println("******************************");

        for(int i = 0; i<questions.length ; i++){
            System.out.println(questions[i]);

            for(String choice : choices[i]){
                System.out.println(choice);
            }
            System.out.print("Enter your choice (1-4): ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }else{
                System.out.println("WRONG!!!!!");
            }
        }


        System.out.println("Your final score is: " + score + " out of " + questions.length);
        sc.close();
    }
}
