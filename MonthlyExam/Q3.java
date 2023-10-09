public class Q3 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * (120 - 0 + 1) + 0);
            System.out.println(numbers[i]);
            if (numbers[i] >= 18) {
                cnt++;
            }
        }
        System.out.println("Greater/Equal than 18: " + cnt);
        double percentage = (double) cnt / numbers.length * 100;
        System.out.println("Percentage of numbers greater or equal to 18: " + percentage + "%");

    }
}
