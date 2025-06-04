public class Job {
    private String type;       // hourly / daily / weekly
    private int hour;
    private int minute;
    private String day;        // for weekly only

    public Job(String type, int hour, int minute, String day) {
        this.type = type;
        this.hour = hour;
        this.minute = minute;
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getDay() {
        return day;
    }
}
