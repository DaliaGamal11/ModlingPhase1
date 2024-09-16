public class WE implements IProviders {
    @Override
    public void Form() {
        AbstractForms F1=new Form();
        F1=new TextField(F1);
        F1=new DrobMenu(F1);
        F1.makeform();

    }
}
