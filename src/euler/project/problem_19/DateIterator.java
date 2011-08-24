package euler.project.problem_19;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 24.08.11
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class DateIterator
   implements Iterator<Date>, Iterable<Date>
{

    private Calendar end = Calendar.getInstance();
    private Calendar current = Calendar.getInstance();

    public DateIterator(Date start, Date end)
    {
        this.end.setTime(end);
        this.end.add(Calendar.DATE, -1);
        this.current.setTime(start);
        this.current.add(Calendar.DATE, -1);
    }

    public boolean hasNext()
    {
        return !current.after(end);
    }

    public Date next()
    {
        current.add(Calendar.DATE, 1);
        return current.getTime();
    }

    public void remove()
    {
        throw new UnsupportedOperationException(
           "Cannot remove");
    }

    public Iterator<Date> iterator()
    {
        return this;
    }

    public static void main(String[] args)
    {
    	Date d1 = new Date();
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.DATE, 20);
    	Date d2 = cal.getTime();

    	Iterator<Date> i = new DateIterator(d1, d2);
    	while(i.hasNext())
    	{
    		Date date = i.next();
    		System.out.println(date);
    	}
    }
}