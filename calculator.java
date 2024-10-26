import java.util.*;
public class calculator {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();

        System.out.println("enter 2nd number");
        int b=sc.nextInt();

        System.out.println("1:add");
        System.out.println("2:subtract");
        System.out.println("3:multiply");
        System.out.println("4:divide");
        System.out.println("5:modulus");

    int choice=sc.nextInt();
    System.out.println("enter your choice1-5");
    if(choice==1){
        System.out.println("a+b="+(a+b));
    }
    else if(choice==2){
        System.out.println("a-b=" +(a-b));
    }
    else if(choice==3){
        System.out.println("a*b="+(a*b));
    }
    else if(choice==4){
        System.out.println("a/b="+(a/b));
    }
    else if(choice==5){
        System.out.println("a%b"+(a%b));
    }
    else
    System.out.println("invalid");
    }
}