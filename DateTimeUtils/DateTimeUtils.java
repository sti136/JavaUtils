package DateTimeUtils;

import java.time.format.DateTimeFormatter;

public interface DateTimeUtils {
	enum DateTimeType{
		LocalTime,
		LocalDateTime,
		LocalDate;
	}
  String convertLocalDateTimeToString(Object ldt, DateTimeFormatter dtf);
  
  Object convertStringToLocalDateTime(String dateTimeStr, DateTimeFormatter dtf,DateTimeType type);
  
}
