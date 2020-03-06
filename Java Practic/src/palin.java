import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palin {
    public static void main(String[]args) throws IOException {
        String st;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String :");
        st=br.readLine();
        StringBuilder sb=new StringBuilder(st);
        String st1=sb.toString();
        sb.reverse();
        String st2=sb.toString();
        System.out.println(st2.toLowerCase());
        if(st1.equalsIgnoreCase(st2)){
            System.out.print("Yes Palindrom");
        }
        else{
            System.out.print("Not a Palindrom ");
        }
    }
}
