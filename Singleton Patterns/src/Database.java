public class Database {

        // 2. Singleton Implementation
        private static Database instance;

        // 3. Private Constructor
        private Database() {
            // No special initialization required
        }

        // 4. getInstance() Method
        public static synchronized Database getInstance() {
            if (instance == null) {
                instance = new Database();
            }
            return instance;
        }

        // 5. connect() Method
        public void connect() {
            System.out.println("Connecting to database...");
        }
    }

