package com.practice01;

public class Ex11 {
	public static void main(String[] args) {
		System.out.println("Ex11 - 'char cVar = 'ab' → cahr cVar = 'a'");
		System.out.println("Ex12 - 'int x , y = 0;' → int x = 0, y = 0");
		System.out.println("Ex13 - (1) - (1)만 상수형이고 나머지는 실수형");
		System.out.println("\nEx14 - 5\t6\t6\t6\t7\t6\t6\t6\t5");
		int a = 5;
		System.out.println("Ex14 - " + a + "\t" + ++a + "\t" + a + "\t" + a++ + "\t" + a + "\t" + --a + "\t" + a + "\t" + a-- + "\t" + a);
		
		System.out.println("\nEx15 - -1\t6\t3\t11\t5.5\t4\t3.5");
		System.out.println("Ex15 - " + (12 / 5-3) + "\t" + (5 + 19  % 3) + "\t" + (2 + 2 / 2) + "\t" + (29 % 3 + 29 / 3) + "\t" + (39 % 3 + 18.0 / 4) + "\t" + ((14 + 7/2) / 4) + "\t" + (14 + 7/2.0) / 5);
		
		System.out.println("\nEx16 - a=" + 4 + "\t b=" + 4 + "\tx=" + 2 + "\ty=" + 1);
		int x= 1, y=1, b = ++x * 2, c = y++ * 2;
		System.out.println("Ex16 - a=" + b + "\tb=" + c + "\tx=" + x + "\ty=" + y);

		System.out.println("\nEx17 - 'int x , y;' → int x=10, y=20;");
		System.out.println("Ex18 - 변수 x에 대입된 값이 없기 때문에 출력할 데이터가 없음");
		
		System.out.println("\nEx19 - 92\t40\t51");
		int num01 = 40, num02 = 50, result = (num01++) + (++num02);
		System.out.println("Ex19 - " + result + "\t" + num01 + "\t" + num02);

		System.out.println("\nEx20 - 11\t1");
		int i=10, n= i++ %2;
		System.out.println("Ex20 - " + i + "\t" + n);
		
	}
}