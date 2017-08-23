package JavaOOPBasic.Encapsulation.HomeWork;

public class Player {

    private static String EXCEPTION_MESSAGE = "%s should be between 0 and 100.";
    private final static double SKILL_COUNT = 5.0;

    private String name;
    private double endurance;
    private double sprint;
    private double dribble;
    private double passing;
    private double shooting;

    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return this.name;
    }

    public double getSkill(){
        return (this.dribble + this.endurance + this.passing + this.shooting + this.sprint) / SKILL_COUNT;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(double endurance) {
        this.validateData(endurance,"Endurance");
        this.endurance = endurance;
    }

    private void setSprint(double sprint) {
        this.validateData(sprint,"Sprint");
        this.sprint = sprint;
    }

    private void setDribble(double dribble) {
        this.validateData(dribble,"Dribble");
        this.dribble = dribble;
    }

    private void setPassing(double passing) {
        this.validateData(passing,"Passing");
        this.passing = passing;
    }

    private void setShooting(double shooting){
        this.validateData(shooting,"Shooting");
        this.shooting = shooting;
    }

   private void validateData(double data,String type){
       if (data < 0 || data >100){
           throw new IllegalArgumentException(String.format(EXCEPTION_MESSAGE,type));
       }
   }
}
