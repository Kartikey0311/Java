import java.util.*;
public class weightconvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double newweight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1 for lbs to kgs");
        System.out.println("2 for kgs to lbs");

        System.out.print("Choose a option: ");
        choice = sc.nextInt();


        if(choice ==1){
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newweight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f " , newweight);
        }else if(choice ==2){
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newweight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f " , newweight);
        }else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
    
}
