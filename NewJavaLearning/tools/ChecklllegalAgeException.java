package NewJavaLearning.tools;

public class ChecklllegalAgeException extends Exception{

    @Override
    public String getMessage(){
        return "Age less than 18";
    }
}
