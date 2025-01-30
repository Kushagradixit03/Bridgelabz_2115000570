import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class L_Four_1 {

    public static void main(String[] args) {

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current Time in GMT (Greenwich Mean Time): " + gmtTime.format(formatter));
        System.out.println("Current Time in IST (Indian Standard Time): " + istTime.format(formatter));
        System.out.println("Current Time in PST (Pacific Standard Time): " + pstTime.format(formatter));
    }
}
