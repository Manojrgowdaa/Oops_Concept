class multilevels{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends multilevels{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class multilevel{  
public static void main(String args[]){ 
 
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  