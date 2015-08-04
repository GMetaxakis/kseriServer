package kseriserver;

/**
 *
 * @author MeTaXaS4
 */
public class Users {

    private int id;
    private String username;
    private String password;
    private String email;
    private int wins;
    private int loses;

    public Users(int sId, String sUsername, String sPassword,
            String sEmail, int sWins, int sLoses) {
        id = sId;
        username = sUsername;
        password = sPassword;
        email = sEmail;
        wins = sWins;
        loses = sLoses;
    }

    public void setId(int sId) {
        id = sId;
    }

    public void setUsername(String sUsername) {
        username = sUsername;
    }

    public void setPassword(String sPassword) {
        password = sPassword;
    }

    public void setEmail(String sEmail) {
        email = sEmail;
    }

    public void setWins(int sWins) {
        wins = sWins;
    }

    public void setLoses(int sLoses) {
        loses = sLoses;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }
}
