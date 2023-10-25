package com.tester;
import com.showroom.Vehicle;
import com.validation.ParseAndValidateDate;

public class Tester {

	public static void main(String[] args)  {
		try {
		Vehicle v1=new Vehicle("123gg","honda",20000,"RED",ParseAndValidateDate.parseAndValidateDate("11-05-2019"));
		System.out.println(v1);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
//manufactureDate : must be in after 1st Jan 2021