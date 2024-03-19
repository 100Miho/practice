package com.practice01;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ex31 - 상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요.");
		System.out.print("상품 가격: ");
		double price = sc.nextDouble();
		System.out.print("받은 돈: ");
		double money = sc.nextDouble();
		System.out.println("==============================");
		System.out.println("받은 돈: " + money);
		System.out.println("상품 가격: " + price);
		System.out.println("부가세: " + price*0.1);
		System.out.println("잔액: " + (money - price));
		
		System.out.println("\nEx32 - 사용자로부터 밑편, 높이 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요.");
		System.out.print("가로: ");
		double width = sc.nextDouble();
		System.out.print("세로: ");
		double height = sc.nextDouble();
		System.out.println("삼각형의 넓이는 " + (width * height / 2) + "입니다.");
		
		System.out.println("\nEx33 - 사용자로부터 구의 반지름을 입력 받아 구의 부피를 구하는 프로그램을 작성하세요.");
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		System.out.println("구의 부피는" + (radius*radius*radius * 3.14 * 4/3) + "입니다.");
		
		System.out.println("\nEx34 - 사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요.");
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		System.out.println("화씨 " + f + "의 섭씨 온도는 " + 5/9.0 * (f-32));
		
		System.out.println("\nEx35 - long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.");
		long time = 365 * 24 * 60 * 60;
		System.out.println("빛이 1년동안 가는 거리는 " + time * 300000L + " km입니다.");
		
		System.out.println("\nEx36 - 동전 별 개수를 입력 받아 총 금액을 계산하는 프로그램을 작성하세요.");
		System.out.print("500원 개수: ");
		int coin500 = sc.nextInt();
		System.out.print("100원 개수: ");
		int coin100 = sc.nextInt();
		System.out.print("50원 개수: ");
		int coin50 = sc.nextInt();
		System.out.print("10원 개수: ");
		int coin10 = sc.nextInt();
		System.out.println("동전의 총합은 " + (coin500*500 + coin100*100 + coin50*50 + coin10*10) + "원 입니다.");
		
		System.out.println("\nEx37 - 사용자에게 연필의 개수와 인원수를 입력 받아 모든 인원에게 같은 수의 연필을 나눠주려고 한다.\n1인당 연필을 받을 수 있는 연필의 개수와 나머지를 구하시오.");
		System.out.print("\n전체 연필 개수를 입력해주세요: ");
		int pencil = sc.nextInt();
		System.out.print("전체 인원수를 입력해주세요: ");
		int person = sc.nextInt();
		System.out.println("1인당 연필의 개수는" + pencil / person + "입니다.");
		System.out.println("연필의 나머지 개수는 " + pencil % person + "입니다.");

		System.out.println("\nEx38 - 총 금액을 입력하면 백원단위는 할인해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요.");
		System.out.print("전체금액을 입력해주세요: ");
		int amount = sc.nextInt();
		System.out.println("실제 지불금액은 " + (amount/1000 * 1000) + "원 입니다.");
		
		sc.close();
	}
}