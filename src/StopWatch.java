import java.util.Scanner;

public class StopWatch {


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        System.out.println("Press '1' to Start Time: ");
        Scanner scan = new Scanner(System.in);
        int timer = scan.nextInt();
        stopWatch.start();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");

        int timer1 = scan.nextInt();

        stopWatch.stop();

        long l = stopWatch.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is:" + l);
        System.out.println();
        System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");

    }

    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;

    //to start timer
    public void start() {
        startTimer = System.currentTimeMillis();
        System.out.println("Start Time is: " + startTimer);
    }

    // to stop timer
    public void stop() {
        stopTimer = System.currentTimeMillis();
        System.out.println("Stop Time is: " + stopTimer);
    }

    public long getElapsedTime() {
        elapsed = stopTimer - startTimer;
        return elapsed;
    }

}