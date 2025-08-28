import java.util.Scanner;
public class san {

    
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = scan.nextInt();
    int lastdigit = num % 10;
    System.out.println("Last digit is: " + lastdigit);
    int n = num;
    while(n>=10)
    {
        n = n/10;
        System.out.println(n);
    }

        
    }

    

