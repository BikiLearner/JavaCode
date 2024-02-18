public class StringToInt {
    public static void main(String[] args) {
        Integer.parseInt("2147483647");
        String str = "0000000000012345678";
        int sign=1;
        int result=0;
        str = str.trim();
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0)=='-')?-1:1;
            str=str.substring(1);
        }
        int len = str.length();
        for (int i = 0; i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9'; i++) {
            int digit = str.charAt(i)-'0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                 System.out.println((sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
            result = result * 10 + digit;
        }
        System.out.println(result);
        
    }
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int result = 0;
    
        // Remove leading whitespace
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
    
        // Check for sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
    
        // Read digits until a non-digit character or the end of the input
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
    
            // Check for overflow
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
    
            result = result * 10 + digit;
            index++;
        }
    
        return result * sign;
    }
    

}
