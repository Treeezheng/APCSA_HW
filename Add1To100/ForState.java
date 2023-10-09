public class ForState {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += i;
        }
        System.out.println(count);
    }
}
