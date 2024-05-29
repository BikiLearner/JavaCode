package NewJavaLearning.tools;

public class ReverseStringCommandLineArgument {

    public static void main(String[] args) {
        if(args.length!=0){
            String []str=new String[args.length];
            for(int i= args.length-1;i>=0;i--){
                System.out.println(args[i]);
            }
        }
    }
}
