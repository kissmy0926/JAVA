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

        System.out.println("-------身份證字號-------");

        System.out.println(idNumber);

	}
	 public String str="";



	    public static String IDRandom(){





	        char[] idByChar = new char[9];



	        String iDString = "";



	        //隨機生成A~Z

	        int x = (int)Math.floor(Math.random()*26+65);

	        idByChar[0] = (char) x;



	        //隨機生成1~2

	        idByChar[1] = (char)(int)Math.floor(Math.random()*2+49);



	        //隨機產出第3~第9個數字

	        for (int i=2;i<9;i++){

	            idByChar[i] = (char)(int)Math.floor(Math.random()*10+48);

	        }



	        //第十個數字由前九個字組成



	        iDString = new String(idByChar);

	        ID id = new ID(iDString);

	        int[] temp = new int[10];

	        temp[0]= id.D0();



	        for(int i=1;i<9;i++){

	            temp[i]=id.DNumber(i);

	        }

	        //最後將字組起來送出

	        temp[9]=(10-(id.CheckCode(temp)%10))%10;

	        iDString = iDString+temp[9];





	        return iDString;

	    }



	    //D0是找第一個字的代碼，因為有些數字不規律所以要用很多if做判斷

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



	        //這邊是用來檢查使用者輸入小寫時的判斷式

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





	    //DNumber用來撿查第2~第10個字，所以判斷式簡單許多

	  public int DNumber(int i){

	        int D1=100;

	        //這個初始100只是用來表示如果他不是0~9這個值就顯示100

	        //也可以用其他數值來表示，但是要避免使用0~9

	        int temp = this.str.codePointAt(i);

	        if(57>=temp&&temp>=48){

	            D1=temp-48;

	        }

	        return D1;

	    }





	    //這邊只是輔助計算身份證是否正確

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
