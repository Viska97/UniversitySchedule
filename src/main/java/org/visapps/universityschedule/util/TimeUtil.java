package org.visapps.universityschedule.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeUtil {

    public static String getWeekOfPeriod(Date start, Date current) {
        LocalDateTime startDate = LocalDateTime.ofInstant(start.toInstant(), ZoneId.systemDefault());
        LocalDateTime currentDate = LocalDateTime.ofInstant(current.toInstant(), ZoneId.systemDefault());
        return String.valueOf(ChronoUnit.WEEKS.between(startDate, currentDate));
    }

    public static Integer getDayOfWeek(Date current) {
        LocalDateTime currentDate = LocalDateTime.ofInstant(current.toInstant(), ZoneId.systemDefault());
        return currentDate.getDayOfWeek().getValue();
    }

    public static Date getDateWithDefaultTime(Date current) {
        LocalDateTime localDate = LocalDateTime.ofInstant(current.toInstant(), ZoneId.systemDefault());
        Instant instant = localDate.toInstant(ZoneOffset.UTC);
        return Date.from(instant);
    }

}
