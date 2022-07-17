import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int inhale = 4;
        int hold = 4;
        int exhale = 6;
        long minutes = 1;

        long endTime = System.nanoTime() + TimeUnit.NANOSECONDS.convert(minutes, TimeUnit.MINUTES);
        while (System.nanoTime() < endTime) {
            System.out.println("inhale");
            countdown(inhale);

            System.out.println("hold");
            countdown(hold);

            System.out.println("exhale");
            countdown(exhale);
        }

    }
    public static void countdown(int duration) throws InterruptedException {
        int start = 1;
        for (int i = start; i <= duration; i++) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
