package JavaOOPBasic.Inheritance.manKind.manKind;

public class Student extends Human{

    private static final int FACULTY_NUMBER_MIN = 5;
    private static final int FACULTY_NUMBER_MAX = 10;
    private static final int LAST_NAME_LENGTH = 3;

    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    protected void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < FACULTY_NUMBER_MIN || facultyNumber.length() > FACULTY_NUMBER_MAX) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        char[] chars = facultyNumber.toCharArray();
        for (char aChar : chars) {
            if (!Character.isLetterOrDigit(aChar)) {
                throw new IllegalArgumentException("Invalid faculty number!");
            }
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < LAST_NAME_LENGTH) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Faculty number: %s%n", this.facultyNumber));
        return sb.toString();
    }
}
