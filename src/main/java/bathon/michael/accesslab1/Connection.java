package bathon.michael.accesslab1;

/**
 * Created by michaelbathon on 1/28/16.
 */
public class Connection {

    private int portNum;
    private String ipAddress;
    static int count = 0;
    private static final int MAX_CONNECTION_COUNT = 10;

    private Connection(){

    }


    public static Connection createConnection(){
        if(count != MAX_CONNECTION_COUNT){
            count++;
            return new Connection();
        } else {
            System.out.println("Sorry, no more connections are available.");
            return null;
        }

    }


    public static void terminateConnection(){
         //= null;
        count--;
    }

    public void setPortNum(int x){
        this.portNum = x;
    }

    public int getPortNum(){
        return portNum;
    }

    public void setIpAddress(String s){
        this.ipAddress = s;
    }

    public String getIpAddress(){
        return ipAddress;
    }

    public void displayConnection(){
        System.out.println("Your connection's port number is: "+ this.getPortNum() +
        ", and your IP address is: "+ this.getIpAddress());
    }

}
