import java.util.Scanner;
public class DigitInWords {
    public static void main(String[] args) {

        int num = 507;
        String[] words = {
            "Zero","One","Two","Three","Four",
            "Five","Six","Seven","Eight","Nine"
        };

        String s = Integer.toString(num);

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            System.out.print(words[d] + " ");
        }
    }
}
