import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static  void main(String[]args) {

        String st;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            st = br.readLine();
            int st1 = Integer.parseInt(br.readLine());
            int st2 = Integer.parseInt(br.readLine());
            for (int i = st1; i <= st2; i++) {
                System.out.print(st.charAt(i));
            }
        }catch (Exception e)
        {
            System.err.println(e);

        }

    }
}
