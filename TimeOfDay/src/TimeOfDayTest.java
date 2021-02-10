import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		
		TimeOfDay time = new TimeOfDay(0,0);
		time.setHour(11);
		time.setMinute(5);
		assert time.getHour() == 11;
		assert time.getMinute() == 5;
		
	}

}
