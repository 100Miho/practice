package com.practice03;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("\nEx11");
//		System.out.print("숫자를 입력하세요. >> ");
//		int num = sc.nextInt();
//		if(num % 2 != 0) {
//			for(int i=num-2; i>0; i-=2) {
//				num+=i;
//			}
//		} else {
//			for(int i=num-2; i>0; i-=2) {
//				num+=i;
//			}
//		}
//		System.out.println("결과값: " + num);
//		
//		System.out.println("\nEx12");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		int fac = 1;
//		for(int i=1; i<=num; i++) {
//			fac*=i;
//		}
//		System.out.println("결과값: " + fac);
//		
//		System.out.println("\nEx13");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		int sum = 0;
//		for (int i=0; i<=num; i++) {
//			sum+=i;
//		}
//		System.out.println("결과값: " + sum);
//		
//		System.out.println("\nEx14");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		sum=1;
//		for (int i=1; i<num; i++) {
//			sum += i+1;
//			System.out.print(i + "+");
//		}
//		System.out.println(num + "\n합계: " + sum);
//		
//		System.out.println("/nEx15");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		for (int i = 1; i<=num; i++) {
//			if(num % i ==0) {
//				System.out.println(i);
//			}
//		}
//		
//		System.out.println("\nEx16");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		sum = 0;
//		int cnt = 0;
//		for(int i=1; i<=num; i++) {
//			if(i % 5 == 0) {
//				sum+=i;
//				cnt++;
//			}
//		}
//		System.out.println("5의 배수의 개수: " + cnt);
//		System.out.println("5의 배수의 합: " + sum);
//		
//		System.out.println("\nEx17");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		for(int i=num; i>0; i--) {
//			for(int j=i; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("\nEx18");
//		System.out.print("숫자를 입력하세요. >> ");
//		num = sc.nextInt();
//		for(int i=num; i>0; i--) {
//			for(int j=i; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("+");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("\nEx19");
//		boolean flag = true;
//		int select, input, draw, money=0;
//		while (flag == true) {
//			System.out.println("\n---------------------------------");
//			System.out.println("1)예금 | 2)출금 | 3)잔고 | 4)종료");
//			System.out.println("---------------------------------");
//			System.out.print("선택 >> ");
//			select = sc.nextInt();
//			switch(select) {
//			case 1:
//				System.out.print("예금액 >> ");
//				input = sc.nextInt();
//				money += input;
//				continue;
//			case 2:
//				System.out.print("출금액 >> ");
//				draw = sc.nextInt();
//				money -= draw;
//				continue;
//			case 3:
//				System.out.println("잔고액 >> " + money);
//				continue;
//			case 4:
//				System.out.println("프로그램 종료");
//				flag = false;
//				break;
//			default:
//				System.out.println("다시 입력해 주세요.");
//				continue;
//			}
//		}
		
		
		Random ran = new Random();
		
		System.out.println("\nEx20");
		System.out.println("========================================");
		System.out.println("\t[ 숫자맞추기 게임 시작 ]");
		System.out.println("========================================");
		int num = ran.nextInt(100) + 1;	// 챗GPT 활용 - Java에서 정수 랜덤값을 출력하는 메서드를 알려줘
		boolean flag = false;
		while (flag == false) {
			System.out.println("num = " + num);
			System.out.print("숫자 입력 >> ");
			int input = sc.nextInt();
			
			if (input > 100 || input < 0) {
				System.out.println("1에서 100 까지의 숫자를 입력해 주세요.");
				continue;
			} else if (num == input) {
				System.out.println("정답입니다!");
				System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
				String select01 = sc.next();
				
				switch(select01) {
				case "y":
					System.out.println("========================================");
					System.out.println("\t[ 숫자맞추기 게임 종료 ]");
					System.out.println("========================================");
					flag = true;
					break;
				case "n":
					num = ran.nextInt(100) + 1;
					continue;
				}
			} else if (num > input) {
				System.out.println("UP!");
			} else {
				System.out.println("DOWN!");
			}
		}
		
		sc.close();
	}
}