package com.fannie.exception;

public class Ex1 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
		
			
			try {
				int[] arr = new int[-4];

				arr[10] = 3333;
			} catch (NegativeArraySizeException nase) {
				System.out.println("*****" +nase);
			}
			int res = num1 / num2;

			System.out.println("Result is " + res);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception:::: " + ae);
		} catch (ArrayIndexOutOfBoundsException aio) {
			System.out.println("AIOBE::: " + aio);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Some other business logic goes here... ");
	}
}
