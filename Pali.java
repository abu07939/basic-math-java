public class Pali {
    public static void main(String[] args) {
        int rev=0;
        int num =121;
        if(num<0){
            System.out.println("false");
            return ;
        }
        int original = num;
        while(num>0){
            int lastdig = num%10;
            num = num / 10;
            rev = rev*10 +lastdig;
            
        }System.out.println(rev==original);
    }
}
