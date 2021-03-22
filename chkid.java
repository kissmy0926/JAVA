package com.company;
import java.util.Scanner;
public class chkid {


	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         while (true) {
             @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
             System.out.print("請輸入身份證字號：");

             String id = sc.next();
             id = id.toUpperCase();
             int id1 = id.charAt(1)-'0';

//驗證輸入格式是否正確

             if(!id.matches("[A-Z]\\d{9}")) {                      //一個英文字加九個數字
                 System.out.println("輸入格式錯誤！");
                 continue;
             }

             if(id1!= 1 && id1 != 2) {                                 //第一個數字為1或2
                 System.out.println("輸入格式錯誤！");
                 continue;
             }

//驗證演算法是否正確

             String s = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
             int id00 = (s.indexOf(id.charAt(0))+10)/10;
             int id01 = (s.indexOf(id.charAt(0))+10)%10;
             int id9 = id.charAt(9)-'0';
             int sum = 0;

             for(int i=1,j=8;i<9;i++) {
                 sum += (id.charAt(i)-'0')*j;
                 j--;
             }
             sum = sum + id00*1 + id01*9;

             if(sum%10 == 10-id9) {
                 System.out.print("身分證驗證正確！");
                 break;
             }
             else if(sum%10==0 && id9==0) {
                 System.out.print("身分證驗證正確！");
                 break;
             }
             else {
                 System.out.print("身分證驗證錯誤！");
                 break;
             }
         }
     }

}
