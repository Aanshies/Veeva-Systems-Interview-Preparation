class UserRegistration {
    public static void main(String[] args){
        int age= 130;
        String email="eswariexample.com";
        String phoneNumber="12345abc";
        try{
            if(age>18){
                System.out.println("Age is valid");
            }
            else{
                throw new Exception("Age must be 18 or older");
            }
            if(email.contains("@")){
                System.out.println("Email is valid");
            }
            else{
                throw new Exception("Email must contain @");
            }
            if(phoneNumber.matches("\\d+")){
                System.out.println("Phone number is valid");
            }
            else{
                throw new NumberFormatException("Phone number must be numeric");
            }
        } 
        catch(NumberFormatException e){
            System.out.println("Number Format Exception: "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("General Exception: "+e.getMessage());
        }

    } 
}
