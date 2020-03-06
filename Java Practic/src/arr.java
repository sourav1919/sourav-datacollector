import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class arr {
    public static void main(String[]demo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ar[] = new int[5];
        int n = ar.length;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < n - 1; j++) {
            for (int k = 0; k < n - j - 1; k++) {
                if (ar[k] > ar[k + 1]) {
                    int temp=ar[k];
                    ar[k]=ar[k+1];
                    ar[k+1]=temp;
                }
            }

        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        for(int m=n-1;m>0;m--) {
            if (ar[m] == ar[m - 1]) {
                continue;
            } else {
                System.out.println();
                System.out.print(ar[m - 1]);
                break;
            }
        }
//        System.out.println();
//        System.out.println(ar[n-2]);
    }
}
