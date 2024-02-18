public class DivideTwoInteger {
    public static void main(String[] args) {

        int dividend = 2147483647, divisor = 2;
        if ((dividend > Integer.MAX_VALUE/10 || dividend < Integer.MIN_VALUE/10) && 
        divisor==-1 &&  dividend < 0) {
            System.out.println(Integer.MAX_VALUE);
        } else {
            int q = (int) (dividend / divisor);
            if (q > (Integer.MAX_VALUE - 1)) {
                System.out.println((Integer.MAX_VALUE - 1));
            } else if (q < Integer.MIN_VALUE) {
                System.out.println(Integer.MIN_VALUE);
            } else {
                System.out.println(q);
            }
        }
      

    }
}
