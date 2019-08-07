import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;


public class LocalDbDAO {

    AmazonDynamoDB dynamoDb = AmazonDynamoDBClientBuilder.standard().build();


}
