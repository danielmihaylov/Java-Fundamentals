package JavaOOPAdvanced.InterfacesAndAbstractions.ferrari.ferrari;

public class Ferrari implements Car {
    private String model;
    private String driver;
    private String brakes;
    private String pushThaGasPedal;

    public Ferrari(String model, String driver, String brakes, String pushThaGasPedal) {
        this.setModel(model);
        this.setDriver(driver);
        this.setBrakes(brakes);
        this.setPushThaGasPedal(pushThaGasPedal);
    }

    public String getModel() {
        return model;
    }

    public String getDriver() {
        return driver;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getPushThaGasPedal() {
        return pushThaGasPedal;
    }

    private void setModel(String model) {
        this.model = "488-Spider";
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }

    private void setBrakes(String brakes) {
        this.brakes = "Brakes!";
    }

    private void setPushThaGasPedal(String pushThaGasPedal) {
        this.pushThaGasPedal = "Zadu6avam sA!";
    }

    @Override
    public String brakes() {
        return this.brakes;
    }

    @Override
    public String pushTheGasPedal() {
        return this.pushThaGasPedal;
    }

    @Override
    public void isCreated() {

    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.getModel(),this.getBrakes(),this.getPushThaGasPedal(),this.getDriver());
    }
}
