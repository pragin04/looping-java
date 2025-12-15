import java.util.Scanner;
public class Swapfirstandlast {
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int last = num % 10;
        int first = num;

        while (first >= 10)
            first /= 10;

        int middle = num % (int)Math.pow(10, (int)Math.log10(num));
        middle = middle / 10;

        int result = last * (int)Math.pow(10, (int)Math.log10(num))
                   + middle * 10 + first;

        System.out.println(result);
     }
}
