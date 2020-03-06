import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ageCal {
    public static void main(String[] args) throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter birthday month :");
        int month=Integer.parseInt(br.readLine());
        System.out.print("Enter birthday date :");
        int day = Integer.parseInt(br.readLine());
        System.out.print("Enter birthday year :");
        int year = Integer.parseInt(br.readLine());
        String user_bdy=day+"/"+month+"/"+year;
        int agecal;
//        agecal=
    }
}
