package string1;

/* Given 2 strings, return their concatenation, except omit the 
 * first char of each. The strings will be at least length 1.
 * 
 * nonStart("Hello", "There") -> "ellohere"
 * nonStart("java", "code") -> "avaode"
 * nonStart("shotl", "java") -> "hotlava"
 */

public class NonStart {

	public String nonStart(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();

		String aStr = a.substring(1, aLen);
		String bStr = b.substring(1, bLen);

		return aStr + bStr;
	}
}
