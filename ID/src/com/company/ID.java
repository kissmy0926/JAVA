package com.company;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		Boolean src = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(src) {
			System.out.println("��ܿﶵ");
			System.out.println("1.�H���Ыب�����");
			System.out.println("2.����������");
			System.out.println("3.EXIT");
			System.out.println("��J�s��:");
			String choose = sc.next();
			switch (choose) {
			case "1":
				Id_from.creatId();
				break;
			case "2":
				Id_from.checkID();
				break;
			case "3":
				break;
			}
		}
         /*int x,y,z,w;
         Scanner sc = new Scanner(System.in);
         System.out.println("��ܿﶵ");
         x= sc.nextInt();
         y=sc.nextInt();
         z=sc.nextInt();
         w=sc.nextInt();
         System.out.println("1.�H���Ыب�����");
			System.out.println("2.����������");
			System.out.println("3.EXIT");*/
	}
}
