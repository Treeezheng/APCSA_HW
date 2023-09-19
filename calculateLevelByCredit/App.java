import java.util.Scanner;

//This code calculate the Level of a person by inputing the credit number
public class App {
    public static void main(String[] args) {
        System.out.println("What is your credit");
        int credit;
        Scanner newNum = new Scanner(System.in);
        credit = newNum.nextInt();
        if (credit > 50000) {
            System.out.println("You are PLATINUM");
        } else if (credit >= 10000 && credit <= 50000) {
            System.out.println("You are GOLD");
        } else {
            System.out.println("You are SILVER");
        }

    }
}
