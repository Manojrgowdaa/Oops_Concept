class NonstaticDemo1{
    {
    System.out.println("hiiii");
    }
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        int res;
        res=num1-num2;
        System.err.println("result is:" +res);
        {
            System.out.println("Nonstatic block is executed");
        }
    }

}