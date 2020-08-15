package thr.day01.demo01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demoBirthDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：yyyy年MM月d日");
        String birthday = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月d日");
        Date birthdayDate = sdf.parse(birthday);
        long birthdayDateTime = birthdayDate.getTime();
        long time = new Date().getTime();
        long liveTime = time - birthdayDateTime;
        System.out.println(liveTime/1000/60/60/24+"天");

    }
}
