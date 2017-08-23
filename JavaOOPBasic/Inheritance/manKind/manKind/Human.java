package JavaOOPBasic.Inheritance.manKind.manKind;

public class Human {
    private static final int FIRST_NAME_LENGTH = 4;

    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    protected void setFirstName(String firstName) {
        char[] fName = firstName.toCharArray();
        if (Character.toLowerCase(fName[0]) == fName[0]) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if (firstName.length() < FIRST_NAME_LENGTH) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }

        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        char[] lName = lastName.toCharArray();
        if (Character.toLowerCase(lName[0]) == lName[0]) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }

        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s%n", this.firstName));
        sb.append(String.format("Last Name: %s%n", this.lastName));
        return sb.toString();

    }
}
