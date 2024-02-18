public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        int w=0,l=0,r=0;
        while(r<s.length()){
            System.out.println(s.substring(l, r));
            if(s.substring(l, r).contains(t)){
                return s.substring(l,r);
            }
            r++;
        }
        return "";
    }
}
