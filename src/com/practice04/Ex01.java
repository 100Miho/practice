package com.practice04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Ex01 - 코드의 오류 수정 및 출력 결과 예상");
		// int[] intArray = new int[5];
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i<intArray.length; i++) {
			result += intArray[i];
		}
		System.out.println("출력 결과 예상 >> 22");
		System.out.println("실제 출력 결과 >> " + result);
		
		System.out.println("\nEx02 - 배열 작성 및 For문 작성");
		double[] doubleArr = {6.7, 3.3, 1.2};
		for(int i=0; i<doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		
		System.out.println("\nEx03 - 출력 값 예상 및 코드 확인");
		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for (int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		System.out.println("출력 결과 예상 >> \n20\n6\n10");
		
		System.out.println("\nEx04 - 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합 출력");
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int num = 0;
		result = 0;
		for(int i=0; i<data.length; i++) {
			if (data[i] % 3 == 0) {
				num++;
				result+=data[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수 >> " + num);
		System.out.println("주어진 배열에서 3의 배수의 합 >> " + result);
		
		System.out.println("\nEx05 - 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램 작성");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		result = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("숫자 %d >> ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		result = sum / arr.length;
		System.out.printf("평균은 %.1f입니다.\n", (double)result);
		
		System.out.println("\nEx06 - 주어진 문자열의 공백을 \',\'로 변경 후 출력");
		char c[] = {'T','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for(int i=0; i<c.length; i++) {
			if (c[i]==' ') {
				c[i] = ',';
			}
			System.out.print(c[i]);
		}
		
		System.out.println("\n\nEx07 - 화폐 개수 변환");
		int [] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		System.out.print("금액: ");
		int money = sc.nextInt();
		for(int i=0; i<wonArray.length; i++) {
			int coin = money / wonArray[i];
			money -=  wonArray[i] * (money / wonArray[i]);
			System.out.printf("%d원: %d개\n", wonArray[i], coin);
		}
		
		System.out.println("\n\nEx08 - 중복 없는 미니 로또");
		int[] lotto = new int[6];
		while(true) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45) + 1;
				if ((i > 0) && (lotto[i] == lotto[i-1])) {
					lotto[i] = (int)(Math.random()*45) + 1;
				}
				System.out.print(lotto[i] + " ");
			}
			break;
		}
	}
}