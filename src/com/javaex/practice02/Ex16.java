package com.javaex.practice02;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("\nEx16");
//		System.out.print("숫자를 입력해 주세요 >> ");
//		double num = sc.nextInt();
//		System.out.println("===== 삼항연산자 =====");
//		double result = num <=0 ? (num*num*num) - (9*num) + 2 : (7*num) + 2;
//		String str = "계산결과는 " + result + "입니다.";
//		System.out.println(str);
//		System.out.println("========== if문 ==========");
//		if (num <= 0) {
//			result = (num*num*num) - (9*num) + 2;
//		} else {
//			result = (7*num) + 2;
//		}
//		System.out.println(str);
		
		System.out.println("\nEx17");
		System.out.print("수익을 입력해 주세요. >> ");
		int profit = sc.nextInt();
		double tax;
		if (profit > 0 && profit <= 1000) {
			tax = profit * 0.09;
		} else if (profit > 1000 && profit <= 4000) {
			tax = (1000*0.09) + 0.18*(profit-1000);
		} 
		sc.close();
	}
}