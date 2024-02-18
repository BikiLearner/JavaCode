public class RunUrCode {
    public static void main(String[] args) {
        DynamicArray num=new DynamicArray(3);
        num.insert(25);
        num.insert(40);
        num.removeAt(1);
        num.print();
        System.out.println(num.indexOf(40));
    }
}
