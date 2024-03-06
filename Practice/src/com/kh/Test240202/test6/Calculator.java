package com.kh.Test240202.test6;

public class Calculator {
	public double getSum(int data) throws InvalidException {
		
		if (data < 2 || data > 5) {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		
		double sum = 0;
		for (int i = 1; i <= data; i++) {
			sum += i;
		}
		
		return sum;
	}
}
