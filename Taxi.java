package practice;

import java.util.*;
public class Taxi
{
    public static int farecalc(int dist){
        int d = dist-5;
        int fd = d*10;
        int tf = fd+100;
        return tf;
    } 
    public static int drivergains(int cfare,int taxiavail,int []tfares,int []a,int []cl){
        int rtf=0;
    
        tfares[taxiavail-1]=tfares[taxiavail-1]+cfare;
        rtf=tfares[taxiavail-1];
  
        return rtf;
    }
    //gives locATION FIRST PRIORITY AND THEN GIVES THE LOWEST EANER OF THE DAY TTHE NEXT PRIORITY
    
    public static int taxiCheker(int pickup,int jtime,int[] a,int []cl,int []tfares){
        int r=0;
        int mp=0;
        int flag=0;
        int fla=0;
        int min=1000000000;
        for(int i=0;i<cl.length;i++){if(cl[i]==pickup&&a[i]==0){mp=i;fla=1;break;}}
        int kp=0;
         if(fla==0){
             for(int i=0;i<tfares.length;i++){if(tfares[i]<min){min=tfares[i];kp=i;}}
         for(int i=0;i<a.length;i++){
             if(a[i]==0&&i==kp){
                 r=i;
                 flag=1;
                 a[i]=jtime;break;}
             }
         }
       else if(fla==1){for(int i=0;i<a.length;i++){
             if(i==mp){r=i;flag=1;a[i]=jtime;break;}
         }
         }
         for(int j=0;j<a.length;j++){
            if(a[j]!=0&&j!=r){
             if(a[j]-jtime<0){a[j]=0;}
             else{a[j]=a[j]-jtime;}
            }
         }
         if(flag==1){r=r+1;}
         else if(flag==0){r=0;}
        return r;
    }
    public static void storeDetails(int taxiavail,int bookingid,int customerno,int pickup,int destination,
    int ptime,int dtime,int fare,String [][] txd){
    
     txd[taxiavail-1][0]=txd[taxiavail-1][0]+" "+Integer.toString(bookingid);
     txd[taxiavail-1][1]=txd[taxiavail-1][1]+" "+Integer.toString(customerno);
     txd[taxiavail-1][2]=txd[taxiavail-1][2]+" "+Integer.toString(pickup);
     txd[taxiavail-1][3]=txd[taxiavail-1][3]+" "+Integer.toString(destination); 
     txd[taxiavail-1][4]=txd[taxiavail-1][4]+" "+Integer.toString(ptime);
     txd[taxiavail-1][5]=txd[taxiavail-1][5]+" "+Integer.toString(dtime);
     txd[taxiavail-1][6]=Integer.toString(fare);
     txd[taxiavail-1][7]=Integer.toString(taxiavail);    
    }
    public static void cablocator(int destination,int []cl,int taxiavail){
        cl[taxiavail-1]=destination;
        
    }
    public static void displayDetails(String txd[][]){
       System.out.println();
       System.out.println("Printing the Booking history");
       System.out.println();
       System.out.print("                      BookID     CustID     Pickup         drop       Stime     Etime      Earnings");
        for(int i=0;i<txd.length;i++){
            System.out.println();
           if(txd[i][7]!=""){ System.out.print("Details of Taxi-No "+txd[i][7]+" ");}
            for(int j=0;j<txd[0].length-1;j++){if(txd[i][j]!=null){
              System.out.print(txd[i][j]+"           ");
            }
            }
        }
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number of taxi's");
	    int numoftaxis = scan.nextInt();
	    int a [] = new int[numoftaxis];
	    int tfares [] = new int[numoftaxis];
	    String txd [][] = new String[numoftaxis][8];
	    int cl[] = new int[numoftaxis];
	    for(int i=0;i<numoftaxis;i++){cl[i]=1;}
	    for(int i=0;i<txd.length;i++){
            for(int j=0;j<txd[0].length;j++){
                txd[i][j]="";
            }
        }
	    System.out.println("Enter the number of point's");
	    int numofpts = scan.nextInt();
	    if(numofpts==0&&numofpts==1){System.out.println("Walking is good for Health... try it for yourself");}
	    System.out.println("Enter the number of customers");
	    int numofcust=scan.nextInt();
	    int customerno=0;
	    int bookingid=0;
	    for(int i=0;i<numofcust;i++){
	    customerno++;
	    bookingid++;
	    System.out.println("Customer no: "+customerno);	
	    System.out.println("Enter the pickup point");
	    int pickup =scan.nextInt();
	    while(pickup>numofpts){
            System.out.println("Please enter a valid floor location less  than "+numofpts);
            pickup=scan.nextInt();
            if(pickup<=numofpts){break;}
              }
	    System.out.println("Enter the destination point");
	    int destination = scan.nextInt();
	    while(destination>numofpts){
            System.out.println("Please enter a valid floor location less  than "+numofpts);
            destination=scan.nextInt();
            if(destination<=numofpts){break;}
              }
	    int diff = Math.abs(destination-pickup);
	    int dist = diff*15;
	    int time = diff*60;
	    System.out.println("Enter the pickup time");
	    int ptime = scan.nextInt();
	    int dtime = ptime+(time/60);
	    int tt=0;
	    tt=tt+time;
	    int taxiavail = taxiCheker(pickup,time,a,cl,tfares);
        if(taxiavail==0){System.out.println("Please try again as all taxis are busy");i--;continue;}
	    if(taxiavail!=0){System.out.println("Taxi can be alloted");System.out.println("Taxi number is "+taxiavail);}
	    cablocator(destination,cl,taxiavail);
	    int cfare = farecalc(dist);
	    int fare = drivergains(cfare,taxiavail,tfares,a,cl);
	    storeDetails(taxiavail,bookingid,customerno,pickup,destination,ptime,dtime,fare,txd);
	    }
	    displayDetails(txd);
	    scan.close();
	}
}
