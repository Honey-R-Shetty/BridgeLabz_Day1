import java.util.Scanner;

public class RepeatingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(Character ch : str.toCharArray()){
            if(sb.indexOf(""+ch)!=-1){
               break;
            }else
                sb.append(ch);
        }
        System.out.println(sb);
        sc.close();
    }
}
