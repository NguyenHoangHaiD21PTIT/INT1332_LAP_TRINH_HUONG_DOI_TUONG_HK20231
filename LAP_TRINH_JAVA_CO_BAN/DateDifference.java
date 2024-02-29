import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class DateDifference {
    public static void main(String[] args) {
        String s1 = "15/12/2023";
        String s2 = "09/12/2023";
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(s1, f);
        LocalDate d2 = LocalDate.parse(s2,f);
        System.out.println(ChronoUnit.DAYS.between(d1, d2));
        
        s1 = "11/12/2021 17:00:00";
        s2 = "11/12/2021 19:15:00";
        f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime bd = LocalDateTime.parse(s1, f);
        LocalDateTime kt = LocalDateTime.parse(s2, f);
        System.out.println(ChronoUnit.MINUTES.between(kt, bd));
        
        s1 = "21/05/2009";
        int t = 18;
        f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate in = LocalDate.parse(s1, f);
        LocalDate out = in.plusMonths(t);
        System.out.println(out.format(f));
    }
}