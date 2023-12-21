import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PersistStudent {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static void persist(Connection connection, Student student){
        String insertStatement = String.format("INSERT INTO student (id, name, course, tuition) VALUES (%d, \'%s\', \'%s\', %.2f)",
                student.getId(), student.getName(), student.getCourse(), student.getTuition());
        System.out.println(insertStatement);

        try (Statement statement = connection.createStatement()){
            statement.executeUpdate(insertStatement);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        try(Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            Student student = new Student(100, "George Njuki", "Software Engineering", 200000);
            persist(connection, student);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
