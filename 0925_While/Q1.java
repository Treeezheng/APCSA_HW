
// (1) Use random method to generate an integer number between 1~ 99999;
// (2) Judge how many digits this number has, such as 153 is a 3 digits number
// (3) out put each of the digit
public class Q1 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100000), count = 0, digit, temp = num;

        System.out.println("The number is " + num);
        while (num != 0)
        {
            num /= 10;
            count++;
        }
        System.out.println("There are " + count + " digits");
        for (int i = count; i > 0;i--)
        {
            digit = temp % 10 ;
            temp /= 10;
            System.out.println(digit);
        }
    }
}
