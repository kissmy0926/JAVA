package ning.zeng;

import java.util.*;

public class ID_Check extends ID_Rule {

	// 檢測身分證
	public static void checkID() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> IDNumber = new ArrayList<Object>();
		ArrayList<Integer> checkNumber = new ArrayList<Integer>();
		System.out.println("請輸入身分證字號: ");
		String id = sc.next();
		id = id.toUpperCase();
		System.out.println("你的身分證字號: " + id.toUpperCase());
		while (true) {
			if (!id.matches("[A-Z]\\d{9}")) {
				System.out.println("長度輸入錯誤!");
				break;
			}
			char id_second = id.charAt(1);
			if (id_second != '1' && id_second != '2') {
				System.out.print("第二碼數字錯誤!");
				break;
			}
			char[] idView = id.toCharArray();

			for (Object o : idView) {
				IDNumber.add(o);
			}
			char iFirst = id.charAt(0);
			int idFirstNum = transform(iFirst);
			int a_1 = idFirstNum / 10;
			int a_2 = idFirstNum % 10;
			checkNumber.add(a_1);

			checkNumber.add(a_2);

			for (int i = 1; i < IDNumber.size(); i++) {
				checkNumber.add(Integer.parseInt(String.valueOf(IDNumber.get(i))));
               
			}
			int k = checkNumber.get(0) * 1 + checkNumber.get(1) * 9 + checkNumber.get(2) * 8 + checkNumber.get(3) * 7
					+ checkNumber.get(4) * 6 + checkNumber.get(5) * 5 + checkNumber.get(6) * 4 + checkNumber.get(7) * 3
					+ checkNumber.get(8) * 2 + checkNumber.get(9) * 1 + checkNumber.get(10) * 1;
			if (k % 10 == 0) {
				System.out.println("正確-----這是真的!!");
			} else
				System.out.println("錯誤-----還敢拿假的啊");
			break;
		}
	}
}
