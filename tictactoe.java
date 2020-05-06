package practice;

import java.util.*;

public class tictactoe {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> list1 =new  ArrayList<Integer>(); 
		ArrayList<Integer> list2 =new  ArrayList<Integer>();
		String xo[][] = new String[3][3];
		int check1 [] = {11,12,13};
		int check2 [] = {21,22,23};
		int check3 [] = {31,32,33};
		int check4 [] = {11,21,31};
		int check5 [] = {12,22,32};
		int check6 [] = {13,23,33};
		int check7 [] = {11,22,33};
		int check8 [] = {13,22,31};
		Random rand = new Random();
		int one=rand.nextInt();
		int two=rand.nextInt();
		int count=0;
		int c=0;
		while(true){	
		System.out.println("The players are given X or O based on Coin toss");
		if((one+two)%2==0){
			System.out.println("Player one gets to play first and picks X");
			System.out.println("Player two gets to play second and picks O");
			while(true){
				System.out.println("Player 1 please enter your position ");
				int mf = scan.nextInt()-1;
				
				while(mf>2||mf<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 mf =scan.nextInt()-1;
					 if(mf<=2){break;}
				}
				int nf = scan.nextInt()-1;
				while(nf>2||nf<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 nf =scan.nextInt()-1;
					 if(nf<=2){break;}
				}
				
				if(xo[mf][nf]==null){xo[mf][nf]="X";count++;
				String val1 =Integer.toString(mf+1);
				String val2 =Integer.toString(nf+1);
				String valt=val1+val2;
				int val = Integer.parseInt(valt);
				list1.add(val);
				for(int i =0;i<3;i++) {
					
				for(int j=0;j<list1.size();j++) {
					
					if(check1[i]==list1.get(j)){
						c++;break;
					}
				}
				}
				
				if(c==3){System.out.println("Player one wins "); return;}
				
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check2[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check3[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check4[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check5[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check6[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check7[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check8[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				
			}	
				
				else {
					while(true){
					System.out.println("Enter a different location as this is occupied");
					 mf = scan.nextInt()-1;
					 
					while(mf>2||mf<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 mf =scan.nextInt()-1;
						 if(mf<=2){break;}
					}
					nf = scan.nextInt()-1;
					while(nf>2||nf<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 nf =scan.nextInt()-1;
						 if(nf<=2){break;}
					}
					
					if(xo[mf][nf]==null){xo[mf][nf]="X";count++;
					String val1 =Integer.toString(mf+1);
					String val2 =Integer.toString(nf+1);
					String valt=val1+val2;
					int val = Integer.parseInt(valt);
					list1.add(val);
					for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check1[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check2[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check3[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check4[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check5[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check6[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check7[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check8[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					break;}
					
					}
				}
				if(count==9){break;}
				System.out.println("Player 2 please enter your position ");
				int ms = scan.nextInt()-1;
				
				while(ms>2||ms<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 ms =scan.nextInt()-1;
					 if(ms<=2){break;}
				}
				int ns = scan.nextInt()-1;
				while(ns>2||ns<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 ns =scan.nextInt()-1;
					 if(ns<=2){break;}
				}
				
				if(xo[ms][ns]==null){xo[ms][ns]="O";count++;
				String val1 =Integer.toString(ms+1);
				String val2 =Integer.toString(ns+1);
				String valt=val1+val2;
				int val = Integer.parseInt(valt);
				list2.add(val);
				for(int i =0;i<3;i++) {
				for(int j=0;j<list2.size();j++) {
					if(check1[i]==list2.get(j)){
						//System.out.println(check1[i]+" "+list2.get(j));
						c++;break;
					}
				}
				}
				
				if(c==3){System.out.println("Player two wins "); return;}
				
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check2[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check3[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check4[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check5[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check6[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check7[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check8[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				}
				else {
					while(true){
					System.out.println("Enter a different location as this is occupied");
					 ms = scan.nextInt()-1;
					 
					while(ms>2||ms<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 ms =scan.nextInt()-1;
						 if(ms<=2){break;}
					}
					ns = scan.nextInt()-1;
					while(ns>2||ns<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 ns =scan.nextInt()-1;
						 if(ns<=2){break;}
					}
					
					if(xo[ms][ns]==null){xo[ms][ns]="O";count++;
					String val1 =Integer.toString(ms+1);
					String val2 =Integer.toString(ns+1);
					String valt=val1+val2;
					int val = Integer.parseInt(valt);
					list2.add(val);
					for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check1[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check2[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check3[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check4[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check5[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check6[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check7[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check8[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					break;}
					
					}	
				}
			}	
		}	
		if((one+two)%2!=0){
			System.out.println("Player two gets to play first and picks X");
			System.out.println("Player one gets to play second and picks O");
			while(true){
				System.out.println("Player 2 please enter your position ");
				int tms = scan.nextInt()-1;
				
				while(tms>2||tms<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 tms =scan.nextInt()-1;
					 if(tms<=2){break;}
				}
				int tns = scan.nextInt()-1;
				while(tns>2||tns<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 tns =scan.nextInt()-1;
					 if(tns<=2){break;}
				}
				
				if(xo[tms][tns]==null){xo[tms][tns]="X";count++;
				String val1 =Integer.toString(tms+1);
				String val2 =Integer.toString(tns+1);
				String valt=val1+val2;
				int val = Integer.parseInt(valt);
				list2.add(val);
				for(int i =0;i<3;i++) {
				for(int j=0;j<list2.size();j++) {
					if(check1[i]==list2.get(j)){
						c++;break;
					}
				}
				}
				
				if(c==3){System.out.println("Player two wins "); return;}
				
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check2[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check3[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check4[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check5[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check6[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check7[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check8[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
				c=0;} 
				else {
					System.out.println("Enter a different location as this is occupied");
					 tms = scan.nextInt()-1;
					 
					while(tms>2||tms<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 tms =scan.nextInt()-1;
						 if(tms<=2){break;}
					}
					tns = scan.nextInt()-1;
					while(tns>2||tns<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 tns =scan.nextInt()-1;
						 if(tns<=2){break;}
					}
					
					if(xo[tms][tns]==null){xo[tms][tns]="X";count++;
					String val1 =Integer.toString(tms+1);
					String val2 =Integer.toString(tns+1);
					String valt=val1+val2;
					int val = Integer.parseInt(valt);
					list2.add(val);
					for(int i =0;i<3;i++) {
					for(int j=0;j<list2.size();j++) {
						if(check1[i]==list2.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player two wins "); return;}
					
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check2[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check3[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check4[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check5[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check6[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check7[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list2.size();j++) {
							if(check8[i]==list2.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player two wins "); return;}
						
					c=0;
					break;}
					
					}
				if(count==9){break;}
				System.out.println("Player 1 please enter your position ");
				int tmf = scan.nextInt()-1;
				
				while(tmf>2||tmf<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 tmf =scan.nextInt()-1;
					 if(tmf<=2){break;}
				}
				int tnf = scan.nextInt()-1;
				while(tnf>2||tnf<0){
					System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
					 tnf =scan.nextInt()-1;
					 if(tnf<=2){break;}
				}
				
				if(xo[tmf][tnf]==null){xo[tmf][tnf]="O";count++;
				String val1 =Integer.toString(tmf+1);
				String val2 =Integer.toString(tnf+1);
				String valt=val1+val2;
				int val = Integer.parseInt(valt);
				list1.add(val);
				for(int i =0;i<3;i++) {
				for(int j=0;j<list1.size();j++) {
					if(check1[i]==list1.get(j)){
						c++;break;
					}
				}
				}
				
				if(c==3){System.out.println("Player one wins "); return;}
				
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check2[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check3[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check4[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check5[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check6[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check7[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;
				for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check8[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
				c=0;}
				else {while(true){
					System.out.println("Enter a different location as this is occupied");
					 tmf = scan.nextInt()-1;
					
					while(tmf>2||tmf<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 tmf =scan.nextInt()-1;
						 if(tmf<=2){break;}
					}
					 tnf = scan.nextInt()-1;
					while(tnf>2||tnf<0){
						System.out.println("Please enter an appropriate value which is greter than 0 and number less than or equal to 3");
						 tnf =scan.nextInt()-1;
						 if(tnf<=2){break;}
					}
					
					if(xo[tmf][tnf]==null){xo[tmf][tnf]="O";count++;
					String val1 =Integer.toString(tmf+1);
					String val2 =Integer.toString(tnf+1);
					String valt=val1+val2;
					int val = Integer.parseInt(valt);
					list1.add(val);
					for(int i =0;i<3;i++) {
					for(int j=0;j<list1.size();j++) {
						if(check1[i]==list1.get(j)){
							c++;break;
						}
					}
					}
					
					if(c==3){System.out.println("Player one wins "); return;}
					
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check2[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check3[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check4[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check5[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check6[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check7[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					for(int i =0;i<3;i++) {
						for(int j=0;j<list1.size();j++) {
							if(check8[i]==list1.get(j)){
								c++;break;
							}
						}
						}
						
						if(c==3){System.out.println("Player one wins "); return;}
						
					c=0;
					break;}
					
					}
				}
			}	
		
		}	
		
	
		System.out.println("Game tie");

		
		} 
}

}