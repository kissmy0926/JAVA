package ning.zeng;

import java.util.Scanner;
import java.util.*;

public class ID_Check extends ID_Rule {

	// 檢測身分證
	public static void checkID() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> IDNumber = new ArrayList<Object>();
		ArrayList<Integer> checkNumber = new ArrayList<Integer>();
		while (true) {
			System.out.println("請輸入身分證字號: ");
			String id = sc.next();
			id = id.toUpperCase();

			if (!id.matches("[A-Z]\\d{9}")) {
				System.out.println("長度輸入錯誤!");
				break;
			}

			char[] idview = id.toCharArray();
			for (Object o : idview) {
				IDNumber.add(o);
			}
			char iFirst = id.charAt(0);
			System.out.print(iFirst);
			int idFirstNum = transform(iFirst);
			System.out.print(idFirstNum);
			int a_1 = idFirstNum / 10;
			int a_2 = idFirstNum % 10;
			checkNumber.add(a_1);
			checkNumber.add(a_2);
			for (int i = 1; i < IDNumber.size(); i++) {
				checkNumber.add(Integer.parseInt(String.valueOf(IDNumber.get(i))));
			}
			System.out.println("您輸入的身分字號: " + id);
			boolean b = checkId(checkNumber);
			System.out.println("驗證是否通過:" + b);
			break;
		}
	}
}
