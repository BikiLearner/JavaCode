package NewJavaLearning.collegeJavaCodes;

public class RunningThread {

    public static void main(String[] a) {
        Thread ping = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Ping");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread pong = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Pong");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        ping.start();
        pong.start();
    }
}
