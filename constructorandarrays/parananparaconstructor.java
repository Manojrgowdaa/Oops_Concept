class parananparaconstructor{
    String name;
    int age;

    public parananparaconstructor () {
        this.name="Manoj";
        this.age=22;


    }
    public parananparaconstructor(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("name:"+name+",age:"+age);
    }
    public static void main(String[] args) {
        parananparaconstructor p1 = new parananparaconstructor();
        p1.display();
        parananparaconstructor p2 = new parananparaconstructor("manoj", 22);
        p2.display();
    }
}