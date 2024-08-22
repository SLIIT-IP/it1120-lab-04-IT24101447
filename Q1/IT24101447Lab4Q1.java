import java.util.Scanner;
public class IT24101447Lab4Q1 { 
public static void main(String[] args) {
	int num;
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	num=input.nextInt();
	if(num==0){
		System.out.println("The number is : zero");
		}
	else if (num>0){
		System.out.println("The number is : Positive");
	}
	else {
		System.out.println("The number is: Negative");
	}
}

}