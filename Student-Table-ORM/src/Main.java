import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
        ) {

            System.out.println("Connected to database");
            statement.execute("DROP TABLE IF EXISTS students");

            statement.execute("CREATE TABLE student (id INTEGER PRIMARY KEY, name TEXT, course TEXT, tuition DECIMAL)");

            System.out.println("Students' table created");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}