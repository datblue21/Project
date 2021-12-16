package comunity;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.getTime());
        System.out.println(rightNow.getTimeZone());
        try {System.out.println(rightNow.getWeekYear()) ;}
        catch (Exception e){
            System.out.println(e);
        }
    }
}
