import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "au"; // Replace with your input string
        longSuStingPalindromic(s);
    }

    public static void allSubString(String str) {
        if (str.length() < 2)
            System.out.println(str.length());
        else {
            int count = 0, win = 0;
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {

                    if (!hasDuplicateChars(str.substring(i, j + 1))) {
                        System.out.println(str.substring(i, j + 1));
                        count = str.substring(i, j + 1).length();
                        System.out.println(count);
                    }
                    win = Math.max(count, win);
                }
            }
            System.out.println(win);
        }
    }

    public static void longSuSting(String s) {
        int count = 0, win = 1, i = 0, j = 1;
        String str = "";
        while (j < s.length() && i < j) {
            str = subStr(i, j + 1, s);
            System.out.println(str);
            if (!hasDuplicateChars(str)) {
                count = str.length();
                System.out.println(count);
                win = Math.max(win, count);

                j++;
            } else {
                count = 0;
                i++;
                j++;
                str.substring(1);
            }

        }
        System.out.println(win);
        System.out.println(isPalindrome("bab"));
    }

    public static void longSuStingPalindromic(String s) {
        int count = 0, win = 1, i = 0, j = 1;
        String str = "",palinStr="";
        while (j < s.length() && i < j) {
            str = subStr(i, j + 1, s);
            System.out.println(str);
            if (!isPalindrome(str)) {
                count = str.length();
                System.out.println(count);
                if(win<count){
                    palinStr=str;
                    win=count;
                }
                j++;
            } else {
                count = 0;
                i++;
                j++;
                str.substring(1);
            }

        }
        System.out.println(win);
        System.out.println(palinStr);
    }

    public static String subStr(int i, int j, String str) {
        String newStr = "";
        for (; i < j; i++) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static boolean hasDuplicateChars(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (charSet.contains(ch)) {
                return true;
            }
            charSet.add(ch);
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) != str.charAt(r))
                return false;

            l++;
            r--;
        }
        return true;
    }

}
