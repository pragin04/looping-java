import java.util.Scanner;
public class Firstdigitevenorodd {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>=10){
          num=num/10;
        }
        if(num%2==0)
        {
            System.out.println(num+" even number");
        }
        else
        {
            System.out.println(num+" odd number");
        }
    }
}