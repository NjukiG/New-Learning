import java.sql.*;

public class FindStudent {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/students_db";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static Student find(Connection connection, int id) {
        String selectStatement = "SELECT * FROM student WHERE id = " + id;
        System.out.println(selectStatement);

        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(selectStatement)) {

                if (resultSet.next()) {
                    Student student = new Student(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("course"), resultSet.getDouble("tuition"));
                    return student;
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)){
            Student student;

          student = find(connection, 100);
            System.out.println(student);
          student = find(connection, 99);
            System.out.println(student);



        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
