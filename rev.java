public class rev {

    public static void main(String[] args) {
        int num = 123456;
        int remainder;
        int rev = 0;
        while(num!=0)
        {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
            
        }
        System.out.println(rev);
    }
    
}
