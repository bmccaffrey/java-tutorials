import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2004, 0, 7, 15, 40);

        System.out.println("Original Date: " + c.getTime());

        long day1 = c.getTimeInMillis();
        System.out.println("Covert to MS: " + day1);

        int hour = 1000 * 60 * 60;
        System.out.println("Hour in MS: " + hour);

        System.out.println("Add an Hour to Current Time: " + (day1 + hour));

        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("New Hour: " + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE, 35);
        System.out.println("Add 35 days " + c.getTime());

        c.roll(c.DATE, 35);
        System.out.println("Roll 35 Days, but Don't Change the Month: " + c.getTime());

        c.set(c.DATE, 1);
        System.out.println("Set Date to the 1st: " + c.getTime());

    }
}
