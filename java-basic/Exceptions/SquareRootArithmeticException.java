class Main{
    public static void main(String[] args){
        int number=5;
        try{
            if(number<0){
                throw new ArithmeticException("No negatives!");//IllegealArgumentException
            }
            else{
                double res=Math.sqrt(number);
                System.out.println("Square root of "+number+" is "+res);
            }
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception:"+e.getMessage());
            }
        }
    }
