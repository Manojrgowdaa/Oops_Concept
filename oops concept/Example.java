class Example{
    public static void staticmethod(){
        System.out.println("satic method executed");

    }
    public void nonstatic(){
        System.out.println("non static method executed");
    }
    public static void main(String[] args) {
        Example.staticmethod();
        Example e=new Example();
         e.nonstatic();
    }
}

