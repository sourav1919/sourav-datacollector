public class MyClass {
      static int x = 1;

    static void demo() {
        if (x == 1) {
           MyClass nb=new MyClass();
            nb.funq();
        }
    }

        void funq() {
        System.out.println(x);
        MyClass.x=4;
        System.out.println(x);

    }

    public static void main(String[] args) {
        MyClass fg=new MyClass();
        fg.demo();
        System.out.print("Hello World !!");
    }
}
