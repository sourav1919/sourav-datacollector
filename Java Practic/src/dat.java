import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.math.*;
public class dat {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String day = in.next();
        String month = in.next();
        String year = in.next();
        String input_date=day+"/"+month+"/"+year;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        try{
            DateFormat format2 = new SimpleDateFormat("EEEE");
            String final_day=format2.format(format1.parse(input_date));
            System.out.println(final_day.toUpperCase());
        } catch (ParseException e) {
            e.printStackTrace();
            System.err.println();
        }
    }
}
