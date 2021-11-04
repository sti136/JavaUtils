package DateTimeUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class DatetimeUtilsImpt implements DateTimeUtils{
		public String convertLocalDateTimeToString(Object ldt,DateTimeFormatter dtf) {
				 try {
					      if(ldt instanceof LocalDateTime)
					    	  return ((LocalDateTime) ldt).format(dtf);
					      else if(ldt instanceof LocalDate)
					    	  return ((LocalDate) ldt).format(dtf);
					      else if(ldt instanceof LocalTime)
					    	  return ((LocalTime)ldt).format(dtf);
					      else
					    	  return "";
				 }catch(DateTimeException ex) {
					 return "";
				 }catch(Exception ex) {
					 return "";
				 }
			    	  
		}
		public Object convertStringToLocalDateTime(String dateTimeStr, DateTimeFormatter dtf,DateTimeType type) throws DateTimeParseException{
			try {
						switch(type) {
						case LocalDateTime:
							return LocalDateTime.parse(dateTimeStr,dtf);
						case LocalTime:
							return LocalTime.parse(dateTimeStr,dtf);
						case LocalDate:
							return LocalDate.parse(dateTimeStr,dtf);
				
				}
			}catch(Exception ex) {
				
			}
			return null;
			
		}
}
