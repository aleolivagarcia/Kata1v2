package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    
    private final String name;
    private final Calendar birthdate;
    private static final long MILLISECONDS_PER_YEAR = (long) (365.25*24*60*60*1000);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
   
    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        Calendar today;
        today = GregorianCalendar.getInstance();
        
        return (int) (milliSecondsToYear(today.getTimeInMillis()-birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles){
        return milles/MILLISECONDS_PER_YEAR;
    }
    
    
}
