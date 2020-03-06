import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrprac {
    public static void main(String[]args) throws IOException {
        int c=0;
        int p=0;
        int ar[]=new int[5];
        int n=ar.length;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {
                if (ar[j]==ar[k]) {
                    c+=1;
//                    int m=ar[j];
//                    for(int a=0;a<n;a++){
//                        if(m==ar[a]){
//                            p+=1;
//                        }
//                    }
                    System.out.println(ar[j]+" "+c);
                }


            }



        }
//        System.out.print(c);

    }
}
