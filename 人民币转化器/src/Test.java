package com.www.ch01;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		
		//String str2="" ;
		String[] str1=new String[100];
		Scanner a =new Scanner(System.in);
		int j =0;
		  
		 
		do{
		   String b  =a.nextLine();
			str1[j]=b;
			//str2+=str1[i];
			
		   }
		while(!(str1[j++].equals("Ԫ��")));
		//System.out.println(str1[0]);
		   
		
	   Test test =new Test();
	   test.change(str1,j);
	   //test.changemax(str4,j);
}
		
	public String[] change(String str[],int j){
		
		String str3="";
		String[] str4=new String[j];    
		for(int i=0;i<j;i++){
			
		switch (str[i]) {
		case "0":str[i]="��";
			
			break;
		case "1":str[i]="Ҽ";
			break;
		case "2":str[i]="��";
			
			break;
		case "3":str[i]="��";
			break;
		case "4":str[i]="��";
			
			break;
		case "5":str[i]="��";
			break;
		case "6":str[i]="½";
			
			break;
		case "7":str[i]="��";
			break;
		case "8":str[i]="��";
			
			break;
		case "9":str[i]="��";
			break;
		default:
			break;
			
		}
		//str3+=str[i];
		str4[i]=str[i];
		//System.out.println(str4[i]);
		}
		//System.out.println(str3);
		Test test1 =new Test();
		test1.changemax(str4, j);
		return  str4;
	}
	
	public String changemax(String str4[],int j){
		String[] str5=new String[j]; 
		String str6="";
		
		for(int i=0;i<j;i++){
			if(str4[i].equals("��"))
			{
				if(str4[i-1].equals("��")||str4[i-1].equals("")){
					str4[i]="";
					
					}
				
				 else ;
			}
			//System.out.println(str4[i]);
		}
			
	
		for(int i=0;i<j;i++){
			int b =j-i;
			if(str4[i].equals("��")||str4[i].equals(""))
			{str5[i]=str4[i];}
			
			else{
			switch(b){
		case 1:str5[i]=str4[i];
			break;
		case 2:str5[i]=str4[i];
			
			break;
		case 3:str5[i]=str4[i]+"ʰ";
			break;
		case 4:str5[i]=str4[i]+"��";
			
			break;
		case 5:str5[i]=str4[i]+"ǧ";
			break;
		case 6:str5[i]=str4[i]+"��";
			
			break;
		case 7:str5[i]=str4[i]+"ʰ";
			break;
		case 8:str5[i]=str4[i]+"��";
			
			break;
		case 9:str5[i]=str4[i]+"ǧ";
			break;
		case 10:str5[i]=str4[i]+"��";
		break;
			}
			
		}

			str6+=str5[i];
		}
		System.out.println(str6);
		return str6;
		
	}
	
	
}
