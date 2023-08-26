import java.util.HashMap;

public class IDandPassword {

    HashMap<String,String> loginInfo = new HashMap<>();

    IDandPassword(){
        loginInfo.put("Stephen","12345");
        loginInfo.put("Admin","admin");
        loginInfo.put("ID","password");

    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
