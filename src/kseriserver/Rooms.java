package kseriserver;

/**
 *
 * @author MeTaXaS4
 */
public class Rooms {

    private int id;
    private int countOfSeats;
    private int status;
    private String password;

    public Rooms(int sId, int sCountOfSeats, int sStatus, String sPassword) {
        id = sId;
        countOfSeats = sCountOfSeats;
        status = sStatus;
        if (sPassword == null || sPassword.isEmpty()) {
            password = "none";
        } else {
            password = sPassword;
        }
    }

    public void setId(int sId) {
        id = sId;
    }

    public void setCountOfSeats(int sCountOfSeats) {
        countOfSeats = sCountOfSeats;
    }

    public void setStatus(int sStatus) {
        status = sStatus;
    }

    public void setPassword(String sPassword) {
        password = sPassword;
    }

    public int getId() {
        return id;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public boolean getStatusb() {
        if (status == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getStatuss() {
        if (status == 0) {
            return "open";
        } else {
            return "close";
        }
    }

    public String getPassword() {
        return password;
    }
}
