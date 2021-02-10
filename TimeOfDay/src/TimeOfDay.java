
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
	

	
	private int hour;
	private int minute;
	
	/**
	 * @post getHour() == initHour
	 * @post getMinute() == initMinute
	 * 
	 */
	
	public TimeOfDay(int initHour, int initMinute){
		this.hour = initHour;
		this.minute = initMinute;
	}

	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	/**
	 * @post het uur (Hour) van de tijd is gelijk aan gegeven uur.
	 * 		| this.getHour() == hour
	 * @post De minuten blijven ongewijzigd
	 * 		| this.getMinute() == old(this.getMinute())
	 * 
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	
	/**
	 * @post De minuten van de tijd is gelijk aan de gegeven minuten.
	 * 		| this.getMinute() == minute
	 * @post Het uur blijven ongewijzigd
	 * 		| this.getHour() == old(this.getHour())
	 * 
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}
	

	
}
