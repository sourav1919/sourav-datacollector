import java.io.*;
public class sizeTest {
    public static void main(String[] args) throws IOException {
        int p,pos,pd,posd;
        int ch;
        String user_string;
        StringBuilder sb = new StringBuilder("Hello_from_Sourav");
        System.out.println("String :" + sb.toString());
        int len = sb.length();
        System.out.println("Length :" + len);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type 1 for insert or type 2 for delete :");
        ch=Integer.parseInt(br.readLine());
        switch (ch){
            case 1:
                try {
                    System.out.print("Enter location number where you want to insert :");
                    p=Integer.parseInt(br.readLine());
                    System.out.print("Enter string to insert on selected location :");
                    user_string=br.readLine();
                    pos=p-1;
                    sb.insert(pos,user_string);
                } catch (Exception e) {
                    System.err.println(e);
                    System.out.println("Enter only number");
                }
                break;
            case 2:
                try {
                    System.out.print("Enter Starting String location number which you want to Delete :");
                    pd=Integer.parseInt(br.readLine());
                    pd=pd-1;
                    System.out.print("Enter Ending String location number which you want to Delete :");
                    posd=Integer.parseInt(br.readLine());
                    sb.delete(pd,posd);
                } catch (Exception e) {
                    System.err.println(e);
                    System.out.println("Enter only  number");
                }
                break;
            default:
                System.out.println("Enter correct option and rerun your program");
        }
        int len2=sb.length();
        System.out.println("New String :"+sb);
        System.out.print("New Length :"+len2);
    }
}
