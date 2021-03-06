/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.datamelt.rules.implementation;

/**
 * checks, if the length of the given value (number of digits/characters) is equal to the given length.
 * <p>
 * The first parameter of a given method is always the value of the field that shall be checked. The second parameter is either another field to check against 
 * or an expected value (fixed value) to check against the first value.
 * 
 * @author uwe geercken
 */
public class CheckLength extends GenericCheck
{
    
	/**
     * Evaluates if the length (number of digits/characters) of the value is equal to the given length.
     * 
     * @param value		the value to compare
     * @param length	the length to compare against
     * @return			indication if the length of the value is equal to the expected length
     */
    public static boolean evaluate(String value, int length)
    {
        if(value!=null)
        {
	    	if(value.length()==length)
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
     * Evaluates if the length (number of digits/characters) of the value is equal to the given length.
     * 
     * @param value		the value to compare
     * @param length	the length to compare against
     * @return			indication if the length of the value is equal to the expected length
     */
    public static boolean evaluate(String value, long length)
    {
        if(value!=null)
        {
	    	if(value.length()==length)
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
     * Evaluates if the length (number of digits/characters) of the value is equal to the given length.
     * 
     * @param value		the value to compare
     * @param length	the length to compare against
     * @return			indication if the length of the value is equal to the expected length
     */
    public static boolean evaluate(int value, int length)
    {
        // we make a string out of the number.
    	
    	// be aware, that leading zeros might have been
    	// trimmed from the number
    	String valueString = "" + value;
    	if(valueString.length()==length)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Evaluates if the length (number of digits/characters) of the value is equal to the given length.
     * 
     * @param value		the value to compare
     * @param length	the length to compare against
     * @return			indication if the length of the value is equal to the expected length
     */
    public static boolean evaluate(int value, long length)
    {
        // we make a string out of the number.
    	
    	// be aware, that leading zeros might have been
    	// trimmed from the number
    	String valueString = "" + value;
    	if(valueString.length()==length)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Evaluates if the length (number of digits/characters) of the value is equal to the given length.
     * 
     * @param value		the value to compare
     * @param length	the length to compare against
     * @return			indication if the length of the value is equal to the expected length
     */
    public static boolean evaluate(long value, int length)
    {
        // we make a string out of the number.
    	
    	// be aware, that leading zeros might have been
    	// trimmed from the number
    	String valueString = "" + value;
    	if(valueString.length()==length)
        {
            return true; 
        }
        else
        {
            return false;
        }
    }
}
