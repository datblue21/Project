package nami;
import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public String[] MONTHS = {"Jan", "Feb", "Mar", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String[] DAYS = {"Monday", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday ", "Sunday"};
    public int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            return true;
            return false;
    }

    public boolean isValidDate(int year, int month, int day) {
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

    }

    public int getDayOfWeek(int year, int month, int day) {

    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year,int month,int day){

    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


//    public Mydate
    //    public void setAuthor(Author[] author) {
//        this.author = author;
//    }
}
