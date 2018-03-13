package xyg.study.forInterview.time;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest
{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); // 0 - 11
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND)); // Java 8
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue()); // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        System.out.println(getMillseconds());
        System.out.println(getLastDayOfMonth());
    }

    // 如何取得从1970年1月1日0时0分0秒到现在的毫秒数？
    private static long getMillseconds() {
        Calendar.getInstance().getTimeInMillis();
        System.currentTimeMillis();
        return Clock.systemDefaultZone().millis();
    }

    // 如何取得某月的最后一天？
    private static int getLastDayOfMonth() {
        Calendar time = Calendar.getInstance();
        return time.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    // 如何格式化日期？
    private static void format() {
        SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = new Date();
        System.out.println(oldFormatter.format(date1)); // Java 8
                                                        // DateTimeFormatter
                                                        // newFormatter =
                                                        // DateTimeFormatter.ofPattern("yyyy/MM/dd");
                                                        // LocalDate date2 =
                                                        // LocalDate.now();
                                                        // System.out.println(date2.format(newFormatter));
                                                        // }
    }
}
