package ning.zeng;

import java.util.Scanner;

public class ID_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.隨機創建身分證");
			System.out.println("2.身分證驗證");
			System.out.println("請輸入編號:");
			String choose = sc.next();
			switch (choose) {
			case "1":
				ID_Creat.creatId();
				break;
			case "2":
				ID_Check.checkID();
				break;
			}
			
		}
	}
}
