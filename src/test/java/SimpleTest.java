import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {
	@Test
	public void testAverage() {
		int[] numbers = {10, 20, 30, 40, 50};
		int avg = Average.average(5, numbers);
		assertEquals(avg,  30);
	}
}
