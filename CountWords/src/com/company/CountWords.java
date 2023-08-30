import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner SC=new Scanner(System.in);
        String S=SC.nextLine();
        int count=1;
        for(int i=0;i<S.length()-1;i++)
        {
            if((S.charAt(i)==' ')&&(S.charAt(i+1)!=' '))
            {
                count++;
            }
        }
        System.out.println("Number of Words in the String:"+count);
    }
}
