package NewJavaLearning.DSA;

public class ValidNumber {
    public static void main(String[] args) {
        String str = "-+45";
        System.out.println(isNumber(str));

    }

    public static boolean isNumber(String str) {
        if (str.length() > 1 && str.charAt(0) == '.') {
            return checkForOthers(str);
        } else if (str.charAt(0) == '+' || str.charAt(0) == '-' ||
                str.charAt(0) == '0' || Character.isDigit(str.charAt(0))) {
            System.out.println("hello");
            return checkForOthers(str);
        }

        return false;

    }
    public static boolean checkForOthers(String str){
        for (int i = 1; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (!(Character.isDigit(ch) || ch == 'e' || ch == 'E' || ch == '.' || ch == '+' || ch == '-')) {
                return false;
            }
        }
        return true;
    }
}

