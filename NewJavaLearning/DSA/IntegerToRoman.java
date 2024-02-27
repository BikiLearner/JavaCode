package NewJavaLearning.DSA;

public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3;
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder romVal = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                romVal.append(symbols[i]);
            }
        }

        System.out.println(Character.isDigit(0));
    }
}
