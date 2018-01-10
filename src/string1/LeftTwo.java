package string1;
/*Given a string, return a "rotated left 2" version where the first 2 chars 
 * are moved to the end. The string length will be at least 2.

 *left2("Hello") -> "lloHe"
 *left2("java") -> "vaja"
 *left2("Hi") -> "Hi"
 */

public class LeftTwo {

	public String left2(String str) {
		  
		  String firstTwoChars = str.substring(0,2);
		  String body = str.substring(2);
		  
		  return body+firstTwoChars;
	}

}
