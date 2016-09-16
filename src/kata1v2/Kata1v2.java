package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1997,6,25);
        
        Person me = new Person("Ale", date);
        System.out.println(me.getName() + " tiene " + me.getAge() + " años");
    }
}
