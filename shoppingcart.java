import java.util.*;
public class shoppingcart {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = sc.nextLine();
        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();
        total  = price*quantity;
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total bill is " + total + currency);
        sc.close();

}}
