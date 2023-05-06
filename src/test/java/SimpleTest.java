import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {
	@Test
	public void testAveragePositive() {
		int[] numbers = {10, 20, 30, 40, 50};
		int avg = Average.average(5, numbers);
		assertEquals(30, avg);
	}

	@Test
	public void testAverageNegative() {
		int[] numbers = {-10, 20, -30, 40, -50};
		int avg = Average.average(5, numbers);
		assertEquals(-6, avg);
	}

	@Test
	public void testAverageZeros() {
		int[] numbers = {0, 0, 0, 0, 0};
		int avg = Average.average(5, numbers);
		assertEquals(0, avg);
	}

	@Test
	public void testAverageSingleNumber() {
		int[] numbers = {4};
		int avg = Average.average(1, numbers);
		assertEquals(4, avg);
	}

	@Test
	public void testAverageNegativeSize() {
		int[] numbers = {10, 20, 30, 40, 50};
		int avg = Average.average(-5, numbers);
		assertEquals(30, avg);
	}
}
