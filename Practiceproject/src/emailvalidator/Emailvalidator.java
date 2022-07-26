package emailvalidator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Emailvalidator {
	
	   private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	   public static void main(String args[]) {
	    
	       List<String> l = new ArrayList<String>();
	       l.add("kani2902Kni@example.com");
	       l.add("kani2902Kni.2gW@example.co.in");
	       l.add("kani2902Kni1@example.me.org");
	       l.add("kani2902Kni_#2gW@example.com");
	       l.add("kani2902Kni-#2gW@example.com");
	       l.add("Kani29eh@.example.com");
	       l.add("kani2902Kni&example.com");
	       l.add("kani2902Kni#@example.me.org");   
	       Pattern pattern = Pattern.compile(regex);     
	       for (String value : l) {
	           Matcher matcher = pattern.matcher(value);
	           System.out.println( value + " -> " + (matcher.matches() ? "valid email" : "invalid email"));
	       }
	   }
	}