package fundamentals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateFundamentals {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2025-07-06");
        LocalDateTime d05 = LocalDateTime.parse("2025-07-06T00:05:15");
        Instant d06 = Instant.parse("2025-07-02T00:00:00Z");
        Instant d07 = Instant.parse("2025-07-02T00:00:00-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2000, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2000, 7, 20, 1, 30);

        System.out.println("Local Date: " + d01);
        System.out.println("Local Date Time: " + d02);
        System.out.println("Local Date Parse: " + d04);
        System.out.println("Local Date Parse with time: " + d05);

        System.out.println();

        System.out.println("Instant: " + d03);
        System.out.println("Instant Parse with time: " + d06);
        System.out.println("Instant Parse with time: " + d07);

        System.out.println();

        System.out.println("Local Date with formatter: " + d08);
        System.out.println("Local Date with formatter: " + d09);

        System.out.println();

        System.out.println("Local date of: " + d10);
        System.out.println("Local date time of: " + d11);
    }
}
