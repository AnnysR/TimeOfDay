
/**
 * Elke instantie van deze klasse geeft een tijdstip van de dag weer.
 * 
 * @invar Hour is positief
 * 		| 0 <= getHour()
 * @invar Hour is kleiner dan 24
 * 		| 24 > getHour()
 *  
 * @invar Minute is positief
 * 		| 0 <= getMinute()
 * @invar Minute is kleiner dan 60
 * 		| 60 > getMinute()
 *
 */


public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 60 * 24 (exclusive)
	 *      | 0 <= minutesSinceMidnight && minutesSinceMidnight < 60 * 24
	 */
	
	private int minutesSinceMidnight;
	
	/**
	 * @post getHour() == hour
	 * @post getMinute() == minute
	 * @throws illegalArgumentException if minutes or hours do not respect boundaries.
	 * 
	 */
	
	public TimeOfDay(int hour, int minute){
		if(hour >= 0  && hour <= 23) {
			if(minute >=0 && minute <= 59) {
				minutesSinceMidnight = 60* hour + minute;
			}
			else {
				throw new IllegalArgumentException("hours out of range");
			}
		}
		else {
			throw new IllegalArgumentException("minutes out of range");
		}
	}

	public int getHour() {
		return this.minutesSinceMidnight / 60;
	}
	
	public int getMinute() {
		return this.minutesSinceMidnight % 60;
	}
	

	
	

	
}
