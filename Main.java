
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter schedule type (hourly / daily / weekly): ");
        String type = scanner.next().toLowerCase();

        int hour = -1, minute = -1;
        String day = "";

        if (type.equals("hourly")) {
            System.out.print("Enter minute of the hour (0-59): ");
            minute = scanner.nextInt();

        } else if (type.equals("daily")) {
            System.out.print("Enter hour (0-23): ");
            hour = scanner.nextInt();
            System.out.print("Enter minute (0-59): ");
            minute = scanner.nextInt();

        } else if (type.equals("weekly")) {
            System.out.print("Enter day (e.g., MONDAY): ");
            day = scanner.next().toUpperCase();
            System.out.print("Enter hour (0-23): ");
            hour = scanner.nextInt();
            System.out.print("Enter minute (0-59): ");
            minute = scanner.nextInt();

        } else {
            System.out.println("Invalid type!");
            return;
        }

        Job job = new Job(type, hour, minute, day);
        SchedulerService.runJob(job);
    }
}
