package com.javaex.practice01;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		System.out.println("Ex21 - 10\t1");
		int i=10, n = ++i % 2;
		System.out.println("Ex21 - " + i + "\t" + n);
		
		System.out.println("\nEx22 - false\ttrue\tfalse\ttrue\tfalse\ttrue\ttrue");
		System.out.println("Ex22 - " + (17<17) + "\t" + (17<=17) + "\t" + (5>=17) + "\t" + (5>=5) + "\t" + (5==17) + "\t" + (5!=17) + "\t" + (!(5==17)));
		
		System.out.println("\nEx23");
		double speed;
		double time;
		double distance;
		speed = 90.0;
		time = 60.0;
		distance = speed * time;
		System.out.println(distance);
		
		System.out.println("\nEx24");
		double f = 80.0;
		System.out.println(5/9.0*(f-32.0));
		System.out.println("정수형으로 자동형변환이 되기 때문에");
		System.out.println("5/9*(f-32.0) → '5/9.0*(f-32.0)");
		
		System.out.println("\nEx25 - flase\ttrue\tflase\ttrue\ttrue");
		int a = 13;
		System.out.println("Ex25 - " + ((a>13) && (a>=13)) + "\t" + ((a>13) || (a>=13)) + "\t" + ((a/3 == 4) && (a%3 ==3)) + "\t" + ((a/3 == 4) || (3%3 ==2)) + "\t" + ((a/3 == 4) && (a%3 ==3) || (a/3 ==4)));
		
		System.out.println("\nEx26 - 월급을 입력 받아 19년 동안 최대 저축액을 계산하는 프로그램을 작성하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("월급을 입력하세요: ");
		int salary = sc.nextInt();
		System.out.println("10년동안 최대 저축액은" + (salary*12*10) + "원 입니다.");
		
		System.out.println("\nEx27 - 반지름을 입력 받아 원의 면적을 구하는 프로그램을 작성하세요.");
		System.out.print("반지름을 입력하세요: ");
		int radius = sc.nextInt();
		System.out.println("원의 너비는 " + radius*radius*3.14);
		
		System.out.println("\nEx28 - 원화를 달러화로 계산하는 프로그램을 작성하세요.");
		System.out.print("환전할 원화를 입력하세요: ");
		double won = sc.nextDouble();
		System.out.println("받으실 달려는 " + (won / 1230.95) + "$ 입니다.");
		
		System.out.println("\nEx29 - 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.");
		System.out.print("너비를 입력하세요: ");
		double width = sc.nextDouble();
		System.out.print("높이를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.println("사각형의 둘레는 " + (width*2 + height*2));
		System.out.println("사각형의 넓이는 " + width*height);
		
		System.out.println("\nEx30 - 마일을 km로 변환하는 프로그램을 작성하세요.");
		System.out.print("마일을 입력하세요: ");
		double mile = sc.nextDouble();
		System.out.println(mile + "마일은 " + mile*1.609 + "km입니다.");
		
		sc.close();
	}
}