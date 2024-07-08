class singleinheritance{
    float salary=4000;
}
class employee extends singleinheritance{
    int bonus=1000;
    public static void main(String[] args) {
        employee e1 = new employee();
        
        System.out.println("salary is:"+e1.salary);
        System.out.println("employee bonus is:"+e1.bonus);
        
    }
}