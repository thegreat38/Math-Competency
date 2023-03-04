public class Date {
    int year;
    int day;
    int month;

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //setters and getters for day month and year
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
}
