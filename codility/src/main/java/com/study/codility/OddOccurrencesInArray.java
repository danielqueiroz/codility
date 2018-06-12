package com.study.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddOccurrencesInArray s = new OddOccurrencesInArray();
		System.out.println(s.solution(new int[]{9,3,9,3,9,7,9,3,3}));
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		if(A == null || A.length == 0) {
			return 0;
		}
		
		if(A.length == 1) {
			return A[0];
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: A) {
			if(map.containsKey(i)) {
				map.remove(i);
			} else {
				map.put(i, i);
			}
		}
		
		return map.values().iterator().next();
    }

}
