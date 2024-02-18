public class ReverseWhenGetI {
    public static void main(String[] args) {
        String s="poiinter";
        String newstr="";
        System.out.println(rev("str"));
        int len=s.length();
        s=s.trim();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(ch=='i'){
                String p=newstr;
                newstr="";
                newstr+=rev(p);
            }else{
                newstr+=ch;
            }
        }
        System.out.println(newstr);
    }
    public static String rev(String str){
        String newstr="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
            newstr+=str.charAt(i);

        return newstr;
    }
}
