/**
 * 
 */
package com.company;

/**
 * @author User
 *
 */
public class ID {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String idNumber = ID.IDRandom();

        System.out.println("-------�����Ҧr��-------");

        System.out.println(idNumber);

	}
	 public String str="";



	    public static String IDRandom(){





	        char[] idByChar = new char[9];



	        String iDString = "";



	        //�H���ͦ�A~Z

	        int x = (int)Math.floor(Math.random()*26+65);

	        idByChar[0] = (char) x;



	        //�H���ͦ�1~2

	        idByChar[1] = (char)(int)Math.floor(Math.random()*2+49);



	        //�H�����X��3~��9�ӼƦr

	        for (int i=2;i<9;i++){

	            idByChar[i] = (char)(int)Math.floor(Math.random()*10+48);

	        }



	        //�ĤQ�ӼƦr�ѫe�E�Ӧr�զ�



	        iDString = new String(idByChar);

	        ID id = new ID(iDString);

	        int[] temp = new int[10];

	        temp[0]= id.D0();



	        for(int i=1;i<9;i++){

	            temp[i]=id.DNumber(i);

	        }

	        //�̫�N�r�հ_�Ӱe�X

	        temp[9]=(10-(id.CheckCode(temp)%10))%10;

	        iDString = iDString+temp[9];





	        return iDString;

	    }



	    //D0�O��Ĥ@�Ӧr���N�X�A�]�����ǼƦr���W�ߩҥH�n�Ϋܦhif���P�_

	   public int D0(){

	        int D00=0;

	        int temp = this.str.codePointAt(0);



	        if(72>=temp && temp>=65)

	        {

	            D00 = temp-55;

	        }else if(78>=temp&&temp>=74){

	            D00 = temp-56;

	        }else if(86>=temp&&temp>=80){

	            D00 = temp-57;

	        }else if(90>=temp&&temp>=88)

	        {

	            D00 =temp-58;

	        }

	        switch(temp){

	            case 74 :

	                D00 =temp-39;



	            case 79 :

	                D00 =temp-44;

	                break;



	            case 87 :

	                D00 =temp-55;

	                break;

	            default:

	                break;

	        }



	        //�o��O�Ψ��ˬd�ϥΪ̿�J�p�g�ɪ��P�_��

	        if(104>=temp && temp>=97)

	        {

	            D00 = temp-87;

	        }else if(110>=temp&&temp>=106){

	            D00 = temp-88;

	        }else if(118>=temp&&temp>=112){

	            D00 = temp-89;

	        }else if(122>=temp&&temp>=120)

	        {

	            D00 =temp-90;

	        }

	        switch(temp){

	            case 106 :

	                D00 =temp-71;



	            case 111 :

	                D00 =temp-76;

	                break;



	            case 119 :

	                D00 =temp-87;

	                break;

	            default:

	                break;

	        }

	        return D00;

	    }





	    //DNumber�ΨӾ߬d��2~��10�Ӧr�A�ҥH�P�_��²��\�h

	  public int DNumber(int i){

	        int D1=100;

	        //�o�Ӫ�l100�u�O�ΨӪ�ܦp�G�L���O0~9�o�ӭȴN���100

	        //�]�i�H�Ψ�L�ƭȨӪ�ܡA���O�n�קK�ϥ�0~9

	        int temp = this.str.codePointAt(i);

	        if(57>=temp&&temp>=48){

	            D1=temp-48;

	        }

	        return D1;

	    }





	    //�o��u�O���U�p�⨭���ҬO�_���T

	public int CheckCode(int[] X){



	        int x1=Math.floorDiv(X[0],10);

	        int x2=X[0]%10;





	        int Y=x1+(9*x2)+(8*X[1]);

	        for(int i=2;i<=8;i++)

	        {

	            Y=(9-i)*X[i]+Y;

	        }



	        return Y;

	    }



	    public void ChangeID(String s){

	        this.str=s;

	    }



	    public ID(String s){

	        this.str=s;

	    }

	    public ID(){



	    }

}
