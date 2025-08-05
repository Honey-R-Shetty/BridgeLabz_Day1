public class MissingElement {
    public static void main(String[] args) {
        int num[]={2,6,8,10,12,14,16,18};
        int d = Math.min(num[1]-num[0], num[num.length-1]-num[num.length-2]);
        for(int i=0;i<num.length-1;i++){
            if((num[i+1]-num[i])!=d){
                System.out.println("Missing element is : "+(num[i]+d));
                return;
            }
        }
        System.out.println("No missing element...");
    }
}
