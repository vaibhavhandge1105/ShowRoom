package com.validation;
import java.text.ParseException;
import java.util.Date;

import com.exception.InvalidDateException;
import com.showroom.*;
public class ParseAndValidateDate {
	
	public static Date parseAndValidateDate(String mfgdt) throws ParseException, InvalidDateException {
		Date d2=Vehicle.sdf.parse("01-01-2021");
		Date d1=Vehicle.sdf.parse(mfgdt);
		if(d1.before(d2)) {
			throw new InvalidDateException("Older Version...available") ;
		}
		System.out.println("valid date");
		return d1;
		
	}
}
//manufactureDate : must be in after 1st Jan 2021
