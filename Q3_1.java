import java.util.Random;
import java.util.Scanner;
public class lab2 {
 public static void main(String[] args)
 {
	int choice;
	Scanner sc = new Scanner(System.in);
	do {
		System.out.println("Perform the following methods:");
		System.out.println("1: miltiplication test");
		System.out.println("2: quotient using division by subtraction");
		System.out.println("3: remainder using division by subtraction");
		System.out.println("4: count the number of digits");
		System.out.println("5: position of a digit");
		System.out.println("6: extract all odd digits");
		System.out.println("7: quit");
		//System.out.println("8: five numbers test8" +"");
		choice = sc.nextInt();
		switch (choice) {
		 case 1: /* add mulTest() call */
			 fivemultiTest();
		 break;
		 case 2: /* add divide() call */
			 divide();
		 break;
		 case 3: /* add modulus() call */
			 modulus();
		 break;
		 case 4: /* add countDigits() call */
			 countDigits();
		 break;
		 case 5: /* add position() call */
			 position();
		 break;
		 case 6: /* add extractOddDigits() call */
			 extractOddDigits();
		 break; 
		 case 7: System.out.println("Program terminating ….");
		 break;
		 case 8: 
			 fivemultiTest();
	      break;
		}
	} while (choice < 7);
	 }
 /* add method code here */
 public static void fivemultiTest()
 {
	 int counter=0;
	for(int i=0;i<5;i++)
	{
		Random randomGenerator = new Random();
		int num1 = randomGenerator.nextInt(10);
		int num2 = randomGenerator.nextInt(10);
		System.out.println("How much is "+num1+" times "+num2+" ?");
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt()==(num1*num2))
		{
			counter++;
		}		
	}
	System.out.println(counter+" out of 5 correct!");
 }
 public static void mulTest()
 {
	 Scanner sc = new Scanner(System.in);
	 int num1,num2;
	 System.out.println("Input 2 numbers:");
	 System.out.println("first number:");
	 num1 = sc.nextInt();
	 System.out.println("second number:");
	 num2 = sc.nextInt();
	 System.out.println("result is:"+num1*num2);
 }
 public static void divide()
 {
	 Scanner sc = new Scanner(System.in);
	 int num1,num2,result=0;
	 System.out.println("Input 2 numbers:");
	 System.out.println("m = :");
	 num1 = sc.nextInt();
	 System.out.println("n = :");
	 num2 = sc.nextInt();
	 while(num1>num2)
	 {
		 num1 = num1-num2;
		 result+=1;
	 }
	 System.out.println("result is:"+result);
 }
 public static void modulus()
 {
	 Scanner sc = new Scanner(System.in);
	 int num1,num2,result=0;
	 System.out.println("Input 2 numbers:");
	 System.out.println("numberator:");
	 num1 = sc.nextInt();
	 System.out.println("demoninator:");
	 num2 = sc.nextInt();
	 while(num1>num2)
	 {
		 num1 = num1-num2;
	 }
	 System.out.println("result is:"+num1);
 }
 public static void countDigits()
 {
	 Scanner sc = new Scanner(System.in);
	 int num,result=1;
	 System.out.println("Input 1 numbers:");	 
	 num = sc.nextInt();
	 if(num<0)
	 {
		 System.out.println("error input!");
		
	 }else{
		 while(num/10!=0)
		 {
			 num=num/10;
			 result+=1;
		 }
		 System.out.println("result is:"+result);
	 }
 }


 public static void position()
 {
	 boolean flag = true;
	 Scanner sc = new Scanner(System.in);
	 int num1,num2,remainder=0,counter=0;
	 System.out.println("Input 2 numbers:");
	 System.out.println("source number:");
	 num1 = sc.nextInt();
	 System.out.println("target number:");
	 num2 = sc.nextInt();
	 while(num1/10>0)
	 {
		 counter++;
		 remainder = num1 % 10;
		 //System.out.println("remainder is:"+remainder);
		 num1 = num1 / 10;
		 if(remainder == num2)
		 {
			 System.out.println("position is:"+counter);
			 flag = false;
		 }
	 }
	 if(flag)
		 System.out.println("position is:-1");
	 
 }
 public static void extractOddDigits()
 {
	 Scanner sc = new Scanner(System.in);
	 int num,digit,counter=0;
	 System.out.println("Input a numbers:");
	 num = sc.nextInt();
	 if(num<0)
	 {
		 System.out.println("error input!");
		
	 }else{
	 System.out.println("odd numbers are: ");
	 while(num>0)
	 {
		 digit = num % 10;
		 if(digit%2==1)
		 System.out.println(digit);
		 num = num/10;
	 }
	 }
 }
 
}
