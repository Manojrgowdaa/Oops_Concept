class staticBlockDemo2{
    static int a;
    static{
        a=5;
        System.out.println("static block is executed:" + a);
    }
public static void main(String[] args) {
    System.out.println("main method is executed");
    System.err.println("value of a:" +a);
}
}