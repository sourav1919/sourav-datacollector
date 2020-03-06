
enum practice {Try,Name,Game,What}
public class enumtask {

    public static void main(String[]kinglord){
//        for(Demo d:Demo.values())
//        {
//            System.out.println(d);
//        }
        practice dd=practice.Name;
        System.out.println(dd);
        System.out.println("Try value: "+practice.valueOf("Try"));
        System.out.print("What index: "+practice.valueOf("What").ordinal());
    }
}
