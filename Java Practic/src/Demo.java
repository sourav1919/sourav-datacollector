class Demoo {
     int x=3;
    void fun()
    {
        System.out.println("Sourav here");
        System.out.println(x);
    }
    void test()
    {
        System.out.println("Shrestha And Sourav");
    }
}
class Demu extends Demoo{
    int x=2,y=1;
    void fun()
    {
        System.out.println("Shrestha here");
        System.out.println(x);
        System.out.println(y);
    }

}
class Demo
{
    public static void main(String[]shresav){
        System.out.println("Shrestha And Sourav");  //Types of object create and constructor calling
        Demoo ob1=new Demoo();
//        Demu ob2=new Demu();
//        Demoo ob3=new Demu();
//        Demo ob4=new Demo();


        ob1.x=7;
        ob1.fun();
//        ob3.fun();
//        ob3.test();
    }
}

