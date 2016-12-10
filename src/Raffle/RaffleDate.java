package Raffle;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RaffleDate {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-2016 10:20:56";
		java.util.Date date = null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);

	}
	
}
