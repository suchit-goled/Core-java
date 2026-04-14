class DynamoRunner {

    public static void main(String[] args) {

        Dynamo dynamo = new Dynamo();

        dynamo.addDynamo("Small Dynamo");
        dynamo.addDynamo("Bike Dynamo");

        dynamo.searchDynamo("Bike Dynamo");
        dynamo.searchDynamo("Car Dynamo");
    }
}