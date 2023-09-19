package APCSA_HW.Prize;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Enter the number of prizes (1 for the first, 2 for the second, 3 fot the third, 0 for participate): ");
        int prize = scan.nextInt();
        switch (prize) {
            case 1:
                System.out.println("10000RMB! You will buy a new notebook");
                break;
            case 2:
                System.out.println("5000RMB! You will buy a new iPad");
                break;
            case 3:
                System.out.println("2000RMB! You will buy a new backpack");
                break;
            case 0:
                System.out.println("500RMB! You will go out for a big meal");
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
