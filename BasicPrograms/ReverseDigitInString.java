package BasicPrograms;

import java.util.Scanner;

public class ReverseDigitInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String st = s.next();
        char[] ch = st.toCharArray();
        int first =0,last=st.length()-1;
        while(first<last){
            if (Character.isDigit(ch[first])) {
                if(Character.isDigit(ch[last])){
                    char temp=ch[first];
                    ch[first]=ch[last];
                    ch[last]=temp;
                    first++;
                    last--;
                }else
                    last--;
            }else
                first++;
        }
        System.out.println(new String(ch));
        s.close();
    }
}