package com.study.codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium t = new TapeEquilibrium();
		int[] array = new int[] {-1000,1000};
		System.out.println(t.solution(array));
	}
	
	public int solution(int[] A) {
        
		if(A.length <= 1) {
			return A[0];
		}
		
        int total = 0;
        int minimumDifference = Integer.MAX_VALUE;
        int subTotal = 0;
       
        for(int i=0;i<A.length;i++) {
            total += A[i];
        }

        for(int i = 0; i < A.length-1; i++) {
        	
        	subTotal += A[i];
        	
        	if(minimumDifference > Math.abs(subTotal - (total - subTotal))) {
        		minimumDifference = Math.abs(subTotal - (total - subTotal));
        	}
        	
        }
        
        return minimumDifference;
    }
}
