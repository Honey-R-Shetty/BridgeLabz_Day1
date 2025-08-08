package BasicPrograms;

public class FindSecondHighest {
    public static void main(String[] args) {
        int input[]={3,1,5,5,4,2};
        int secondMax=Integer.MIN_VALUE;
        int firstMax=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>firstMax){
                secondMax=firstMax;
                firstMax=input[i];
            }
            if(input[i]<firstMax && input[i]>secondMax)
                secondMax=input[i];
        }
        System.out.println("Second maximum number is : "+secondMax);
    }
}

