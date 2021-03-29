package ning.zeng;

import java.util.*;

public class ID_Creat extends ID_Rule {
	// 創建身分證
	public static void creatId() {
		ArrayList<Integer> checkNumber = new ArrayList<Integer>();
		char iFirst = firstChar();
		System.out.print("aa"+iFirst);
		int id_1_num = transform(iFirst);
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
		System.out.print("bb" + checkNumber);
		System.out.println("創建的身分證字號 : ");
		String a;
		a = checkNumber.get(2).toString() + checkNumber.get(3).toString()
				+ checkNumber.get(4).toString() + checkNumber.get(5).toString() + checkNumber.get(6).toString()
				+ checkNumber.get(7).toString() + checkNumber.get(8).toString() + checkNumber.get(9).toString()
				+ checkNumber.get(10).toString();
		System.out.print(iFirst + a);
		char b = iFirst;
		String c = checkNumber.get(2).toString();
		System.out.println("\n縣市: "+ID_Rule.cityNumber(b)+"\n性別: "+ID_Rule.sexNumber(c));

	}

}
