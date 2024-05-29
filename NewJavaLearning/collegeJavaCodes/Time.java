package NewJavaLearning.collegeJavaCodes;

public class Time {
    private final int hour;
    private final int min;
    private final int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }


    public int getMin() {
        return min;
    }


    public int getSec() {
        return sec;
    }

    public void add(Time obj) {
        int h = this.hour + obj.getHour();
        int m = this.min + obj.getMin();
        int s = this.sec + obj.getSec();

        if (s >= 60) {
            m += s / 60;
            s = s % 60;
        }

        if (m >= 60) {
            h += m / 60;
            m = m % 60;
        }
        System.out.println(h + ":" + m + ":" + s);
    }

}
