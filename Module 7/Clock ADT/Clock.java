/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    int hours,minutes;
    public Clock(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {
        this.hours = Integer.parseInt(s.substring(0, 2));
        this.minutes = Integer.parseInt(s.substring(3, 5));
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String h = this.hours + "";
        String m = this.minutes + "";
        if (this.hours < 10) {
            h = "0" + h;
        }
        if (this.minutes < 10) {
            m = "0" + m;
        }
        return h+":"+m;
    }
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.hours < that.hours) {
            return true;
        } else if (this.hours == that.hours && this.minutes < that.minutes) {
            return true;
        } else {
            return false;
        }
        
    }

    // private void check() {
        
    // }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        this.minutes++;
        if (this.minutes == 60) {
            this.minutes = 0;
            this.hours++;
        }
        if (this.hours ==24) {
            this.hours = 0;
        }
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        if (delta > 0) {
            int addmin = delta % 60;
            int addhr = (int)Math.floor(delta/60);
            int finalmin = this.minutes + addmin;
            int finalhr = this.hours + addhr;
            if (finalmin >= 60) {
                this.minutes = finalmin - 60;
                finalhr++;
            } else {
                this.minutes = finalmin;
            }
            if (finalhr >= 24) {
                this.hours = finalhr % 24;
            } else {
                this.hours = finalhr;
            }
        }
    }
    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}
