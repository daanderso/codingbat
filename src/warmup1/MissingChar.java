package warmup1;

public class MissingChar {
	
	public String missingChar(String str, int n) {
		int origStrLgth = str.length();
		String strFront = str.substring(0, n);
		String strRear = str.substring(n + 1, origStrLgth);

		return strFront + strRear;

	}
}
