
class task {
    task(){
        System.out.println("Shrestha here"); //constructor
    }
    static int x = 10;

    void fun(){
        System.out.println("Methodcall "+x); // method
    }
    static     //Static block initialization of java
    {
        System.out.println("x = " + x);
        task tk=new task(); // object created under static block possible
        tk.fun(); // method calling under static block possible

    }

    static int y = x + 5;

    static
    {
        y=y+1;
        System.out.println("y = " + y);
    }


}
class blockstatic{
    public static void main(String[] args)
    {

        System.out.println(task.x +1);
        System.out.println(task.y);

    }
}
