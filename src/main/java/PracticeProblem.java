public class PracticeProblem {

	public static void main(String args[]) {
		//sum(1,2);
	}
	public static int sum(int addNum1, int addNum2) {
		return addNum1 + addNum2; 
	}
	public static int difference(int justNum1, int justNum2) {
		return justNum1 - justNum2;
	}
	public static double product(double onlyNum1, double onlyNum2) {
		return onlyNum1 * onlyNum2;
	}
	public static String removeFirst(String singleNum1) {
		return singleNum1.substring(1);
	}
	public static int combinedLength(String toNum1, String toNum2) {
		return toNum1.length() + toNum2.length();
	}
	public static boolean isEven(int evenNum1) {
		return evenNum1 % 2 == 0;
	}
	public static boolean isOdd(int oddNum1) {
		return oddNum1 % 2 != 0;
	}
	public static boolean isPositive(int positiveNum1) {
		return positiveNum1 > 0;
	}
	public static boolean isNegative(int negativeNum1) {
		return negativeNum1 < 0;
	}
}
