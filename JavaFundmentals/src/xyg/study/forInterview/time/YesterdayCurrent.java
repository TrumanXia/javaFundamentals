package xyg.study.forInterview.time;

import java.util.Calendar;

class YesterdayCurrent
{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
    }
}
