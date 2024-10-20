public class Main {
    public static void main(String[] args) {

        // 7. Database Instance Creation
        Database db1 = Database.getInstance();
        db1.connect();

        Database db2 = Database.getInstance();
        db2.connect();

        // 8. Comparison of Instances
        System.out.println(db1 == db2); // Should print true
    }
}
