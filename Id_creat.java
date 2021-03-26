package com.company;
import java.util.*;
public class Id_creat {
	public static Random ran = new Random();
	//判定字母
	public static char firstChar(){
		char a = (char)(cNum(26,65));
		switch(a){
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
	//字母轉身分證代碼
	public static int transfer(char a){
		switch(a){
		int i=0;
		case 'A':
			i=10;
			break;
		case 'B':
			i=10;
			break;
		case 'C':
			i=10;
			break;
		case 'D':
			i=10;
			break;
		case 'E':
			i=10;
			break;
		case 'F':
			i=10;
			break;
		case 'G':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
			
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		case 'A':
			i=10;
			break;
		}
		return i;
	}
	//男生或女生
	public static int secondNum(){
		int n =cNum(2,1);
		return n;
	}
	//國籍
	public static int thirdNum(){
		int n =cNum(0,5);
		return n;
	}
	//流水號碼
	public static int CNum(int i,int j){
		int n = ran.nextInt((i))+j;
		return n;
	}
	//檢測碼
	public static int checkNum(ArrayList<Integer> b){
		int sum = b.get(0)*1 + b.get(1)*9 + b.get(2)*8 + b.get(3)*7 + b.get(4)*6 + b.get(5)*5 +b.get(6)*4 + b.get(7)*3 + b.get(8)*2 + b.get(9)*1 ;
		int i = sum % 10;
		int checknum = 10 - i;
		if(checknum ==10){
			checknum = 0;
		}
		return checknum;
	}

}
	
	

