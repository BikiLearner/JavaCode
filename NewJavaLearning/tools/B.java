package NewJavaLearning.tools;

public sealed class B permits Biki {
    public int count=0;
//    public B(){
//        super(4);//this function is getting called , which is constructor of Class A which is
////        super class of B and B is the subclass
//        System.out.println("Hello Biki");
//    }
//    public B(int a){
//        this();// it calls the constructor of the same class
//        System.out.println("Hello Biki" + a);
//    }
    public synchronized void show(){
        this.count+=1;
    }
}
