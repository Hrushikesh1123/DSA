package lld.foodApp;

public  abstract class RestoAppService extends  AppInstance implements LoginInterface{

    public int login(String emailId, String password) {
        int id=foodApp.setLogin(new User(emailId,password));
        System.out.println("logged in user id " + id);
        return id;
    }
}
