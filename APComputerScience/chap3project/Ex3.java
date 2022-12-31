package chap3project;
import java.util.Scanner; //this is for user input
import java.util.concurrent.TimeUnit; // this is to add a wait command

public class Ex3 {
	public static void main(String[] args) throws InterruptedException {
		@SuppressWarnings("resource")
		Scanner myObj = new Scanner(System.in);   //creates an scanner object 
	    System.out.println("Enter x1:");
	    int x1 = myObj.nextInt();   //object looks for next int assins it to varible
	    System.out.println("X1: " + x1);  //shows user what they put
	    System.out.println(""); // space
	    TimeUnit.SECONDS.sleep(1); // sleep
	    System.out.println("Enter y1:"); //repeat for other varibles
	    int y1 = myObj.nextInt();  
	    System.out.println("y1: " + y1);  
		System.out.println("");
	    TimeUnit.SECONDS.sleep(1);
	    System.out.println("Enter x2:");
	    int x2 = myObj.nextInt();  
	    System.out.println("X2: " + x2);  
		System.out.println("");
	    TimeUnit.SECONDS.sleep(1);
	    System.out.println("Enter y2:");
	    int y2 = myObj.nextInt();  
	    System.out.println("Y1: " + y2);  
	    System.out.println("");
	    TimeUnit.SECONDS.sleep(1);
	    System.out.println("Enter x3:");
	    int x3 = myObj.nextInt();  
	    System.out.println("x3: " + x3);
	    System.out.println("");
	    TimeUnit.SECONDS.sleep(1);
	    System.out.println("Enter y3:");
	    int y3 = myObj.nextInt();  
	    System.out.println("y3: " + y3);  

	    double Trip = distance(x1,y1,x2, y2, x3, y3);
	    System.out.println("Full distance: " + Trip);
	    

	    
	 
	}
	public static double distance(int x1, int y1, int x2, int y2, int x3, int y3) {
		double Distance_1;
		double Distance_2;
		@SuppressWarnings("unused")
		double Distance_3;
		Distance_1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		Distance_2=Math.sqrt((y3 - y2) * (y3 - y2) + (x3 - x2) * (x3 - x2));
		return Distance_3= Distance_1+Distance_2;

		
		
	}

}
