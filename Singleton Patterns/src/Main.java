public class Main {
    public static void main(String[] args) {

       
        Database db1 = Database.getInstance();
        db1.connect();

        Database db2 = Database.getInstance();
        db2.connect();
        System.out.println(db1 == db2); // Should print true
    }
}
