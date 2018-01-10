package string1;

/*Given a string, return a "rotated right 2" version where the last 2 chars
 *are moved to the start. The string length will be at least 2.

 *right2("Hello") -> "loHel"
 *right2("java") -> "vaja"
 *right2("Hi") -> "Hi"
 */

public class RightTwo {

	public String right2(String str) {

		int lastTwo = str.length() - 2;

		return str.substring(lastTwo) + str.substring(0, lastTwo);
	}

}
