import java.util.Scanner;
class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0)
                evenSum = evenSum + digit;
            else
                oddSum = oddSum + digit;

            num = num / 10;
        }

        System.out.println(evenSum - oddSum);
    }
}
