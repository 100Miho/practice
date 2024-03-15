package com.javaex.practice02;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ex16");
		System.out.print("숫자를 입력해 주세요 >> ");
		double num = sc.nextInt();
		System.out.println("===== 삼항연산자 =====");
		double result = num <=0 ? (num*num*num) - (9*num) + 2 : (7*num) + 2;
		String str = "계산결과는 " + result + "입니다.";
		System.out.println(str);
		System.out.println("========== if문 ==========");
		if (num <= 0) {
			result = (num*num*num) - (9*num) + 2;
		} else {
			result = (7*num) + 2;
		}
		System.out.println(str);
		
		System.out.println("\nEx17");
		System.out.print("수익을 입력해 주세요. >> ");
		int profit = sc.nextInt();
		double tax;
		if (profit > 0 && profit <= 1000) {
			tax = profit * 0.09;
			System.out.println("소득세는 " + tax + "만원 입니다.");
		} else if (profit > 1000 && profit <= 4000) {
			tax = (1000*0.09) + 0.18*(profit-1000);
			System.out.println("소득세는 " + tax + "만원 입니다.");
		} else if (profit > 4000 && profit < 8000) {
			tax = (1000*0.09) + (3000*0.18) + 0.27*(profit-4000);
			System.out.println("소득세는 " + tax + "만원 입니다.");
		} else if (profit >= 8000) {
			tax = (1000*0.09) + (3000*0.18) + 4000*0.27 + 0.36*(profit-8000);
			System.out.println("소득세는" + tax + "만원 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		System.out.println("\nEx18");
		System.out.print("알파벳 한 글자(소문자)를 입력하세요. >> ");
		String c = sc.next();
		switch (c) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "w":
		case "y":
			System.out.println("모음입니다.");
			break;
		case "b":
		case "c":
		case "d":
		case "f":
		case "g":
		case "h":
		case "j":
		case "k":
		case "l":
		case "m":
		case "n":
		case "p":
		case "q":
		case "r":
		case "s":
		case "t":
		case "v":
		case "x":
		case "z":
			System.out.println("자음입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("\nEx21");
		System.out.print("사변(정수)를 입력해 주세요. >> ");
		int input = sc.nextInt();
		switch (input % 3) {
		case 0:
			if(input == 0) {
				System.out.println("잘못된 사번입니다.");
			} else {
				System.out.println("A팀입니다.");
			}
			break;
		case 1:
			System.out.println("B팀입니다.");
			break;
		case 2:
			System.out.println("C팀입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			
		}
		
		System.out.println("\nEx22");
		System.out.println("숫자 세 개를 입력해 주세요.");
		System.out.print("숫자 1: ");
		int num01 = sc.nextInt();
		System.out.print("숫자 2: ");
		int num02 = sc.nextInt();
		System.out.print("숫자 3: ");
		int num03 = sc.nextInt();
		if(num03 < num02) {
			if (num02 < num01) {
				System.out.println("가장 큰 수는 " + num01 + "입니다.");
			} else {
				System.out.println("가장 큰 수는 " + num02 + "입니다.");
			}
		} else {
			System.out.println("가장 큰 수는 " + num03 + "입니다.");
		}
		
		System.out.println("\nEx23");
		System.out.print("태어난 년도를 입력해 주세요. >> ");
		int year = sc.nextInt();
		int age = 2024 - year;
		System.out.println("올해: 2024");
		System.out.println("태어난 해: " + year);
		System.out.println("나이: " + age);
		System.out.println("==============================");
		if(age >= 20) {
			System.out.println("20살 이상");
			if(age % 2 == 0) {
				System.out.println("건강검진해");
				if(age >= 40) {
					System.out.println("암 검사 O");
				} else {
					System.out.println("암 검사 X");
				}
			} else {
				System.out.println("건강검진해 아님");
			}
		} else {
			System.out.println("20살 미만. 건강검진 대상이 아님.");
		}
		
		sc.close();
	}
}