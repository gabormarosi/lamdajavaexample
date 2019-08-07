docker run -p 8000:8000 amazon/dynamodb-local

npm install dynamodb-admin -g
AWS_REGION=x dynamodb-admin


aws dynamodb create-table --cli-input-json file://customer_table.json --endpoint-url http://localhost:8000 --region x
aws dynamodb list-tables --endpoint-url http://localhost:8000 --region x
