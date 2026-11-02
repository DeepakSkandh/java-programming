public class DateConstructor {
    public static void main(String[] args) {
        Date d;
        d = new Date(26,10);
        d.show();
    }
}

class Date {
    private int day,month,year;
    public Date(int d,int m) {
        day = d;
        month = m;
        year = 2026;
    }
    public void show() {
        System.out.println("Date is " +  day + "/" + month + "/" + year);
    }
}