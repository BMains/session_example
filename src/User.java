import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    private String passwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(String userName, String passwd) {
        this.userName = userName;
        this.passwd = passwd;
    }

    public User() {
        userName = "";
        passwd = "";
    }

    public boolean equals(Object obj){

        User mu = (User) obj;

        if(userName.equals(mu.getUserName()) && passwd.equals(mu.getPasswd())){

            return true;
        }else{
            return false;
        }
    }
}