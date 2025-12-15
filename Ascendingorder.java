import java.util.Scanner;
public class Ascendingorder {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        boolean asc = true;

        while (num > 9) {
            int last = num % 10;
            int prev = (num / 10) % 10;

            if (prev > last) {
                asc = false;
                break;
            }
            num = num / 10;
        }

        System.out.println(asc ? "Ascending" : "Not Ascending");
    }
}
