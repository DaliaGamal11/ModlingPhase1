import java.io.*;
import java.util.Scanner;

public class Accounts {
   File accounts =new File("accounts.txt");
    public void addUser(UserClass USer) throws IOException {
          FileWriter myWriter = new FileWriter(accounts,true);
          BufferedWriter info = new BufferedWriter(myWriter);
          info.write(USer.getEmail()+"\r\n");
          info.write(USer.getPassword()+"\r\n");
          info.write(USer.getUSerName()+"\r\n");
          info.close();

    }
    public boolean CheckUSer(UserClass User) throws FileNotFoundException {
        boolean isSigned=false;
        Scanner myReader = new Scanner(accounts);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (data.contains(User.getEmail())){
                isSigned = true;
            } else{
                isSigned = false;
            }
        }
        return isSigned;
    }


}
