public class Unique {
	public static boolean isUniqueChars(String str) {
		int val;
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++){
			val = charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		} 
		return true;

	}
	
	public static void main(String[] args) {}

}
