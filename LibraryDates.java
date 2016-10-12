import javax.swing.*;
import java.text.*;
import java.util.*;
/** sets up a birthday date using GregorianCalendar
 *  uses some of the Calendar methods  and fields to format its display
 *  such as getDisplayName, Calendar.MONTH and Calendar.LONG
 */
public class LibraryDates {
   public static void main( String args[] ) {
      GregorianCalendar borrowDate,returnDate;
      // capture today's date
      
      String dayBor = JOptionPane.showInputDialog("Please enter the day you borrowed the book ");
      String monthBor = JOptionPane.showInputDialog("Please enter the month you borrowed the book ");
      String yearBor = JOptionPane.showInputDialog("Please enter the year you borrowed the book ");
      
      int day = Integer.parseInt(dayBor);
      int month = Integer.parseInt(monthBor);
      int year = Integer.parseInt(yearBor);
      
      borrowDate = new GregorianCalendar(year,(month-1),day);
      // set up the date the book was borrowed: nb year, month, day: and month counts from 0
      
      String dayRet = JOptionPane.showInputDialog("Please enter the day you returned the book ");
      String monthRet = JOptionPane.showInputDialog("Please enter the month you returned the book ");
      String yearRet = JOptionPane.showInputDialog("Please enter the year you returned the book ");
      
      day = Integer.parseInt(dayRet);
      month = Integer.parseInt(monthRet);
      year = Integer.parseInt(yearRet);
      
      returnDate = new GregorianCalendar(year,(month-1),day);
      SimpleDateFormat f3 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");
      
      JOptionPane.showMessageDialog(null, "the date borrowed is " + f3.format(borrowDate.getTime()) );
      
      JOptionPane.showMessageDialog(null, "the date returned is " + f3.format(returnDate.getTime()) );
      
      JOptionPane.showMessageDialog(null,"You had the book for " + 
      	(returnDate.get(Calendar.DAY_OF_YEAR) - borrowDate.get(Calendar.DAY_OF_YEAR)) + " days");
     
   }
}
