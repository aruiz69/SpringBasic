/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conceptestsring;

import java.util.TimeZone;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 *
 * @author Israel
 */
public class JodaDateT {
    
    public static void main(String[] arg){
        DateTime  dt = new DateTime();
        
        
        DateTimeZone dtZone = DateTimeZone.forID("Europe/London");
        System.out.println("dtZone = "+dtZone + " date"  + dt.toDateTime(dtZone)) ; 
        System.out.println("dt = "+dt + dt.getZone());
       
    }
    
}
