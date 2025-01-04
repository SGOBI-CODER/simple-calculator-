import java.util.Scanner;
public class example2
{

    public static void main (String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a num1:");
        float num1=scanner.nextInt();
        System.out.println("enter a num2:");
        float num2 =scanner.nextInt();
        System.out.println("simple calculator programe in java");
        System.out.println("choose your operator");
        //
        
        System.out.println("ADDITION-1");
        System.out.println("SUBTRACTION-2");
        System.out.println("MULTIPICATION-3");
        System.out.println("DIVISION-4");
        
        int operation = scanner.nextInt();
        switch(operation)
        {
            case 1:
                System.out.println("addition:"+ (num1+num2));
                break;
            case 2:
                System.out.println("subtraction:" + (num1-num2));
                break;
            case 3:
                System.out.println("multipication:" + (num1*num2));
                break;
            case 4:
                System.out.println("division:" + (num1/num2));
                break;
        }
    }
}