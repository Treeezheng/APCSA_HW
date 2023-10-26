public class APLine {
    public static void main(String[] args) {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();// slope1 is assigned -1.25
        boolean onLine1 = line1.isOnLine(5, -2);// true because5(5)+4(-2)+(-17)=0
        System.out.println(slope1);
        System.out.println(onLine1);
    }

    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;xw
    }

    public double getSlope() {
        return (double) -a / b;
    }

    public boolean isOnLine(int x, int y) {
        return a * x + b * y + c == 0;
    }
}