package androidsamples.java.whatday;

import java.io.OutputStream;
import java.util.Calendar;

import androidx.annotation.NonNull;

/**
 * Represents the date to be set, whether it is a valid date, and the message with error status or the day of the week.
 */
public class DateModel {
	/**
	 * Initializes the {@link DateModel} with the given year, month, and date.
	 * If the date is not valid, it sets the appropriate error message.
	 * If it is valid, it sets the appropriate day of the week message.
	 *
	 * @param yearStr  a {@code String} representing the year, e.g., "1947"
	 * @param monthStr a {@code String} representing the month, e.g., "8"
	 * @param dateStr  a {@code String} representing the date, e.g., "15"
	 */
	
	private static String message;
	
	private static Boolean isNumeric(String str){
		try{
			Integer.parseInt(str);
			return true;
		} 
		catch(NumberFormatException e){  
			return false;
		}
   }
   
   private static String dayName(int dayNum){
		String name="";
		switch(dayNum){
			case 1: 
				name="Sunday"; 
				break;
			case 2: 
				name="Monday"; 
				break;
			case 3: 
				name="Tuesday"; 
				break;
			case 4: 
				name="Wednesday"; 
				break;
			case 5: 
				name="Thursday"; 
				break;
			case 6: 
				name="Friday"; 
				break;
			case 7: 
				name="Saturday"; 
				break;
		}
		return name;
	}
	
	private static void findErrorInDate(int year, int month, int date){
		//Changing month from zero indexed to one indexed
		month+=1;
		if(year<=0){
			message="Invalid year";
		}
		else if( month<=0 || month>12){
			message="Invalid month";
		}
		else if(date<=0 || date>31){
			message="Invalid date";
		}
		else{
			if(month==2 && date<=29){
				message="February of "+year+" does not have "+date+" days";
			}
			else{
				message="This month does not have "+date+" days";
			}
		}
	}
	
	public static void initialize(String yearStr, String monthStr, String dateStr) {
		
		//Numerical validation
		if((!isNumeric(yearStr)) || (!isNumeric(monthStr)) || (!isNumeric(dateStr)))
		{
			message="Enter values in a proper numeric format";
			return ;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);
		
		int yearNum=Integer.parseInt(yearStr);
		int monthNum=Integer.parseInt(monthStr)-1; //since our input is 1 indexed but the calender is 0 indexed
		int dateNum=Integer.parseInt(dateStr);
		
		try{
			cal.set(yearNum, monthNum, dateNum);
			int dayNum=cal.get(Calendar.DAY_OF_WEEK);
			message=dayName(dayNum);
			return ;
		}
		catch(Exception e){
			findErrorInDate(yearNum, monthNum, dateNum);
		}
	}

	/**
	 * Retrieves the message from the {@link DateModel}.
	 * It can be an error message like "February of 2019 does not have 29 days"
	 * or a success message like "Friday".
	 *
	 * @return the message from the model
	 */
	
	@NonNull
	public static String getMessage() {
		return message;
	}
}
