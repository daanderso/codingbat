package warmup1;

public class SumDouble {

	/*Given two int values, return their sum. Unless the two values are the
	 * same, then return double their sum.*/

	public int sumDouble(int a, int b) {
		int sum = a + b;

		if (a == b) {
			sum = 2 * (a + b);
		}

		return sum;
	}

}
