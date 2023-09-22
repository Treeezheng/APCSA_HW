public class App {
    public static void main(String[] args) {
        // This code counts all the sum of even numbers from 1 to 100
        int sum = 1, count = 0;
        while (sum <= 100) {
            if (sum % 2 == 0) {
                count += sum;
            }
            sum++;
        }
        System.out.println(count);
    }
}
