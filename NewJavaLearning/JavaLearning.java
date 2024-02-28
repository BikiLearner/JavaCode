package NewJavaLearning;

public class JavaLearning  {
    public static void main(String[] args) throws ClassNotFoundException {
        int a=234;
        byte b=(byte) a;
        int i=0;
        while(i<=4){
            System.out.println(i);
            i++;
        }
        int arr[]=new int[45];
        int r=arr.length;
        String str;

        //good to know
        Class.forName("NewJavaLearning.tools.Biki");
    }
}
