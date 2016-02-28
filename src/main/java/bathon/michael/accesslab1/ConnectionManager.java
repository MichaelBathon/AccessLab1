package bathon.michael.accesslab1;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 1/28/16.
 */
public class ConnectionManager {

    ConnectionManager(){

    }

    public static Connection makeConnection(){
        return Connection.createConnection();
    }

    public static void severConnection(int x){
        connections.remove(x);
        System.out.println("Connection terminated.");
        Connection.terminateConnection();
    }

    static ArrayList<Connection> connections = new ArrayList<Connection>();



    public static void main(String[] args) {

     // Connection connection = new Connection(); won't allow explicit creation due to private constructor
        Connection connection1 = ConnectionManager.makeConnection();
        connection1.setPortNum(4);
        connection1.setIpAddress("123.45.678.9");


        connection1.displayConnection();

        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());
        connections.add(ConnectionManager.makeConnection());

        //connections.remove(8);

       // System.out.println(connections.get(8));

        ConnectionManager.severConnection(8);

        connections.add(ConnectionManager.makeConnection());

        connections.get(0).setPortNum(7);
        connections.get(0).setIpAddress("457.23.465.8");

        connections.get(0).displayConnection();

        connections.get(8).setPortNum(3);
        connections.get(8).setIpAddress("178.16.912.4");

        connections.get(8).displayConnection();


       /* Connection connection2 = ConnectionManager.makeConnection();
        Connection connection3 = ConnectionManager.makeConnection();
        Connection connection4 = ConnectionManager.makeConnection();
        Connection connection5 = ConnectionManager.makeConnection();
        Connection connection6 = ConnectionManager.makeConnection();
        Connection connection7 = ConnectionManager.makeConnection();
        Connection connection8 = ConnectionManager.makeConnection();
        Connection connection9 = ConnectionManager.makeConnection();
        Connection connection10 = ConnectionManager.makeConnection();
        Connection connection11 = ConnectionManager.makeConnection();


        ConnectionManager.severConnection(connection10);
        ConnectionManager.severConnection(connection9);
        ConnectionManager.severConnection(connection8);

        ConnectionManager.severConnection(connection1);

        connection1.displayConnection();

        connection1 = null; */



    }


}
