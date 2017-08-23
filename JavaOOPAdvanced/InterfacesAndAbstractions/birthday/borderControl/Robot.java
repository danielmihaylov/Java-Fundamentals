package JavaOOPAdvanced.InterfacesAndAbstractions.birthday.borderControl;

public class Robot implements Person{

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.setModel(model);
        this.setId(id);
    }

    public String getModel() {
        return this.model;
    }

    public String getId() {
        return this.id;
    }

    private void setModel(String model) {
        this.model = model;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String id() {
        return this.id;
    }
}
