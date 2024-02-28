package NewJavaLearning;

import NewJavaLearning.tools.B;

public class Biki {
    static String name;
//    static {
//        name="Biki";
//        System.out.println("Yes the class is loaded wow");
//    }
    public static void main(String [] args) throws InterruptedException {
        B b=new B();
        Runnable r1=()->{
          for(int p=0;p<10;p++){
              b.show();
              try {
                  Thread.sleep(10);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Runnable r2=()->{
            for(int p=0;p<10;p++){
                b.show();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(b.count);
    }
}
