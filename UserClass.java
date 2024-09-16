public class UserClass {
    private String Email;
    private String Password;
    private String USerName;
    public void Signin(String E, String P){
        Email=E;
        Password=P;

    }
    public void Signup(String E, String P, String USerNAme){
        Email=E;
        Password=P;
        USerName=USerNAme;
    }
    public String getEmail(){
        return Email;
    }
    public String getUSerName(){
        return USerName;
    }

    public String getPassword(){
        return Password;
    }
}
