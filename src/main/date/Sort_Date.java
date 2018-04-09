package main.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class Sort_Date {

	private class test{};
	
	
	public static void main(String[] args) throws ParseException {
		
	
		

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        
		String date="20-09-2014 11:01:11";

		
		Date dd=sdf.parse(date);
		
		System.out.println("parse is :"+dd);
        	}
}
