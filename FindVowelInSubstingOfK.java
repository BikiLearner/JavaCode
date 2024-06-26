public class FindVowelInSubstingOfK {
    public static void main(String[] args) {
        String s = "jafkldjfladjsfadsfadsfadsfads";
        int k = 3;
        int p = k;
        System.out.println(s.length());
        if (s.length() > 100000) {
            System.out.println(s.length());
        } else {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < s.length(); i++) {
                if (p <= s.length()) {
                    String str = s.substring(i, p);
                    max = Math.max(max, countVowel(str));
                    p += 1;
                }
            }
            System.out.println("The max = " + max + " p= " + p);
        }
    }

    public static int countVowel(String s) {
        int numVowel = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                numVowel++;
            }
        }
        return numVowel;
    }
}
