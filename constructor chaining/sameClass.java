 class sameClass {
    sameClass(){
        System.out.println("Hi ");
    }
    sameClass(int age){
        this();
        System.out.println(age);
    }
    sameClass(String name){
        this(21);
        System.out.println(name);
    }
    public static void main(String[] args) {
     sameClass s = new sameClass("Lohith");
    }
}
 