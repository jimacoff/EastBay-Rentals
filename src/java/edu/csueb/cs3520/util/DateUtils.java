/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csueb.cs3520.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author thiagoloschi
 */
public class DateUtils {
    
    public static long daysBetween(Calendar startDate, Calendar endDate) {  
    Calendar date = (Calendar) startDate.clone();  
    long daysBetween = 0;  
    while (date.before(endDate)) {  
      date.add(Calendar.DAY_OF_MONTH, 1);  
      daysBetween++;  
    }  
    return daysBetween;  
  }  
    
    
    public static String dataChange(Date old){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

// Get the date today using Calendar object.
    Date today = (Date) Calendar.getInstance().getTime();        
// Using DateFormat format method we can create a string 
// representation of a date with the defined format.
    String reportDate = df.format(today);

// Print what date is today!
        return reportDate;
    }
    
}
