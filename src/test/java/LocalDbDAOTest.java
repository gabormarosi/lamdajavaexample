import static org.junit.jupiter.api.Assertions.*;

class LocalDbDAOTest {

    @org.junit.jupiter.api.Test
    void LocalDbDAO() {
        LocalDbDAO dao =new LocalDbDAO();
        dao.putObjectToDb("A","Sarah");
        System.out.println(dao.getObjectFromDb(
                "7966a0dc-72ac-49af-8293-d6f0f224b966"));
    }


}