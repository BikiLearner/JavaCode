public class LearningRecurssion {
    static int count=0;
    public static void main(String[] args) {
        fun();
    }

    public static void fun(){
        if(count==4)
            return;
        System.out.println(count);
        count++;
        fun();
    }
}
