package all_about_java;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;;

public class Coding {
    public static void main(String[] args) {
        learningObject();

    }

    // it is to generate random number boolean
    // it is under import java.util.Random; class
    private static void randomFun() {
        Random rand = new Random();
        int r = rand.nextInt();
        double r1 = rand.nextGaussian();
        System.out.println(r1);
    }

    // For using GUI first time
    // we used javax.swing.JOptionPane class
    private static void gui() {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello" + name);
    }

    private static void learningStrings() {
        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String str = "Biki";
    }

    private static void learnignWrapperClass() {
        // Wrapper Class=provides a way to use primitive data type as reference data
        // types
        // referrence datatype contains usefull method
        // can be use with collection (ex:ArrayList)
        // wrapper class example are Character,Integer(for int),etc goo gpt
        /*
         * autoboxing= the automatic conversion that the java compiler makes between the
         * primitive data
         * types and their corresponding object wrapper classes
         * 
         * unboxing=reverse of autoboxing.Automatic conversion of wrapper class to
         * primitive
         */

        Boolean a = true;// it provide extra functionallity
        Character ch = 'A';
        Integer i = 23;
        Double d = 234.32;

    }

    private static void arrayListLearning() {
        /*
         * ArrayList= a resiable array
         * Element can be added or remove after compilation phase
         * store reference datatype
         * it is present in util class
         */
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.size();
        a.get(1);
        a.set(0, 23);
        a.remove(0);

        // 2D arraylist

        ArrayList<ArrayList<Integer>> food = new ArrayList<>();
        food.add(a);

        // for-each loop= traversing technique to iterate through the element in an
        // array/collection
        // less step,more readable
        // less flexible

        for (int i : a) {
            System.err.println(i);
        }

    }

    // overloaded method = method that share the same name but with different
    // parameters
    // method name + parameters =method signature

    private static int add(int a, int b) {
        return a + b;
    }

    private static int add(int a, int b, int c) {
        return a + b;
    }

    private static int add(int a, int b, int c, int d) {
        return a + b;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    // fun overloading end here
    //

    private static void printfFun() {
        // printf work as same as C
        System.out.printf("Hi Biki is of age %d", 21);
    }

    // object is a instance of a class that may contain attributes and methods
    private static void learningObject() {
        FunClass fun = new FunClass(2, 3);
        System.out.printf("The answer = %d", fun.add());
    }
    // overloaded constructor = method that share the same name but with different
    // parameters

    /*
     * toString()=special method that all object inherit,
     * that returns a string that "textually represent" an object.
     * can be use both implictily and explictly
     * we can override toString() to return our won text and this is explict use of
     * toString()
     */

    /*
     * How static work in java
     * static = modifier. A single copy of variable/method is created and shared.
     * The class "owns" the static members
     */

    /*
     * inheritance = the process where one class aquires,
     * the attributes and method of another
     * to use inheritance we use extends keyword
     * parent class(super class):public class veicle
     * child class(sub class):public class car extends veicle
     * 
     */

    /*
     * method overriding= declaring a method in sub class,
     * which is already present in parent class.
     * done so that a child class can give it own implementation
     */

    /*
     * abstract = abstract classes cannot be instantiated , but they can have a
     * subclass
     * abstract class ar declare without an implementation
     * it is an standard or a idea that can be use by other child class in there own
     * way
     */

    /*
     * Access modifier
     * 1. Public access modifier:
     * - Members declared as public are accessible from any other class.
     * - There are no restrictions on accessing public members.
     *
     * 2. Private access modifier:
     * - Members declared as private are only accessible within the same class.
     * - This is the most restrictive access level.
     *
     * 3. Protected access modifier:
     * - Members declared as protected are accessible within the same package and by
     * subclasses, even if they are in different packages.
     *
     * 4. Default (Package-Private) access modifier:
     * - If no access modifier is specified, the default access level is
     * package-private.
     * - Members with default access are accessible only within the same package.
     */

     /* Encapsulation = attribute of a class will be hidden or private 
      *                 can be accessed only through methods (getter & setter)
      *                 you should make attribute private if u do not have any reason to 
      *                 make them public or protected
      */

    /*
     * interface = a template that can be applied to a class
     *              similar to inheritance , specifies what a class has/must do
     *              classes can apply more than one interface , inheritance is limited to 1 super class
     * public class hello implements prey 
     * here prey is an interface
     */

    // Start from Enclapution
    // https://youtu.be/xk4_1vDrzzo?si=jGZMWp-dopfN_N5f

}