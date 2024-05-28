package NewJavaLearning.tools;

public class MyException extends Exception{

    @Override
    public String getMessage(){
        return "My own Exception";
    }
}
