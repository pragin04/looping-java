import java.util.Scanner;
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int num =sc.nextInt();
        int min = 9;

        while (num > 0) {
            if (num % 10 < min)
                min = num % 10;
            num /= 10;
        }

        System.out.println(min);
    }
}

