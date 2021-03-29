package ning.zeng;

import java.util.*;

public class ID_Creat extends ID_Rule {
	// 創建身分證
	public static void creatId() {
		ArrayList<Integer> checkNumber = new ArrayList<Integer>();
		char iFirst = firstChar();               //字母
		int id_1_num = transform(iFirst);        //轉換數字
		int num_1 = id_1_num / 10;
		int num_2 = id_1_num % 10;
		checkNumber.add(num_1);
		checkNumber.add(num_2);

		int iSecond = secondNum();
		checkNumber.add(iSecond);

		int iThird = thirdNum();
		checkNumber.add(iThird);

		for (int i = 0; i < 6; i++) {
			int iRan = cNum(9, 0);
			checkNumber.add(iRan);
		}

		int iCheck = checkNum(checkNumber);
		checkNumber.add(iCheck);
		
		String a; 
		a = checkNumber.get(2).toString() + checkNumber.get(3).toString() + checkNumber.get(4).toString()
				+ checkNumber.get(5).toString() + checkNumber.get(6).toString() + checkNumber.get(7).toString()
				+ checkNumber.get(8).toString() + checkNumber.get(9).toString() + checkNumber.get(10).toString();
		char b = iFirst;
		String c = checkNumber.get(2).toString();
		String d = checkNumber.get(3).toString();
		System.out.println("身分證字號 :" + iFirst + a + "\n縣市: " + ID_Rule.cityNumber(b) + "\n性別: "
				+ ID_Rule.sexNumber(c) + "\n國籍:" + ID_Rule.countryNumber(d));

	}

}
