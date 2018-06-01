package com.study.codility;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermCheck p = new PermCheck();
		int[] array = new int[] {1,4,1};
		System.out.println(p.solution(array));
	}
	
	public int solution(int[] A) {
		if(A.length == 1 && A[0] == 1) {
	        return 1;
	    }
	    
	    Arrays.sort(A);
		
	    for(int i=1; i<=A.length; i++) {
	        if(A[i-1] != i) {
	        	return 0;
	        }
	    }
	    
	    return 1;
	}
}
