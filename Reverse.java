
public class Reverse {

    public static void main(String[] args) {
        int nums = 123;
        int rev = 0;

        while (nums > 0) {
            int lastdig = nums % 10;
            nums = nums / 10;
            rev = rev * 10 + lastdig;
        }

        System.out.println(rev);
    }
}


