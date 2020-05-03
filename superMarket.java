package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class superMarket {
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//stacking up the super market
		ArrayList<Integer> list = new ArrayList<Integer>();
		int flag=0;
		int customer=1;
		int i,j;
		int fla=0;
		int sum=0;
		int count=0;
		int crash=0;
		 list.add(8939);
		 list.add(2345);
		 list.add(9677);
		 list.add(7010);
		 list.add(9500);
		String [][] store =  {
								{ "100","apple","50","100","banana","30","100","pomogranate","20" }, 
								{ "500","olives","90","200","carrot","50","100","ladysfinger","40" }, 
								{ "350","brinjal","250","150","bitterguard","40","300","snakeguard","50" },
								{ "600","potato","12","1000","beans","56","50","cabbage","50" },
								{ "550","Lemon","4","400","mintleaves","8","1500","curryleaves","5" },
								{ "500","cardamom","150","1000","bayleaf","250","400","blacksalt","200" },
								{ "50","shampoo","50","100","soap","50","56","moisturizer","278" },
								{ "400","uriddhal","340","480","moongdal","75","560","toordhal","90" },
								{ "35","biscuits","50","100","chocolates","50","20","icecreams","50" },
							}; 

		String bout [][] = new String[100][3];
		int m=0;
		System.out.println("Welcome to the store ABC " );
	while(true){				
					System.out.println("welcome customer number "+customer);
					System.out.println("These are the list of items we have ");
					for(i=0;i<store.length;i++) {
						System.out.println();
						for(j=1;j<store[0].length;j=j+3){
							int amt = Integer.parseInt(store[i][j-1]);
							if(amt!=0) {
							System.out.print(store[i][j]+",");
						}
					}		
				}	   
					System.out.println();
					
			mouter :while(true){
			System.out.println("Can i please know what do you want ? " );
			String required = scan.next().toLowerCase().trim();
			outer :for(i=0;i<store.length;i++) {
				for(j=1;j<store[0].length;j=j+3){
						if(required.equals(store[i][j])) {
							int val =Integer.parseInt(store[i][j-1]); 
							if(val==0){
								System.out.println("The item you have asked for is out of stock ");break outer;}
							if(val!=0){
								
								System.out.println("We have "+val+" 1 kg packets left how much do you want ");
								int cv = scan.nextInt();
								while(cv>val){
									System.out.println(" we dont have that much left but can provide you with a lesser amount \n\r do you want a continue shopping y for yes and n for no ");
									String des = scan.next().toLowerCase();
									if(des.equals("n")){flag=1;break mouter;}
									else {
										System.out.println("We have "+val+" 1 kg packets left how much do you want ");
										cv = scan.nextInt();
										if(cv<val) {break;}
									}
								
								}
								bout[m][0]=Integer.toString(m+1); 
								bout[m][1]=store[i][j];
								int c = Integer.parseInt(store[i][j+1]);
								int storing=c*cv;
								sum=sum+storing;
								String stor = Integer.toString(storing);
								bout[m][2]=stor;
								m++;
								count++;
								val=val-cv;
								store[i][j-1]=Integer.toString(val);
								fla=1;	
								System.out.println("Item added to cart succeessfully ");
							}
					}
				}
			}
			if(fla==0){System.out.println("The item you have entered is not present ");}
			if(flag==1){
				System.out.println("Do you still wish to continue shopping y for yes and n for no");
				String des = scan.next().toLowerCase();	
				if(des.equals("n")){break mouter;}
			}
			if(flag==0){
				System.out.println("Do you still wish to continue shopping y for yes and n for no");
				String des = scan.next().toLowerCase();	
				if(des.equals("n")){break mouter;}
			}
		
		}
		
					if(count>0){
						System.out.println("printing bill details");
			for(i=0;i<m;i++){
				System.out.println();
				for(j=0;j<3;j++){
					System.out.print(bout[i][j]+" ");
					if(!bout[i][j].equals("")){ count++;}
					bout[i][j]="";
				}
			}	
					System.out.println();
				System.out.println();
				System.out.println("Total amount comes up to "+sum);
				
				System.out.println("Do you have a member ship y for yes n for no");
				String s = scan.next();
				if(s.equals("y")){
					System.out.println("Tell me your membership ID");
					int mid =  scan.nextInt();
					for( i=0;i<list.size();i++){
						if(mid ==list.get(i)){crash=1;break;}
					}
					if(crash==0){
						System.out.println("no such member id ");
						
					
					}
				}
				else if(s.equals("n")){System.out.println("do you want to be a member as you get a 10 percent discount above 100rs.\n enter y fo yes and n for no ");
				String ms = scan.next();
				if(ms.equals("y")){
					
					System.out.println("please provide your details like name phone number ");
					String name  = scan.next();
					int phn = scan.nextInt();
					String num = Integer.toString(phn);
					list.add(Integer.parseInt((String) num.subSequence(0,5))); 
					sum=sum-sum/10;
					System.out.println("the amount to be paid is "+sum);
				}
				if(ms.equals("n")){
					System.out.println("okay then");
				}
				}
				System.out.println("How do you wanna pay the bill \n\r 1.cash \n\r 2.card \n\r 3.upi \n\r ");
				int opt=scan.nextInt();
				while(opt>3||opt<1){
					System.out.println("please enter the option correctly ");
					opt=scan.nextInt();
				if(opt==1||opt==2||opt==3) {break;}
				}
					
					switch(opt){
					case 1:
							System.out.println("Please enter the amount you wish to give");
							int cc = scan.nextInt();
							while(cc<sum) {
								System.out.print("you have given a lesser amount please give more than "+sum+" to pay your bill ");
								cc=scan.nextInt();
								if(cc>sum) {break;}
							}
							int diff = cc-sum;
							System.out.println("please collect your change "+diff);break;
					
					case 2:
							System.out.println("please enter your pin number ");
							break;
							
					case 3:	
							System.out.println("please scan the QR ");break;
						
					}
					
					
					}
				
			System.out.println("Thanks for visiting...."    ); 
		
			System.out.println("do we have any oher customers y for yes and n for no ");
			String d = scan.next();
			if(d.equals("y")) {customer++;continue;}
			else{System.out.println("Shop closes and opens tommorow at 9 am....");break;}
		}	
	}

}
