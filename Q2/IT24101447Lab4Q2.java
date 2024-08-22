import java.util.Scanner;
public class IT24101447Lab4Q2 { 
public static void main(String[] args) {
	int emarks;
	int lmarks;
	int eper;
	int lper;
	int final_marks;
	Scanner input= new Scanner(System.in);
	System.out.print("Please enter the exam marks: ");
	emarks=input.nextInt();
	if(emarks>=0 && emarks <=100){
	System.out.print("Please enter the lab submission marks: ");
	lmarks=input.nextInt();	
		if(lmarks>=0 && lmarks <=100){
		System.out.print("Please enter the percentage given for the exam: ");
		eper=input.nextInt();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		lper=input.nextInt();
			if(eper+lper==100){
			final_marks= ((emarks*eper/100)+(lmarks*lper/100));
			System.out.print("Final exam mark is : "+final_marks );
			}
			else{System.out.println("The percentage must add up to 100. Terminating program.");}
		}
		else{System.out.println("Invalid input for lab submission marks. Terminating program.");}
	}
	else{System.out.println("Invalid input for exam marks. Terminating program.");}
}
	
}
