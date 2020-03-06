class A{
    int x;
    static int y=0;
    public A(){
        y++;
    }

    void fun(){
        A a=new A();
        A ss=new A();

    }
    void fun1(){
        A b=new A();
    }

}
class B {
    static int k=0;
    public B()
    {
        k++;
    }
    void task(){
        B b=new B();

    }
}
class object {
    private static int p;
    public static void main(String[]Shresav){
        A c=new A();
        B bb=new B();
        c.fun();
        c.fun1();
        bb.task();
        p=A.y+B.k;
        System.out.println("Total object created on this program: "+p);
    }

}














