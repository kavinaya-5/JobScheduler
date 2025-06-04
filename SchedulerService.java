import java.time.LocalDateTime;

public class SchedulerService {

    public static void runJob(Job job) {
        System.out.println("\nScheduler started. Waiting to run job...");

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int currentHour = now.getHour();
            int currentMinute = now.getMinute();
            String currentDay = now.getDayOfWeek().toString();

            try {
                String type = job.getType();
                int jobHour = job.getHour();
                int jobMinute = job.getMinute();
                String jobDay = job.getDay();

                if (type.equals("hourly") && currentMinute == jobMinute) {
                    System.out.println("Hello World - " + now);
                    Thread.sleep(60 * 1000);

                } else if (type.equals("daily") && currentHour == jobHour && currentMinute == jobMinute) {
                    System.out.println("Hello World - " + now);
                    Thread.sleep(60 * 1000);

                } else if (type.equals("weekly") && currentDay.equals(jobDay)
                        && currentHour == jobHour && currentMinute == jobMinute) {
                    System.out.println("Hello World - " + now);
                    Thread.sleep(60 * 1000);

                } else {
                    Thread.sleep(10 * 1000); // check every 10 seconds
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
