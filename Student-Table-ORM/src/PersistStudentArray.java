import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersistStudentArray {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static void persistArray(Connection connection, Student[] students){
        String insertStatement = "INSERT INTO student (id, name, course, tuition) VALUES (?,?,?,?)";

        try(PreparedStatement preparedStmt = connection.prepareStatement(insertStatement)){
            for (Student e : students) {
                // Assign prepared statement placeholders ? to employee object's fields
                preparedStmt.setInt(1, e.getId());   //first ?
                preparedStmt.setString(2, e.getName());  //second ?
                preparedStmt.setString(3, e.getCourse());  //third ?
                preparedStmt.setDouble(4, e.getTuition()); //fourth ?
                System.out.println(preparedStmt);

                preparedStmt.executeUpdate();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)){

            Student[] students = {
                    new Student(200, "Steve Kithunu", "Comuter Science", 1000000),
                    new Student(300, "Keren Wangchi", "Business IT",800000),
                    new Student(400, "Rose Kamana", "Supply Chain Mngt", 500000)
            };

            persistArray(connection, students);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
