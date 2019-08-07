public class Starter {

    public static void main(String[] args){
        LocalDbDAO dao =new LocalDbDAO();
        System.out.println(dao.putObjectToDb("A","Sarah"));
    }
}
