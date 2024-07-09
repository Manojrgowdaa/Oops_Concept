class constructoroverloading{
    String name;
    int age;
    String grade;
  
    public constructoroverloading(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = "Not assigned";
        System.out.println("Parameterized constructor with two parameters called");
    }

   
    public constructoroverloading(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Parameterized constructor with three parameters called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
       

       
       constructoroverloading student2 = new constructoroverloading("manoj", 20);
        student2.display();

       
       constructoroverloading student3 = new constructoroverloading("manu", 22, "A");
        student3.display();
    }
}
