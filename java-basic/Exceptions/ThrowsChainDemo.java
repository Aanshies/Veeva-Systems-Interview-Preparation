class Main{
    public int methodA() throws ArithmeticException{
        return 10/0;
    }
    public static void main(String[] args){
        Main obj=new Main();
        try{
            obj.methodA();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }
    }
}
