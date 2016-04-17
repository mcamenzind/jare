/*
 * Created on 15.09.2006
 *
 * all code by uwe geercken
 */
package com.datamelt.rules.implementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * checks if one value is smaller than the other. in case
 * a string value is used, it checks, if the length of the
 * string if smaller than the given length
 * 
 * <p>
 * The first argument of a method is always the value of the field that one wants to check. The second argument is either another field 
 * or an expected (fixed) value to check against the first value.
 * </p>
 * <p>
 * Some methods may have additional arguments that can be passed to it.
 * </p>
 * 
 * @author uwe geercken
 */
public class CheckIsSmaller extends GenericCheck
{
    /**
     * checks, if the length of the
     * string if smaller than the given length
     */
    public static boolean evaluate(String value, int length)
    {
        if(value!=null)
        {
	    	if(value.length()< length)
	        {
	            return true; 
	        }
	        else
	        {
	            return false;
	        }
        }
        else
        {
        	return false;
        }
    }
    
    /**
     * checks, if the length of the
     * string if smaller than the given length
     */
    public static boolean evaluate(String value, long length)
    {
        if(value!=null)
        {
	    	if(value.length()< length)
	        {
	            return true; 
	        }
	        else
	        {
	            return false;
	        }
        }
        else
        {
        	return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(long value1, long value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(int value1, int value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(double value1, double value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(double value1, long value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(double value1, float value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }

    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(double value1, int value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(float value1, int value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(float value1, long value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(float value1, double value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(long value1, int value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * checks, if the first value is smaller than the second value
     */
    public static boolean evaluate(float value1, float value2)
    {
        if(value1 < value2)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }

    /**
     * checks, if the first date string is smaller than the second
     * date string (before the second date).
     */
    public static boolean evaluate(String value1, String value2, String format)
    {
        
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        boolean result = false;
        
        try
        {
	       	Date date1 = sdf.parse(value1);
	        Date date2 = sdf.parse(value2);
	        
	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(date1);
	        
	        Calendar cal2 = Calendar.getInstance();
	        cal2.setTime(date2);
	        
	        result = cal1.before(cal2);
        }
        catch(Exception ex)
        {
        	
        }
        return result;
    
    }
    
    /**
     * checks, if the date is smaller than the date string
     * (before the second date), using the given date format
     */
    public static boolean evaluate(Date date1, String value2, String format)
    {
        
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        boolean result = false;
        
        try
        {
	        Date date2 = sdf.parse(value2);
	        
	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(date1);
	        
	        Calendar cal2 = Calendar.getInstance();
	        cal2.setTime(date2);
	        
	        result = cal1.before(cal2);
        }
        catch(Exception ex)
        {
        	
        }
        return result;
    
    }
    
    /**
     * checks, if the date is smaller than the date string
     * (before the second date), using the default date format
     */
    public static boolean evaluate(Date date1, String value)
    {
        
        SimpleDateFormat sdf = new SimpleDateFormat(CheckConstants.DEFAULT_DATE_FORMAT);

        boolean result = false;
        
        try
        {
	        Date date2 = sdf.parse(value);
	        
	        Calendar cal1 = Calendar.getInstance();
	        cal1.setTime(date1);
	        
	        Calendar cal2 = Calendar.getInstance();
	        cal2.setTime(date2);
	        
	        result = cal1.before(cal2);
        }
        catch(Exception ex)
        {
        	
        }
        return result;
    
    }
    
    /**
     * checks, if the date is smaller than the other date
     */
    public static boolean evaluate(Date date1, Date date2)
    {
        return date1.before(date2);
    }
}
