public class count{
    public static void main(String[] args) {
        int nums =12345;
        int count =0;
        while(nums>0){
            int lastdig =nums%10;
            count++;
            nums=nums/10;
        }System.out.println(count);
    }

}