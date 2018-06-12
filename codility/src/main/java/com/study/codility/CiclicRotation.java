package com.study.codility;

import java.util.Arrays;

public class CiclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.stream(new CiclicRotation().solution(new int[] {-1, -2, -3, -4, -5, -6}, 10)).asLongStream().forEach(System.out::print);
	}
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		
		if(A == null || A.length == 0 || A.length == 1) {
			return A;
		}
		
		int[] X = new int[A.length];
		
		int steps = Math.abs(K%A.length);
		
		for(int i=0; i< A.length;i++) {
			if(i+steps >= A.length) {
				X[(i+steps) % A.length] = A[i];
			} else {
				X[i+steps] = A[i];
			}
		}
		
		return X;
    }

}
