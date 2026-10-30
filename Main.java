import java.util.Scanner;
public class Main {
                   
    public static void main (String args []){
        
        Scanner scanner= new Scanner (System.in);
System.out.println("Enter the first number");
int a = scanner.nextInt();
System.out.println("Enter any operator (+, -, /, *)");
String op=scanner.next();
System.out.println("Enter second number");
int b =scanner.nextInt();
if (op.equals("+")){
    System.out.println(a+b);
}else if (op.equals("-")){
    System.out.println(a-b);
    
}else if (op.equals("*")){
    System.out.println(a*b);
}else if (op.equals("/")){
    System.out.println(a/b);
}else{
    System.out.println("Invalid operator bro");
}

       
    }
}