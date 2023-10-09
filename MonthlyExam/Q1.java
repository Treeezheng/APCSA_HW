public class Q1 {
    public static void main(String[] args) {
        // Random Generation
        int r = (int) (Math.random() * 100000);
        System.out.println(r);
        // Count digits
        int rtmp = r, cnt = 0;

        while (rtmp != 0) {
            rtmp /= 10;
            cnt++;
        }
        System.out.println(cnt);
        // Output each digits
        rtmp = r;
        int digit;
        for (int i = cnt; i > 0; i--) {
            digit = rtmp % 10;
            rtmp /= 10;
            System.out.println(digit);
        }

    }
}