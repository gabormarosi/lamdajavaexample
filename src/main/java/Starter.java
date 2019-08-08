public class Starter {

    public static void main(String[] args){
        LocalDbDAO dao =new LocalDbDAO();
        //System.out.println(dao.putObjectToDb("A","Sarah"));
        System.out.println(dao.getObjectFromDb(
                "7966a0dc-72ac-49af-8293-d6f0f224b966"));
    }
}
