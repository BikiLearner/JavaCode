import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Interest: ");
        float interest = scanner.nextFloat();
        System.out.print("Time in years: ");
        int time = scanner.nextInt();
        float si = (principal * interest * time) / 100;

        System.out.println("The SImple Interest = " + NumberFormat.getCurrencyInstance(Locale.US).format(si));
    }
}
