import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


public class LocalDbDAO {
    // DynamoDB table name for storing article metadata.
    private static final String DYNAMO_TABLE_NAME = "Customers";
    // DynamoDB table attribute name for storing article id.
    private static final String DYNAMO_TABLE_ID_NAME = "Id";
    // DynamoDB table attribute name for storing the bucket object key name that contains the article's content.

    public String putObjectToDb(String status, String name) {
        String output;
        try {
            AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
                    new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "x"))
                    .build();
            Map<String, AttributeValue> attributes = new HashMap<String, AttributeValue>();
            attributes.put(DYNAMO_TABLE_ID_NAME, new AttributeValue().withS(UUID.randomUUID().toString()));
            attributes.put("Status", new AttributeValue().withS(status));
            attributes.put("Name", new AttributeValue().withS(name));
            client.putItem(new PutItemRequest()
                    .withTableName(DYNAMO_TABLE_NAME)
                    .withItem(attributes));
            output=("Successfully inserted");

        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            output=("status: 500"+"\n"+sw.toString());
        }
        return output;
    }



}
