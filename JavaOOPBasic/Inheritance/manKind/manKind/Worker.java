package JavaOOPBasic.Inheritance.manKind.manKind;

public class Worker extends Human{
    private static final int LAST_NAME_LENGTH = 4;
    private static final double WEEK_SALARY_MIN = 10;
    private static final double WORK_HOURS_PER_DAY_MIN = 1;
    private static final double WORK_HOURS_PER_DAY_MAX = 12;
    private static final double DAYS_OF_WEEK = 7;
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length() < LAST_NAME_LENGTH) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    protected void setWeekSalary(double weekSalary) {
        if (weekSalary <= WEEK_SALARY_MIN) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    protected void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay <= WORK_HOURS_PER_DAY_MIN || workHoursPerDay > WORK_HOURS_PER_DAY_MAX) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    public double calculateMoneyPerHour() {
        return this.weekSalary / (this.workHoursPerDay * DAYS_OF_WEEK);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(String.format("Week Salary: %.2f%n", this.weekSalary));
        sb.append(String.format("Hours per day: %.2f%n", this.workHoursPerDay));
        sb.append(String.format("Salary per hour: %.2f%n", this.calculateMoneyPerHour()));

        return sb.toString();
    }
}
