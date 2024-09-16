public class CshDelivary implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("You paid Via Cash on delivary");
    }
}
