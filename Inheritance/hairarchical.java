class hairarchicalss{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends hairarchicalss{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends hairarchicalss{  
void meow(){System.out.println("meowing...");}  
}  
class hairarchical{  
public static void main(String args[]){
 
Cat c=new Cat();  

c.meow();  
c.eat();  
//c.bark();  
}}  