public class Q2 {
    public static void main(String[] args) {
        int ran1 = (int) (Math.random() * 285 + 15);
        int ran2 = (int) (Math.random() * 285 + 15);
        int cnt = 0;
        if (ran1 > ran2) {
            for (int i = ran2; i <= ran1; i++) {
                if (i % 2 == 1) {
                    cnt += i;
                }
            }
        } else {
            for (int i = ran1; i <= ran2; i++) {
                if (i % 2 == 1) {
                    cnt += i;
                }
            }
        }
        System.out.println(cnt);
    }
}
