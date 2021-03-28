package com.company;

import java.util.*;

public class Id_from {

	// 判定字母
	public static char firstChar() {
		char a = (char) (cNum(26, 65));
		switch (a) {
		case 'L':
			a = 'B';
			break;
		case 'R':
			a = 'D';
			break;
		case 'S':
			a = 'E';
			break;
		case 'Y':
			a = 'A';
			break;
		}
		return a;
	}

	// 字母轉身分證代碼
	public static int transfer(char a) {
		int i = 0;
		switch (a) {
		case 'A':
			i = 10;
			break;
		case 'B':
			i = 11;
			break;
		case 'C':
			i = 12;
			break;
		case 'D':
			i = 13;
			break;
		case 'E':
			i = 14;
			break;
		case 'F':
			i = 15;
			break;
		case 'G':
			i = 16;
			break;
		case 'H':
			i = 17;
			break;
		case 'I':
			i = 34;
			break;
		case 'J':
			i = 18;
			break;
		case 'K':
			i = 19;
			break;
		case 'L':
			i = 20;
			break;
		case 'M':
			i = 21;
			break;
		case 'N':
			i = 22;
			break;
		case 'O':
			i = 35;
			break;
		case 'P':
			i = 23;
			break;
		case 'Q':
			i = 24;
			break;
		case 'R':
			i = 25;
			break;
		case 'S':
			i = 26;
			break;
		case 'T':
			i = 27;
			break;
		case 'U':
			i = 28;
			break;
		case 'V':
			i = 29;
			break;
		case 'W':
			i = 32;
			break;
		case 'X':
			i = 30;
			break;
		case 'Y':
			i = 31;
			break;
		case 'Z':
			i = 33;
			break;
		}
		return i;
	}

	// 男生或女生
	public static int secondNum() {
		int n = cNum(2, 1);
		return n;
	}

	// 國籍
	public static int thirdNum() {
		int n = cNum(5, 0);
		return n;
	}

	// 流水號碼
	public static Random ran = new Random();

	public static int cNum(int i, int j) {
		int n = ran.nextInt((i)) + j;
		return n;
	}

	// 檢測碼
	public static int checkNum(ArrayList<Integer> x) {
		int sum = x.get(0) * 1 + x.get(1) * 9 + x.get(2) * 8 + x.get(3) * 7 + x.get(4) * 6 + x.get(5) * 5 + x.get(6) * 4
				+ x.get(7) * 3 + x.get(8) * 2 + x.get(9) * 1;
		int i = sum % 10;
		int checkNum = 10 - i;
		if (checkNum == 10) {
			checkNum = 0;
		}
		return checkNum;

	}

	// 檢測碼驗證
	public static boolean checkId(ArrayList<Integer> li) {
		int last = checkNum(li);
		boolean b;
		int a = li.get(10);
		if (a == last) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	// 創建身分證
	public static void creatId() {
		ArrayList<Object> showlist = new ArrayList<Object>();
		ArrayList<Integer> checklist = new ArrayList<Integer>();
		char ifirst = firstChar();
		showlist.add(ifirst);
		int id_1_num = transfer(ifirst);
		int num_1 = id_1_num / 10;
		int num_2 = id_1_num % 10;
		checklist.add(num_1);
		checklist.add(num_2);

		int isecond = secondNum();
		showlist.add(isecond);
		checklist.add(isecond);

		int ithird = thirdNum();
		showlist.add(ithird);
		checklist.add(ithird);

		for (int i = 0; i < 6; i++) {
			int iran = cNum(9, 0);
			showlist.add(iran);
			checklist.add(iran);
		}

		int icheck = checkNum(checklist);
		showlist.add(icheck);
		checklist.add(icheck);

		System.out.println("創建的身分證字號 : ");
		for (Object o : showlist) {
			System.out.print(o);
		}
	}

	// 檢測身分證
	public static void checkID() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> showlist = new ArrayList<Object>();
		ArrayList<Integer> checklist = new ArrayList<Integer>();
		while (true) {
			System.out.print("請輸入身分證字號: ");
			String id = sc.next();
			id = id.toUpperCase();

			if (!id.matches("[A-Z]\\d{9}")) {
				System.out.println("輸入錯誤!");
				break;
			}
			char[] idview = id.toCharArray();
			for (Object o : idview) {
				showlist.add(o);
			}
			char iFirst = id.charAt(0);
			int idFirstNum = transfer(iFirst);
			int a_1 = idFirstNum / 10;
			int a_2 = idFirstNum % 10;
			checklist.add(a_1);
			checklist.add(a_2);
			for (int i = 1; i < showlist.size(); i++) {
				checklist.add(Integer.parseInt(String.valueOf(showlist.get(i))));
			}
			System.out.println("\n您輸入的身分字號: " + id);
			boolean b = checkId(checklist);
			System.out.println("驗證是否通過:" + b);
			break;
		}

	}
}