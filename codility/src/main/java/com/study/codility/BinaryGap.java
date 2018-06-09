package com.study.codility;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap b = new BinaryGap();
		System.out.println(b.solution(561892));
	}
	
	public int solution(int N) {
		// write your code in Java SE 8
		
		String lBinary = Integer.toBinaryString(N);   
		
		System.out.println(lBinary);
		
		int gap = 0;
		int aux = 0;
		for (int i = lBinary.indexOf("1"); i < lBinary.length(); i++) {
			
			if("0".equals(lBinary.substring(i, i+1))) {
				aux++;
			} else {
				
				if(gap < aux) {
					gap = aux;
				}
				aux=0;				
			}
						
		}
		
		return gap;
	}

}
