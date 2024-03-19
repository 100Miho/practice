package com.practice02;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ex11");
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		if (num01 > num02) {
			System.out.println("몫: " + num01/num02 + "\t나머지: " + num01%num02);
		} else {
			System.out.println("몫: " + num02/num01 + "\t나머지: " + num02%num01);
		}
		
		System.out.println("\nEx12");
		System.out.println("숫자 세 개를 입력해 주세요.");
		System.out.print("숫자 1: ");
		num01 = sc.nextInt();
		System.out.print("숫자 2: ");
		num02 = sc.nextInt();
		System.out.print("숫자 3: ");
		int num03 = sc.nextInt();
		if(num01 > num02) {
			if (num02 > num03) {
				System.out.println("가장 작은 수는 " + num03 + "입니다.");
			} else {
				System.out.println("가장 작은 수는 " + num02 + "입니다.");
			}
		} else {
			System.out.println("가장 작은 수는 " + num01 + "입니다.");
		}

		System.out.println("\nEx13");
		System.out.print("첫번째 숫자: ");
		num01 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num02 = sc.nextInt();
		if(num01 > num02) {
			if (num01 % num02 == 0) {
				System.out.println(num02 + "은/는 " + num01 + "의 약수입니다.");
			} else {
				System.out.println(num02 + "은/는" + num01 + "의 약수가 아닙니다.");
			}
		} else {
			if (num02 % num01 == 0) {
				System.out.println(num01 + "은/는" + num02 + "의 약수입니다.");
			} else {
				System.out.println(num01 + "은/는" + num02 + "의 약수가 아닙니다.");
			}
		}
		
		System.out.println("\nEx14");
		System.out.print("사변(정수)를 입력해 주세요. >> ");
		int input = sc.nextInt();
		switch (input % 3) {
		case 0:
			System.out.println("A팀입니다.");
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
		
		System.out.println("\nEx15");
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String sign = sc.next();
		System.out.print("숫자 1: ");
		double num1 = sc.nextInt();
		System.out.print("숫자 2: ");
		double num2 = sc.nextInt();
		double result;
		switch (sign) {
		case "+":
			result = num1 + num2;
			System.out.println("결과는 " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("결과는 " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("결과는 " + result);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("계산할 수 없습니다.");
			} else {
				result = num1 / num2;
				System.out.println("결과는 " + result);
			}
			break;
		default:
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}
}