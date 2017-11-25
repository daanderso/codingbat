package warmup1;

/*Given a string, return a new string where the first and last chars have been exchanged.
 *frontBack("code") "eodc"
 *frontBack("a")    "a"
 *frontBack("ab")   "ba" */

public class FrontBack {
	
	public String frontBack(String str) {
		int strLength = str.length() - 1;

		if (str.length() <= 1) {
			return str;
		}

		String front = str.substring(0, 1);
		String rear = str.substring(strLength);
		String middle = str.substring(1, strLength);

		return rear + middle + front;
	}

}
