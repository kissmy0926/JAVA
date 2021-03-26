package com.company;

import java.util.Scanner;

public class ID {
	public static void main(String[] args) {
		Boolean src = true;
		Scanner sc = new Scanner(System.in);
		while (src) {
			System.out.println("選擇選項");
			System.out.println("1.隨機創建身分證");
			System.out.println("2.身分證驗證");
			System.out.println("3.EXIT");
			System.out.println("輸入編號:");
			String choose = sc.next();
			switch (choose) {
			case "1":
				Id_creat.creatId();
				break;
			case "2":
				Id_check.checkID();
				break;
			case "3":
				break;
			}
		}
	}

}
