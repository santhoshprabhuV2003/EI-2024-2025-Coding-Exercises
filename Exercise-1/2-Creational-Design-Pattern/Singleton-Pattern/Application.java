public class Application {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println("Connection String: " + db1.getConnectionString());

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Same instance: " + (db1 == db2));
    }
}