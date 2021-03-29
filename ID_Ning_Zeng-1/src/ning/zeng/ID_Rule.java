package ning.zeng;

import java.util.*;

public class ID_Rule {
	public static Random ran = new Random();

	// 首字母(其中有些字母需更換)
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

	// 字母轉數字
	public static int transform(char a) {
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

	// 字母數字轉縣市
	public static Object cityNumber(char a) {
		String city = "";
		switch (a) {
		case 'A':
			city = "台北市";
			break;
		case 'B':
			city = "台中市";
			break;
		case 'C':
			city = "基隆市";
			break;
		case 'D':
			city = "台南市";
			break;
		case 'E':
			city = "高雄市";
			break;
		case 'F':
			city = "新北市";
			break;
		case 'G':
			city = "宜蘭縣";
			break;
		case 'H':
			city = "桃園市";
			break;
		case 'I':
			city = "嘉義市";
			break;
		case 'J':
			city = "新竹縣";
			break;
		case 'K':
			city = "苗栗縣";
			break;
		case 'L':
			city = "台中市";
			break;
		case 'M':
			city = "南投縣";
			break;

		case 'N':
			city = "彰化縣";
			break;
		case 'O':
			city = "新竹市";
			break;
		case 'P':
			city = "雲林縣";
			break;
		case 'Q':
			city = "嘉義縣";
			break;
		case 'R':
			city = "台南市";
			break;
		case 'S':
			city = "高雄市";
			break;
		case 'T':
			city = "屏東縣";
			break;
		case 'U':
			city = "花蓮縣";
			break;
		case 'V':
			city = "台東縣";
			break;
		case 'W':
			city = "金門縣";
			break;
		case 'X':
			city = "澎湖縣";
			break;
		case 'Y':
			city = "台北市";
			break;
		case 'Z':
			city = "連江縣";
			break;

		}
		return city;
	}

	// 性別號碼
	public static int secondNum() {
		int n = cNum(2, 1);
		return n;
	}

	// 性別
	public static Object sexNumber(String secondNum) {
		String sex = "";
		switch (secondNum) {
		case "1":
			sex = "男";
			break;
		case "2":
			sex = "女";
			break;
		}
		return sex;
	}

	// 國籍號碼
	public static int thirdNum() {
		int n = cNum(9, 0);
		return n;
	}
    //國籍
	public static Object countryNumber(String thirdNum ) {
		String country = "";
		switch (thirdNum) {
		case "0":
			country = "台灣";
			break;
		case "1":
			country = "台灣";
			break;
		case "2":
			country = "台灣";
			break;
		case "3":
			country = "台灣";
			break;
		case "4":
			country = "台灣";
			break;
		case "5":
			country = "台灣";
			break;
		case "6":
			country = "國外";
			break;
		case "7":
			country = "無戶籍";
			break;
		case "8":
			country = "港澳";
			break;
		case "9":
			country = "大陸仔";
			break;
		}
		return country;
	}
	// 流水號碼
	public static int cNum(int i, int j) {
		int n = ran.nextInt((i)) + j;
		return n;
	}

	// 檢測碼
	public static int checkNum(ArrayList<Integer> x) {
		int sum = x.get(0) * 1 + x.get(1) * 9 + x.get(2) * 8 + x.get(3) * 7
				+ x.get(4) * 6 + x.get(5) * 5 + x.get(6) * 4 + x.get(7) * 3
				+ x.get(8) * 2 + x.get(9) * 1;
		int i = sum % 10;
		int checkNum = 10 - i;
		if (checkNum == 10) {
			checkNum = 0;
		}
		return checkNum;

	}

}
