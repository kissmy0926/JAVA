package com.company;
import java.util.Scanner;
public class chkid {


	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         while (true) {
             @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
             System.out.print("�п�J�����Ҧr���G");

             String id = sc.next();
             id = id.toUpperCase();
             int id1 = id.charAt(1)-'0';

//���ҿ�J�榡�O�_���T

             if(!id.matches("[A-Z]\\d{9}")) {                      //�@�ӭ^��r�[�E�ӼƦr
                 System.out.println("��J�榡���~�I");
                 continue;
             }

             if(id1!= 1 && id1 != 2) {                                 //�Ĥ@�ӼƦr��1��2
                 System.out.println("��J�榡���~�I");
                 continue;
             }

//���Һt��k�O�_���T

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
                 System.out.print("���������ҥ��T�I");
                 break;
             }
             else if(sum%10==0 && id9==0) {
                 System.out.print("���������ҥ��T�I");
                 break;
             }
             else {
                 System.out.print("���������ҿ��~�I");
                 break;
             }
         }
     }

}
