package com.practice03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Ex01");
		System.out.println("while문==========\nindex = 0\nindex = 1 \nindex = 2");
		System.out.println("for문============\norder = 0\norder = 1\norder = 2");
		System.out.println("========== Code ==========");
		System.out.println("While문==========");
		int index = 0;
		while(index < 3) {
			System.out.println("index = " + index);
			index++;
		}
		System.out.println("for문============");
		for(int order=0; order<3; order++) {
			System.out.println("order = " + order);
		}
		
		System.out.println("\nEx02");
		System.out.println("**");
		System.out.println("**");
		System.out.println("**");
		System.out.println("========== Code ==========");
		int x, y;
		for (x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nEx03");
		System.out.println("***");
		System.out.println("***");
		System.out.println("***");
		System.out.println("========== Code ==========");
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nEx04");
		System.out.println("1\n2\n3\n4");
		System.out.println("====================");
		System.out.println("10\n8\n6\n4\n2");
		System.out.println("========== Code ==========");
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("====================");
		for(int i=10; i>0; i-=2) {
			System.out.println(i);
		}
		
		System.out.println("\nEx05");
		System.out.println("1\n\2n\3\n4\n5");
		System.out.println("========== Code ==========");
		int i01=1;
		boolean flag =true;
		while(flag) {
			if(i01>=5) {
				flag = false;
			}
			System.out.println(i01);
			i01+=1;
		}
		
		System.out.println("\nEx06");
		for(int i=1; i<=100; i++) {
			if((i % 5 == 0) && (i % 7 ==0)) {
				System.out.println(i);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEx07");
		System.out.print("숫자를 입력하세요. >> ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("\nEx08");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j + "*" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nEx10");
		System.out.println("숫자를 입력하세요.");
		int cnt = 1;
		num = 0;
		while(cnt <= 5) {
			System.out.print("숫자 " + cnt + ": ");
			int input = sc.nextInt();
			if(input > num) {
				num = input;
			}
			cnt++;
		}
		System.out.println("최대값은" + num + "입니다.");
		
		sc.close();
	}
}