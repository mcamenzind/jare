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
package com.datamelt.rules.core.action;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

import com.datamelt.rules.core.XmlAction;
/**
 * Class containing possible actions that are related to mathematical calculations.
 * 
 * Actions belong to a rulegroup and are execute depending on the status of rulegroup - if it passed or failed (or both).
 *
 * @author uwe geercken
 * 
 */
public class MathAction
{
	public int setValue(XmlAction action, int value) throws Exception
	{
		return value;
	}
	
	public float setValue(XmlAction action, float value) throws Exception
	{
		return value;
	}
	
	public long setValue(XmlAction action, long value) throws Exception
	{
		return value;
	}
	
	public double setValue(XmlAction action, double value) throws Exception
	{
		return value;
	}
	
	public boolean setValue(XmlAction action, boolean value) throws Exception
	{
		return value;
	}
	
	public BigDecimal setValue(XmlAction action, BigDecimal value) throws Exception
	{
		return value;
	}
	
	public BigInteger setValue(XmlAction action, BigInteger value) throws Exception
	{
		return value;
	}
	
	public int addValues(XmlAction action, int value, int value2) throws Exception
	{
		return value + value2;
	}
	
	public long addValues(XmlAction action, long value, long value2) throws Exception
	{
		return value + value2;
	}
	
	public long addValues(XmlAction action, long value, int value2) throws Exception
	{
		return value + value2;
	}
	
	public long addValues(XmlAction action, int value, long value2) throws Exception
	{
		return value + value2;
	}
	
	public double addValues(XmlAction action, double value, double value2) throws Exception
	{
		return value + value2;
	}
	
	public float addValues(XmlAction action, float value, float value2) throws Exception
	{
		return value + value2;
	}
	
	public int subtractValues(XmlAction action, int value, int value2) throws Exception
	{
		return value - value2;
	}
	
	public long subtractValues(XmlAction action, long value, long value2) throws Exception
	{
		return value - value2;
	}
	
	public long subtractValues(XmlAction action, long value, int value2) throws Exception
	{
		return value - value2;
	}
	
	public long subtractValues(XmlAction action, int value, long value2) throws Exception
	{
		return value - value2;
	}
	
	public double subtractValues(XmlAction action, double value, double value2) throws Exception
	{
		return value - value2;
	}
	
	public float subtractValues(XmlAction action, float value, float value2) throws Exception
	{
		return value - value2;
	}
	
	public long subtractValues(XmlAction action, Date value, Date value2) throws Exception
	{
		// difference is in seconds
		long difference = (Math.abs(value.getTime() - value2.getTime()))/1000;
		
		if(difference>0)
		{
			return difference;
		}
		else
		{
			return 0;
		}

	}
	
	public long remainderValue(XmlAction action, long value, long value2)
	{
		return value % value2;
	}
	
	public long remainderValue(XmlAction action, long value, int value2)
	{
		return value % value2;
	}
	
	public int remainderValue(XmlAction action, int value, int value2)
	{
		return value % value2;
	}
	
	public long multiplyValues(XmlAction action, int value, int value2) throws Exception
	{
		return value * value2;
	}
	
	public long multiplyValues(XmlAction action, long value, long value2) throws Exception
	{
		return value * value2;
	}
	
	public long multiplyValues(XmlAction action, long value, int value2) throws Exception
	{
		return value * value2;
	}
	
	public long multiplyValues(XmlAction action, int value, long value2) throws Exception
	{
		return value * value2;
	}
	
	public double multiplyValues(XmlAction action, long value, double value2) throws Exception
	{
		return value * value2;
	}
	
	public double multiplyValues(XmlAction action, double value, double value2) throws Exception
	{
		return value * value2;
	}
	
	public double multiplyValues(XmlAction action, double value, int value2) throws Exception
	{
		return value * value2;
	}
	
	public float multiplyValues(XmlAction action, float value, float value2) throws Exception
	{
		return value * value2;
	}
	
	public double devideValues(XmlAction action, int value, int value2) throws Exception
	{
		return value / value2;
	}
	
	public double devideValues(XmlAction action, long value, long value2) throws Exception
	{
		return (double)value / value2;
	}
	
	public double devideValues(XmlAction action, long value, int value2) throws Exception
	{
		return value / value2;
	}
	
	public double devideValues(XmlAction action, int value, long value2) throws Exception
	{
		return value / value2;
	}
	
	public double devideValues(XmlAction action, long value, double value2) throws Exception
	{
		return value / value2;
	}
	
	public double devideValues(XmlAction action, double value, double value2) throws Exception
	{
		return value / value2;
	}
	
	public BigDecimal devideValues(XmlAction action, BigDecimal value, BigDecimal value2) throws Exception
	{
		return value.divide(value2);
	}
	
	public double devideValues(XmlAction action, double value, int value2) throws Exception
	{
		return value / value2;
	}

	public float devideValues(XmlAction action, float value, float value2) throws Exception
	{
		return value / value2;
	}
	
	public double squareRootValue(XmlAction action, double value) throws Exception
	{
		return Math.sqrt(value);
	}
	
	public double squareRootValue(XmlAction action, float value) throws Exception
	{
		return Math.sqrt(value);
	}
	
	public double squareRootValue(XmlAction action, int value) throws Exception
	{
		return Math.sqrt(value);
	}
	
	public double squareRootValue(XmlAction action, long value) throws Exception
	{
		return Math.sqrt(value);
	}
	
	public double squareValue(XmlAction action, double value) throws Exception
	{
		return value * value;
	}

	public long squareValue(XmlAction action, int value) throws Exception
	{
		return value * value;
	}
	
	public double squareValue(XmlAction action, float value) throws Exception
	{
		return value * value;
	}

	public long squareValue(XmlAction action, long value) throws Exception
	{
		return value * value;
	}

	public double absValue(XmlAction action, double value) throws Exception
	{
		return Math.abs(value);
	}

	public float absValue(XmlAction action, float value) throws Exception
	{
		return Math.abs(value);
	}
	
	public long absValue(XmlAction action, long value) throws Exception
	{
		return Math.abs(value);
	}
	
	public int absValue(XmlAction action, int value) throws Exception
	{
		return Math.abs(value);
	}
	
	public long roundValue(XmlAction action, double value) throws Exception
	{
		return Math.round(value);
	}
	
	public int roundValue(XmlAction action, float value) throws Exception
	{
		return Math.round(value);
	}
	
	public int moduloValue(XmlAction action, int value, int moduloValue) throws Exception
	{
		return value % moduloValue;
	}
	
	public long moduloValue(XmlAction action, long value, long moduloValue) throws Exception
	{
		return value % moduloValue;
	}
	
	public double floorValue(XmlAction action, double value) throws Exception
	{
		return Math.floor(value);
	}
	
	public double ceilValue(XmlAction action, double value) throws Exception
	{
		return Math.ceil(value);
	}
	
	public int randomValue(XmlAction action, int min, int max)
	{
		Random rand = new Random();

	    return rand.nextInt((max - min) + 1) + min;
	}
	
	public double cosValue(XmlAction action, double value) throws Exception
	{
		return Math.cos(value);
	}
	
	public double coshValue(XmlAction action, double value) throws Exception
	{
		return Math.cosh(value);
	}

	public double acosValue(XmlAction action, double value) throws Exception
	{
		return Math.acos(value);
	}
	
	public double sinValue(XmlAction action, double value) throws Exception
	{
		return Math.sin(value);
	}
	
	public double sinhValue(XmlAction action, double value) throws Exception
	{
		return Math.sinh(value);
	}
	
	public double asinValue(XmlAction action, double value) throws Exception
	{
		return Math.asin(value);
	}
	
	public double tanValue(XmlAction action, double value) throws Exception
	{
		return Math.tan(value);
	}
	
	public double tanhValue(XmlAction action, double value) throws Exception
	{
		return Math.tanh(value);
	}
	
	public double atanValue(XmlAction action, double value) throws Exception
	{
		return Math.atan(value);
	}
	
	public double subtractPercentageValue(XmlAction action, double value, double percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, double value, float percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, double value, int percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, int value, int percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, int value, double percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, int value, float percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, long value, int percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, long value, double percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	
	public double subtractPercentageValue(XmlAction action, long value, float percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value - percentageValue;
	}
	

	public double addPercentageValue(XmlAction action, double value, double percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, double value, float percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, double value, int percentage) throws Exception
	{
		double percentageValue = value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, int value, int percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, int value, double percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, int value, float percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, long value, int percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, long value, double percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
	
	public double addPercentageValue(XmlAction action, long value, float percentage) throws Exception
	{
		double percentageValue = (double)value * percentage / 100;
		return value + percentageValue;
	}
}
