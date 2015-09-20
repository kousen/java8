package nfjs.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Set;

public class UseInstant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant then = now.plus(1, ChronoUnit.DAYS);
        Duration elapsed = Duration.between(now, then);
        System.out.println(elapsed);
        System.out.println(elapsed.toDays() + " days");
        System.out.println(elapsed.toHours() + " hours");

        then = now.plus(1, ChronoUnit.DAYS)
                .plus(1, ChronoUnit.HALF_DAYS)
                .plus(1, ChronoUnit.HOURS)
                .plus(10, ChronoUnit.MINUTES)
                .plusSeconds(10)
                .plusMillis(100)
                .plusNanos(100);
        System.out.println(then);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDate groundHogDay =
                LocalDate.of(2015, Month.FEBRUARY, 2);
        System.out.println(groundHogDay);

        LocalDate firstDayofSpring =
                LocalDate.of(2015, 3, 20);

        // Day of week available
        System.out.println("First day of spring this year falls on a " +
                firstDayofSpring.getDayOfWeek());

        // Add days (modulo 7)
        System.out.println(DayOfWeek.FRIDAY.plus(3));

        // until with ChronoUnit gives days between
        long gap = groundHogDay.until(firstDayofSpring, ChronoUnit.DAYS);
        System.out.println("There are " + gap +
                " days between GroundHog Day and 1st day of Spring");
        System.out.println("That's " + (gap / 7) + " weeks and " +
                (gap % 7) + " days");

        Set<String> availableTimeZones = ZoneId.getAvailableZoneIds();
        System.out.println(availableTimeZones.size());
        availableTimeZones.stream()
                .filter(name -> name.contains("America"))
                .forEach(System.out::println);

        ZonedDateTime missing = ZonedDateTime.of(
                LocalDate.of(2015, 3, 8),
                LocalTime.of(2, 30),      // skipped by daylight savings
                ZoneId.of("America/Chicago"));
        System.out.println(missing);

        ZonedDateTime spring =
                ZonedDateTime.of(2015, 3, 20, 0, 0, 0, 0, ZoneId.systemDefault());

        System.out.println(
                DateTimeFormatter.RFC_1123_DATE_TIME.format(spring));
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                .withLocale(Locale.FRANCE);
        System.out.println(formatter.format(spring));

    }
}
