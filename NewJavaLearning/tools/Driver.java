package NewJavaLearning.tools;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ;
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age < 18) {
                throw new ChecklllegalAgeException();
            }
        } catch (ChecklllegalAgeException e) {
            System.out.println(e);
        }
    }
}
