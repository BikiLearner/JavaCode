public class WildcardMatching {
    public static void main(String[] args) {
        String s = "";
        String p = "******";
        System.out.println(isMatch(s, p));
        System.out.println(isMatch2(s, p));
    }

    public static boolean isMatch(String s, String p) {
        int sl = s.length();// i
        int pl = p.length();// j
        boolean[][] dp = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;

        for (int i = 1; i <= sl; i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j <= pl; j++) {
            boolean flag = true;
            for (int ii = 1; ii <= pl; ii++) {
                if (p.charAt(ii-1) != '*') {
                    flag = false;
                    break;
                }
            }
            dp[0][j] = flag;
        }
        for (int j = 1; j <= pl; j++) {
            for (int i = 1; i <= sl; i++) {
                if (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '?')
                    dp[i][j]=dp[i-1][j-1];
                else if (p.charAt(j-1) == '*') {
                   dp[i][j]=(dp[i][j-1] || dp[i-1][j]);
                }else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[sl][pl];
    }
    public static boolean isMatch2(String s, String p) {
        int sIndex=0,pIndex=0,matchIndex=0,starIndex=-1;
        while(sIndex < s.length()){
            if(pIndex < p.length() && (s.charAt(sIndex) == p.charAt(pIndex)|| p.charAt(pIndex) == '?')){
                sIndex++;
                pIndex++;
            }else if(pIndex < p.length() && p.charAt(pIndex) == '*'){
                starIndex = pIndex;
                matchIndex = sIndex;
                pIndex++;
            }else if(starIndex!=-1){
                pIndex = starIndex+1;
                matchIndex++;
                sIndex=matchIndex;
            }else{
                return false;
            }
        }
        while(pIndex < p.length() && p.charAt(pIndex) == '*'){
            pIndex++;
        }
        return pIndex == p.length();
        }
}
