public class Average {
	/*
	 * Computes the average of an array of integers given the array's length
	 */
	public static int average(int k, int[] list) {
		int average = 0;
		k = Math.abs(k);
		int n = Math.min(k, list.length);
		if (n > 0) {
			for(int i = 0; i < n; i++) {
				average += list[i];
			}
			average = average/n;
		}
		return average;
	}
}
