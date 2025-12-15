import java.util.Scanner;
public class Digitfrequency {
    public static void main(String[] args) {
        int num = 122333;
        int[] f = new int[10];

        while (num > 0) {
            f[num % 10]++;
            num /= 10;
        }

        for (int i = 0; i < 10; i++)
            if (f[i] > 0)
                System.out.println(i + " : " + f[i]);
    }
}
