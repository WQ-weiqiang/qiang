package qiang.base.neo4j;

import org.neo4j.driver.v1.*;

/**
 * @author Qiang.wei
 * @date 2020/1/3 16:19
 * @Description
 */

//public class HelloWorldExample implements AutoCloseable {
//    private final Driver driver;
//
//    public HelloWorldExample(String uri, String user, String password) {
//        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
//    }
//
//    public static void main(String... args) throws Exception {
//        try (HelloWorldExample greeter = new HelloWorldExample("bolt://172.22.34.38:7687", "neo4j", "12345678")) {
//            greeter.printGreeting("hello, world");
//        }
//    }
//
//    @Override
//    public void close() throws Exception {
//        driver.close();
//    }
//
//    public void printGreeting(final String message) {
//        try (Session session = driver.session()) {
//            String greeting = session.writeTransaction(new TransactionWork<String>() {
//                @Override
//                public String execute(Transaction tx) {
//                    StatementResult result = tx.run("CREATE (a:Greeting) " +
//                                    "SET a.message = $message " +
//                                    "RETURN a.message + ', from node ' + id(a)",
//                            Vaulues.parameters("message", message));
//                    return result.single().get(0).asString();
//                }
//            });
//            System.out.println(greeting);
//        }
//    }
//}
public class HelloWorldExample {
    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://172.22.34.38:7687", AuthTokens.basic("neo4j", "12345678"));
        StatementResult result = null;

        try (Session session = driver.session()) {
//        session.run("CREATE (a:Person {name: {name}, title: {title}})",
//                Values.parameters("name", "Arthur001", "title", "King001"));

//            StatementResult result = session.run("MATCH (a:Person) WHERE a.name = {name} " +
//                            "RETURN a.name AS name, a.title AS title",
//                    Values.parameters("name", "Arthur001"));

            String[] lables = {"Disease"};

            String query = "MATCH (a:" + lables[0] + ")  RETURN a";
            result = session.run(query);
//            String query = "MATCH n=(:" + lables[0] + "{name:$name}) -[]-> () RETURN n ";
//            result = session.run(query, Values.parameters("name", "百日咳"));
        }

//        try (Session session = driver.session()) {
//            try (Transaction tx = session.beginTransaction()) {
//                tx.run("CREATE (person: Person {name: {name}, age: {age}})",
//                        parameters("name", person.getName(), "age", person.getAge()));
//                tx.success(); //提交事务
//            }
//        }

//        while (result.hasNext()) {
//
//            Record record = result.next();
//            Node node = record.get("a").asNode();
//            System.out.println(record.toString());
//            System.out.println(node.toString());
//
//        }

        for (Record record : result.list()) {
            System.out.println(record.get("a").asNode().asMap().toString());
//            record.get(0).asPath().nodes().forEach(node -> System.out.println(node.toString()));


        }
        driver.close();
    }

}