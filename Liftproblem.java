package practice;

import java.util.Scanner;
public class Liftproblem {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of floors");
		int num = scan.nextInt();
		int a [][]  = new int[num][2];
		int floor=0;
		int flag=0;
		int f=0;
		int d=0;
		int count=0;
		System.out.println("Enter the lift's current location");
		floor=scan.nextInt();
		while(floor>num){
            System.out.println("Please enter a valid floor location less  than "+num);
            floor=scan.nextInt();
            if(floor<=num){break;}
    }
		int fl=floor;
                //checking for number of people who call for lift
		           System.out.println("Enter your current floor");
		            f=scan.nextInt();
		            while(f>num){
                    System.out.println("Please enter a valid floor location less  than "+num);
                    f=scan.nextInt();
                    if(f<=num){break;}
            }
		            System.out.println("Enter your desired destination");    
		            d=scan.nextInt();
		            while(d>num){
	                    System.out.println("Please enter a valid floor location less  than "+num);
	                    d=scan.nextInt();
	                    if(d<=num){break;}
	            }
		            a[count][0]=f;f=0;
		            a[count][1]=d;d=0;
		            count++;
		            while(true){
		            System.out.println("do you want the lift to check other operation y-yes and n-no");
		            String s = scan.next();
		            if(s.equals("y")){
		             System.out.println("Enter your current floor");
		            f=scan.nextInt();
		            while(f>num){
                    System.out.println("Please enter a valid floor location less  than "+num);
                    f=scan.nextInt();
                    if(f<=num){break;}
                      }
		            System.out.println("Enter your desired destination");    
		            d=scan.nextInt();
		            while(d>num){
	                    System.out.println("Please enter a valid floor location less  than "+num);
	                    d=scan.nextInt();
	                    if(d<=num){break;}
	            }   
		            a[count][0]=f;f=0;
		            a[count][1]=d;d=0;
		            count++;
		            if(count==num+1){System.out.println("input values have exceeded the limits");break;}
		         
		         }
		           if(s.equals("n")){
		        	   for(int i=0;i<count;i++){
		                	  for(int j=i+1;j<count;j++){
		                		  if(a[i][0]>a[j][0]){
		                			  int tempa = a[i][0];
		                			  a[i][0] = a[j][0];	
		                			  a[j][0] = tempa;
		                			  int tempb = a[i][1];
		                			  a[i][1] = a[j][1];	
		                			  a[j][1] = tempb;
		                			  	
		                		  }
		                	  }
		                  } 
		        	   int max=0;
		        	   int min=1000000000;
		        	   int i,j;
		        	   for( i=0;i<count;i++){
		        		   System.out.println();
		        		   for( j=0;j<2;j++){
		        			   if(a[i][j]>max){max=a[i][j];}
		        		   		if(a[i][j]<min){min=a[i][j];}
		        		   		System.out.print(a[i][j]);
		        		   }
		        	   }
		        	  
		        	   while(true){
		        		   for( i=0;i<count;i++){
		        			   if(a[i][0]>=fl){
		        				   if(a[i][0]==floor&&a[i][1]>a[i][0]){System.out.println("The lift stops at "+a[i][0]+" to board");}
		        			   if(a[i][1]==floor){
		        				   if(a[i][1]>a[i][0]){
		        					   System.out.println("The person who boarded the lift at "+a[i][0]+" gets down at "+a[i][1]);
		        				   a[i][0]=-1000;a[i][1]=-1000;
		        				   }
		        			   }	        			   
		        		   }
		        		 }
		        		   floor++;
		        		   if(floor==max+1){break;}
		        	   }
		        	   	
		        	   while(true){
		        		   for( i=0;i<count;i++){
	        				   if(a[i][0]==floor){System.out.println("The lift stops at "+a[i][0]+" to board");}
		        			   if(a[i][1]==floor){
		        				   if(a[i][1]<a[i][0]){
		        					   System.out.println("The person who boarded the lift at "+a[i][0]+" gets down at "+a[i][1]);
		        					   a[i][0]=-1000;a[i][1]=-1000;
		        				   }
		        			   }	        			   
		        		   }
		        	      
		        		   floor--;
		        		   if(floor==min-1){flag=1;break;}
		        	   }
		           
		        	   for(i=0;i<count;i++){
		        		   if(a[i][0]<fl&&a[i][0]!=-1000){//System.out.println("Enter your destination the lift is at "+a[i][0]);
		        			   if(a[i][0]==floor){System.out.println("The lift stops at "+a[i][0]+" to board");}
		        		   System.out.println("The person who boarded the lift at "+a[i][0]+" gets down at "+a[i][1]);
		        		   }
		        	   }
		        	   
		           if(flag==1){System.out.println("Lift Shutdown...");break;}
		           
		           } 
		            	
		       }     
}
}