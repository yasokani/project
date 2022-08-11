package program.jav.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;
 
public class DayLightSavings {
 
    public static void main(String[] args) {
    /**
    * DST = Daylight Saving Time (Begins Daylight Saving Time at 2:00 a.m.
    * on the second Sunday in March and reverts to standard time on the
    * first Sunday in November)
    */
    SimpleDateFormat sourceFormat = new SimpleDateFormat("MM/dd/yyyy");
    SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'+|-hh:mm");
    String strWithDLS = "03/10/2019"; // MM/DD/YYYY
    String strWithOutDLS = "03/11/2019";
    
    try {
         Date dateWithDLS = sourceFormat.parse(strWithDLS);
         Date dateWithOutDLS = sourceFormat.parse(strWithOutDLS);
        System.out.println("Default Timezone with Day Light Saving :" + targetFormat.format(dateWithDLS));
        System.out.println("Default Timezone without Day Light Saving :" + targetFormat.format(dateWithOutDLS));
 
        /**
        * Set time zone with EST (No difference in time) because 3 letter
        * time zone not consider DST (Day light saving time)
        */
        sourceFormat.setTimeZone(TimeZone.getTimeZone("EST"));
        dateWithDLS = sourceFormat.parse(strWithDLS);
        dateWithOutDLS = sourceFormat.parse(strWithOutDLS);
        System.out.println("EST Timezone with Day Light Saving :" + targetFormat.format(dateWithDLS));
        System.out.println("EST Timezone without Day Light Saving :" + targetFormat.format(dateWithOutDLS));
 
        /**
        * Set time zone with America/New_York (1 hour difference in time)
        * when you need to use day light saving always use with
        * continent/region format.
        */
        sourceFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("America/New_York")));
		dateWithDLS = sourceFormat.parse(strWithDLS);
		dateWithOutDLS = sourceFormat.parse(strWithOutDLS);
		System.out.println("America/New_York Timezone with Day Light Saving :" + targetFormat.format(dateWithDLS));
		System.out.println(
		"America/New_York Timezone without Day Light Saving :" + targetFormat.format(dateWithOutDLS));
		 
} catch (ParseException ex) {
            ex.printStackTrace();
}
 
    }
 
}
