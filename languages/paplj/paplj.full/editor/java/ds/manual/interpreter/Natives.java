package ds.manual.interpreter;

import com.github.krukow.clj_ds.PersistentMap;

import ds.generated.interpreter.A_This;

public class Natives {

	private static int fresh_counter = 1;

	public static String print_1(String s) {
		System.err.println(s);
		return s;
	}

	public static int fresh() {
		if (fresh_counter == Integer.MAX_VALUE) {
			throw new RuntimeException("Fresh counter overflow");
		}
		return fresh_counter++;
	}

	public static int plusI_2(int i1, int i2) {
		return i1 + i2;
	}

	public static int str2int_1(String s) {
		return Integer.parseInt(s);
	}

	public static int minusI_2(int i1, int i2) {
		return i1 - i2;
	}

	public static int timesI_2(int i1, int i2) {
		return i1 * i2;
	}

	public static int modI_2(int i1, int i2) {
		return i1 % i2;
	}

	public static boolean isbound_2(PersistentMap<String, ?> map, String x) {
		return map.containsKey(x);
	}

	public static boolean eqI_2(int i1, int i2) {
		return i1 == i2;
	}

	public static boolean eqB_2(boolean b1, boolean b2) {
		return b1 == b2;
	}

	public static boolean gtI_2(int i1, int i2) {
		return i1 > i2;
	}

	public static boolean isstored_2(PersistentMap<Integer, ?> map, int loc) {
		return map.containsKey(loc);
	}

	public static A_This mkNullThis_0() {
		return null;
	}

}
