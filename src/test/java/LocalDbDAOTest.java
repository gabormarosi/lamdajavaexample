import org.junit.Assert;

import java.util.SortedMap;

import static org.junit.jupiter.api.Assertions.*;

class LocalDbDAOTest {

    @org.junit.jupiter.api.Test
    void LocalDbDAO() {
        LocalDbDAO dao =new LocalDbDAO();
        String name="Virgil";
        String output = dao.putObjectToDb("A",name);
        System.out.println("output: "+output);
        String result = dao.getObjectFromDb(output);
        System.out.println("result: "+result);
        Assert.assertEquals(name,result);
    }


}