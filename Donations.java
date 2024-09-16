import java.util.Scanner;

public class Donations implements IService {

    @Override
    public IProviders ProviderType(String SP) {
        if(SP.equals("Cancer")){
            return new Cancer();
        }
        if(SP.equals("NGO")){
            return new NGO();
        }
        if(SP.equals("Schools")){
            return new Schools();
        }
        return null;
    }

    @Override
    public void showlist() {
            System.out.println("1)Cancer");
            System.out.println("1)NGO");
            System.out.println("1)Schools");
    }

    @Override
    public PaymentMethod payType(String payType) {
            if(payType.equals("CreditCard")){
                return new CreditCard();
            }
            if(payType.equals("Wallet")){
                return new Wallet();
            }
            if(payType.equals("Cash")){
                return new CshDelivary();
            }
            return null;
    }

    @Override
    public void showlistofPM() {
        System.out.println("1)Cash");
        System.out.println("1)CreditCard");
        System.out.println("1)Wallet");
    }
}
