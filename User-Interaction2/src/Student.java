public class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void calculateGrade(int grade) {
        if (grade >= 70) {
            System.out.println("Congrats, " + name + "! You passed!");
            if (grade >= 90) {
                System.out.println("Wow! You got an A!");
            }
        } else {
            System.out.println("Oops! Better luck next time!");
        }
    }

    public static void main(String args[]) {
        // Write Student user input here
    }
}