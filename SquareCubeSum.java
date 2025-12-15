import java.util.Scanner;
public class SquareCubeSum {
    public static void main(String[] args) {

        int num = 123;
        int squareSum = 0;
        int cubeSum = 0;

        while (num > 0) {
            int digit = num % 10;

            squareSum = squareSum + (digit * digit);
            cubeSum = cubeSum + (digit * digit * digit);

            num = num / 10;
        }

        System.out.println(squareSum);
        System.out.println(cubeSum);
    }
}
