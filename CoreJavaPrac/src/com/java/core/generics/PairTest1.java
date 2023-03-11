package com.java.core.generics;

public class PairTest1 {

	public static void main(String[] args) {
		String [] words = {"Mary","had","A","little","lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = " + mm.getFirst());
		System.out.println("max = " + mm.getSecond());

	}

}

class ArrayAlg {
	
	public static Pair<String> minmax (String [] strArr) {
		if (strArr == null || strArr.length == 0) return null;
		String min = strArr[0];
		String max = strArr[0];
		
		for (int a = 1; a < strArr.length; a ++) {
			if (min.compareTo(strArr[a]) > 0) min = strArr[a];
			if (max.compareTo(strArr[a]) < 0) max = strArr[a];
			
		}
		
		return new Pair<>(min,max);
	}
}
