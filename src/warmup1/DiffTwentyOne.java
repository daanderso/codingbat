package warmup1;

/*Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.*/

public class DiffTwentyOne {

	public int diff21(int n) {
		int diff = 21 - n;

		if (n > 21) {
			diff = (2 * diff) * -1;
		}

		return diff;
	}

}
