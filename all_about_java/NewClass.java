public class NewClass {
    public static void main(String[] args) {
        int n1=8;
        int n2=8;
        int mult=0;
        for(int i=1;i<=n1;i++){
            mult+=n2;
        }
        
        if(checkPalindrome(0001)){
            System.err.println("It is plaindrome");
        }else{
            System.err.println("It is Not palindrome");
        }
       
    }
    private static boolean checkPalindrome(int number){
        int n=number,rev=0,rem=0;
        while (n!=0) {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==number){
            return true;
        }else{
            return false;
        }

    }
    
}
