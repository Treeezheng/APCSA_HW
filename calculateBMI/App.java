package APCSA_HW.calculateBMI;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("输入您的体重(kg)：");
        Scanner newNum = new Scanner(System.in);
        double weight = newNum.nextDouble();
        System.out.println("输入您的生理性别");
        String sex = newNum.next();
        System.out.println("输入您的身高(m or cm)");

        double height = newNum.nextDouble();
        if (height > 60 && height < 250) {
            height = height / 100;
        } else if (height < 0 || height > 2.5) {
            System.out.print("输入错误");
            System.exit(0);
        }
        Double rawBMI = weight / (height * height);
        DecimalFormat df = new DecimalFormat("##.##");
        String formattedBMIString = df.format(rawBMI);
        double BMI = Double.parseDouble(formattedBMIString);
        if (sex.equals("男") || sex.equals("男性") || sex.equals("male") || sex.equals("Male") || sex.equals("boy")
                || sex.equals("Boy")) {
            if (BMI >= 26.4) {
                System.out.println("您的BMI为" + BMI + "，属于肥胖");
            } else if (BMI > 23.3 && BMI < 26.3) {
                System.out.println("您的BMI为" + BMI + "，属于超重");
            } else if (BMI > 16.5 && BMI < 23.2) {
                System.out.println("您的BMI为" + BMI + "，属于正常");
            } else if (BMI <= 16.4) {
                System.out.println("您的BMI为" + BMI + "，属于低体重");
            }
        } else if (sex.equals("女") || sex.equals("女性") || sex.equals("female") || sex.equals("Female")
                || sex.equals("girl") || sex.equals("Girl")) {
            if (BMI >= 25.3) {
                System.out.println("您的BMI为" + BMI + "，属于肥胖");
            } else if (BMI > 22.8 && BMI < 25.2) {
                System.out.println("您的BMI为" + BMI + "，属于超重");
            } else if (BMI > 16.5 && BMI < 22.7) {
                System.out.println("您的BMI为" + BMI + "，属于正常");
            } else if (BMI <= 16.4) {
                System.out.println("您的BMI为" + BMI + "，属于低体重");
            }

        } else {
            System.out.println("输入错误");
        }
        newNum.close();
    }
}