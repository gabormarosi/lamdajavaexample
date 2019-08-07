import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;



public class LocalDbDAO {
    // DynamoDB table name for storing article metadata.
    private static final String DYNAMO_TABLE_NAME = System.getenv("DYNAMO_TABLE_NAME");
    // DynamoDB table attribute name for storing article id.
    private static final String DYNAMO_TABLE_ID_NAME = "id";
    // DynamoDB table attribute name for storing the bucket object key name that contains the article's content.


    AmazonDynamoDB dynamoDb = AmazonDynamoDBClientBuilder.standard().build();



}
