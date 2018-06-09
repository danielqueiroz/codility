package com.study.codility;

import java.util.Arrays;

public class CiclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(new CiclicRotation().solution(new int[] {-1, -2, -3, -4, -5, -6}, 11)).asLongStream().forEach(System.out::print);
	}
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		
		if(A.length == 1) {
			return A;
		}
		
		int[] X = new int[A.length];
		
		for(int i=0; i< A.length;i++) {
			if(i+K >= A.length) {
				X[(i+K) % A.length] = A[i];
			} else {
				X[i+K] = A[i];
			}
		}
		
		return X;
    }

}
