package com.javaex.practice02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ex01 - (6)");
		System.out.println("Ex02 - (9)");
		System.out.println("Ex03 - 'if (0 < age < 18)' → 'if (age>0 && age<18)'");
		System.out.println("Ex04 - 'if (x=0) → if (x==0)'");
		
		System.out.println("\nEx05 - (1) '2번 그룹'입니다.");
		System.out.println("Ex05 - (2) '2번 그룹'입니다.");
		System.out.println("Ex05 - (3) '2번 그룹'입니다.");
		System.out.println("Ex05 - (4) '1번 그룹'입니다.");
		System.out.println("Ex05 - (5) '1번 그룹'입니다.");
		
		System.out.println("\nEx06");
		System.out.print("나이를 입력해 주세요. >> ");
		int age = sc.nextInt();
		System.out.println(age < 65 ? "1번 그룹" : "2번 그룹");
		
		System.out.println("\nEx07");
		System.out.print("나이를 입력해 주세요. >> ");
		age = sc.nextInt();
		if (age >= 0 && age <= 7) {
			System.out.println("취학전 아동 // 무료입니다.");
		} else if (age >= 8 && age <= 13) {
			System.out.println("초등학생 // 2,000원 입니다.");
		} else if (age >= 14 && age <= 16) {
			System.out.println("중학생 // 3,000원 입니다.");
		} else if (age >= 17 && age <=19) {
			System.out.println("고등학생 // 4,000원 입니다.");
		} else if (age >20) {
			System.out.println("성인 // 5,000원 입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("\nEx08");
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		double height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
		double bmi = weight / (height*height) * 10000;
		if (bmi <= 18.5 ) {
			System.out.println("저체중입니다.");
			System.out.println("BMI: " + bmi);
		} else if (bmi > 18.5 && bmi <= 24.9) {
			System.out.println("정상체중입니다.");
			System.out.println("BMI: " + bmi);
		} else if (bmi > 24.9) {
			System.out.println("과체중입니다.");
			System.out.println("BMI: " + bmi);
		}
		
		System.out.println("\nEx09");
		System.out.print("태어난 년도를 입력해 주세요. >> ");
		int year = sc.nextInt();
		age = 2024 - year;
		if (year > 15 || year <= 65) {
			System.out.println(age + "살. 무료예방접종 대상자입니다.");
		} else {
			System.out.println(age + "살. 무료예방접종 대상자가 아닙니다.");
		}
		
		System.out.println("\nEx10");
		System.out.println("숫자 두 개를 입력해 주세요.");
		System.out.print("숫자 1 >> ");
		int num01 = sc.nextInt();
		System.out.print("숫자 2 >> ");
		int num02 = sc.nextInt();
		System.out.println("===== 삼항연산자 ======");
		System.out.println("큰 수: " + (num01 > num02 ? num01 : num02) + "\t작은수: " + (num01 < num02 ? num01 : num02) + "입니다.");
		System.out.println("========== if문 ===========");
		if (num01 > num02) {
			System.out.println("큰 수: " + num01 + "\t작은 수: " + num02 + "입니다.");
		} else if (num01 < num02 ) {
			System.out.println("큰 수: " + num02 + "\t작은 수: " + num01 + "입니다.");
		} else {
			System.out.println("두 수는 " + num01 + "로 동일합니다.");
		}
		System.out.println("========== switch문 ===========");
//		boolean result = (num01 - num02) > 0;
//		switch (result) {
//		case true:
//			System.out.println("큰 수: " + num01 + "\t작은 수: " + num02 + "입니다.");
//			break;
//		case false:
//			System.out.println("큰 수: " + num02 + "\t작은 수: " + num01 + "입니다.");
//			break;
//		}
		
		
		sc.close();
	}
}