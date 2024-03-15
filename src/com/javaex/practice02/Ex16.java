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
//		
//		System.out.println("\nEx17");
//		System.out.print("수익을 입력해 주세요. >> ");
//		int profit = sc.nextInt();
//		double tax;
//		if (profit > 0 && profit <= 1000) {
//			tax = profit * 0.09;
//			System.out.println("소득세는 " + tax + "만원 입니다.");
//		} else if (profit > 1000 && profit <= 4000) {
//			tax = (1000*0.09) + 0.18*(profit-1000);
//			System.out.println("소득세는 " + tax + "만원 입니다.");
//		} else if (profit > 4000 && profit < 8000) {
//			tax = (1000*0.09) + (3000*0.18) + 0.27*(profit-4000);
//			System.out.println("소득세는 " + tax + "만원 입니다.");
//		} else if (profit >= 8000) {
//			tax = (1000*0.09) + (3000*0.18) + 4000*0.27 + 0.36*(profit-8000);
//			System.out.println("소득세는" + tax + "만원 입니다.");
//		} else {
//			System.out.println("잘못 입력했습니다.");
//		}
//		
//		System.out.println("\nEx18");
//		System.out.print("알파벳 한 글자(소문자)를 입력하세요. >> ");
//		String c = sc.next();
//		switch (c) {
//		case "a":
//		case "e":
//		case "i":
//		case "o":
//		case "u":
//		case "w":
//		case "y":
//			System.out.println("모음입니다.");
//			break;
//		case "b":
//		case "c":
//		case "d":
//		case "f":
//		case "g":
//		case "h":
//		case "j":
//		case "k":
//		case "l":
//		case "m":
//		case "n":
//		case "p":
//		case "q":
//		case "r":
//		case "s":
//		case "t":
//		case "v":
//		case "x":
//		case "z":
//			System.out.println("자음입니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		System.out.println("\nEx19");
		System.out.print("태어난 연도를 입력해 주세요. >> ");
		
		
		sc.close();
	}
}