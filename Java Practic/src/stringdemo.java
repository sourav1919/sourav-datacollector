public class stringdemo {
    static {
        int a=19;
        String s = "Hello World";
        String s1=s.toUpperCase();
        String s2="    hi";
        String s3=new String("helloooooo");
        String s4=s3.intern();// pool is returned
        String s5=String.valueOf(a);
        String s6="Sourav is a good boy";
        String repla=s6.replace("Sourav","Knglord");
        String rep=repla.replace("good","harami");
        StringBuffer s7=new StringBuffer("Hella");
        StringBuffer s8=new StringBuffer();
        s8.append("Hello hi heloo 5 hi game hfhgfhgfhjghjghjghjgjcchgfhjgjhjkhjk");
        s8.ensureCapacity(100);
//        s7.append("Shrestha");
//        s7.replace(1,4,"kt");
//        s7.delete(1,3);
//        s7.reverse();
//        s7.insert(1,"test");
//        System.out.println(s==s4);
       System.out.println(s.substring(3,7 ));
//        System.out.println(s1);
//        System.out.println(s2.trim());
//        System.out.println(s.startsWith("he"));
//        System.out.println(s.endsWith("j"));
//        System.out.println(s.charAt(2));
//        System.out.println(s.length());
//        System.out.println(s5+98);
//        System.out.println(s6);
//        System.out.println(rep);
////        System.out.println(s7);
//        System.out.println(s8.capacity());

    }
    public static void main(String[]kinglord){

    }
}
