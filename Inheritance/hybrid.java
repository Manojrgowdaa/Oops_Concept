class family{
    public void shows(){
        System.out.println("he is grandfather");
    }
}
class father extends family{
    public void fath(){
        System.out.println("he is father");
    }
}
class son extends father{
    public void son(){
        System.out.println("he is son ");
    }
}
class doughter extends father{
    public void doug(){
        System.out.println("she is dougther");
    }
}
class hybrid{
    public static void main(String[] args) {
        son s =new son();
         
        s.son();
        s.fath();
        s.shows();
        System.out.println("-------------------------------");
       
      doughter dos =new doughter();
       dos.doug();
       dos.fath();
       dos.shows();



    }
}

