import java.util.Scanner;
class Descendingorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        boolean desc = true;

        while (num > 9) {
            int last = num % 10;
            int prev = (num / 10) % 10;

            if (prev < last) {
                desc = false;
                break;
            }
            num = num / 10;
        }

        System.out.println(desc ? "Descending" : "Not Descending");
    }
}
