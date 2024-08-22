import java.util.Scanner;
public class IT24101447Lab4Q3{
public static void main(String[]args){
	int num;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number");
	num = input.nextInt();
	String res = (num==0)? "Number is zero" : (num>0)? "Number is Positive" : "Number is Negative";
	System.out.print(res);
 }
}