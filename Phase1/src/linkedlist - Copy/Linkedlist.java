package linkedlist;


import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/*Use LinkedList only in the below program
   - Add 6 months (May, June, July, August, April, November)
   - Add 'December' month as last
   - Add 'January' month as first
   - Add 'March' and then add 'Febuary' using the index based 
   - Add 'September' and then add 'October' using the index based
(1) Print the linkedlist in such a way that proper order of months are displayed
(2) Get all the even months and print them 
(3) Get all the odd months and print them
(4) Use iterator to fetch and print all months 
(5) Print the first and last month of the year together
(6) remove your birthday month from the linkedList and print it
(7) Check whether this linkedList contains any winter month inside it or not?
(8) Fetch the first and last months using peek()
(9) Remove the first and last months using poll()*/
public class Linkedlist {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 LinkedList<String> l = new LinkedList<String>();
		 l.add("May");
		 l.add("June");
		 l.add("July");
		 l.add("August");
		 l.add("April");
		 l.add("November");
		 System.out.println("The Months prresent in the linked lists are:"+l);
		 l.addLast("Decenmber");
		 System.out.println("After added December:"+l);
		 l.addFirst("January");
		 System.out.println("After added January:"+l);
		l.add(1, "March");
		l.add(2, "Febuary");
		System.out.println("After added March and Febuary:"+l);
		l.add(8, "September");
		l.add(9, "October");
		System.out.println("After added September and October:"+l);
		DateFormatSymbols dfs = new DateFormatSymbols();
		  String[] arrayOfMonthsNames = dfs.getMonths();
		  
		  for(  String monthName1 : arrayOfMonthsNames ) {
		   System.out.println(monthName1);}
			 for(int i=0;i<l.size();i++) 
		 {
		if ((i+1)%2==0) {
			    System.out.println("The name of even month:"+l.get(i));
			    
			}	
		else
			 System.out.println("The name of odd month:"+l.get(i));
	    
		 }  
		 Iterator i=l.iterator();
		 System.out.println("List containing all the months:"+l);
		 
		 System.out.println("First and last month:"+l.getFirst()+" "+l.getLast());
		l.remove("August");
		 System.out.println("removing birthday month:"+l);
		 if(l.contains("January")||l.contains("December")||l.contains("Febuary")){
			 System.out.println("Yes! Linkedlist contains winter months!");
		 }
		 else
		 System.out.println("Yes! Linkedlist doesn't contain winter months!");
		 System.out.println("First and last month using peek():"+l.peekFirst()+" "+l.peekLast());
		 System.out.println(l);
		 System.out.println("First and last month using poll():"+l.pollFirst()+" "+l.pollLast());
		 System.out.println(l);
/*(4) Use iterator to fetch and print all months 
(5) Print the first and last month of the year together
(6) remove your birthday month from the linkedList and print it
(7) Check whether this linkedList contains any winter month inside it or not?
(8) Fetch the first and last months using peek()
(9) Remove the first and last months using poll()*/
		   



	}
		  
		 
}

