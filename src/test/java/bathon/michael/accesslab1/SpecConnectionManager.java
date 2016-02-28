package bathon.michael.accesslab1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/1/16.
 */
public class SpecConnectionManager {
    Connection connection1 = ConnectionManager.makeConnection();

    Connection connection2 = ConnectionManager.makeConnection();
    Connection connection3 = ConnectionManager.makeConnection();
    Connection connection4 = ConnectionManager.makeConnection();
    Connection connection5 = ConnectionManager.makeConnection();
    Connection connection6 = ConnectionManager.makeConnection();
    Connection connection7 = ConnectionManager.makeConnection();
    Connection connection8 = ConnectionManager.makeConnection();
    Connection connection9 = ConnectionManager.makeConnection();
    Connection connection10 = ConnectionManager.makeConnection();
    Connection connection11 = ConnectionManager.makeConnection();


    @Before
    public void setUp(){

        connection1.setPortNum(1);
        connection1.setIpAddress("123.45.678.9");





    }

    @Test
    public void testCreateConnection(){
        String testIP = "123.45.678.9";

        assertNotNull("Fails if connection object not created form static method", connection1);

        assertEquals("Fails if the IP address isn't the same as the test case", testIP, connection1.getIpAddress());

        assertNull("Fails if static make connection method allows Connection object creation beyond 10", connection11);


    }


}
