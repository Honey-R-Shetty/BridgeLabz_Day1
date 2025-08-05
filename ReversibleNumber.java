public class ReversibleNumber {
    public static void main(String[] args) {
        int n =36;
        StringBuilder sb = new StringBuilder(""+n);
        int reverse=Integer.parseInt(sb.reverse().toString());

        int num = n+reverse;
        while(num!=0){
            int digit=num%10;
            if(digit%2==0){
                System.out.println(n+" is Not reversible");
                return;
            }
            num/=10;
        }
        System.out.println(n+" is Reversible");
    }
}
