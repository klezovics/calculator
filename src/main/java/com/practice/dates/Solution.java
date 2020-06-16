package com.practice.dates;

import java.text.ParseException;
import java.util.Date;
/* 
Работа с датой
*/

public class Solution {

    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String dateString) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("MMMM dd, yyyy");
//        Date date2 = format.parse(date);
//        GregorianCalendar calendar = new GregorianCalendar(2013, Calendar.JANUARY, 0);
//        Date date1 = calendar.getTime();
//        long day = date2.getTime() - date1.getTime();
//        long msDay = 24 * 60 * 60 * 1000;
//        int dayCount = (int) (day / msDay);
//        if (dayCount / 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }

        Date date = parseDate(dateString);
        int daysFromStartOfYear = getDaysFromStartOfYear(date);
        if (daysFromStartOfYear % 2 != 0) {
            return true;
        }

        return false;
    }

    //TODO Add unit tests for this method to SolutionTest !
    public static int getDaysFromStartOfYear(Date date) {
        //TODO  Implement count days from start of year
        return 0;
    }

    //TODO Add unit test for this method to SolutionTest!
    public static Date parseDate(String dateString) {
        //TODO Implement parsing of date
        return null;
    }
}