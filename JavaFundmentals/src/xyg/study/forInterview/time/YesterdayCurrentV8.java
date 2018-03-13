package xyg.study.forInterview.time;

import java.time.LocalDateTime;

class YesterdayCurrentV8
{
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        System.out.println(yesterday);
    }
}
