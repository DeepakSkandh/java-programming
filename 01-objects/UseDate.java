public class UseData {
    public static void main(String[] agrs) {
        Date d;
        d = new Date();
        d.setDate(26,10,2004);
        d.getDay();
        d.getMonth();
        d.getYear();
    }
    
}
public class Date {
    private int day,month,year;
    public void setDate(int d,int m,int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void getDay() {
        System.out.println("Date is "+day);
    }
    public void getMonth() {
        System.out.println("Month is "+month);
    }
    public void getYear() {
        System.out.println("Year is " + year);
    }
 
 }