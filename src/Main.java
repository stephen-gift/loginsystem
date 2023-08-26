public class Main  {
    public static void main(String[] args) {
        IDandPassword idandpassword = new IDandPassword();


        new LoginPage(idandpassword.getLoginInfo());
    }
}
