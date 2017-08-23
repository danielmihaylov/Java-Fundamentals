package JavaOOPAdvanced.InterfacesAndAbstractions.telephony.telephony;

public class Smartphone implements Calling,Browsing {
    private String model;

    public Smartphone(String model) {
        this.setModel(model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void call(String[] call) {
        for (String number : call) {
            boolean isNumber = number.matches("\\d*");
            if (!isNumber){
                System.out.println("Invalid number!");
                continue;
            }
            System.out.printf("Calling... %s%n",number);
        }
    }

    @Override
    public void browse(String[] browse) {
        for (String url : browse) {
            boolean isValidURL = url.matches("\\D*");
            if (!isValidURL || url.isEmpty() || (!url.contains("http"))){
                System.out.println("Invalid URL!");
                continue;
            }
            System.out.printf("Browsing: %s!%n",url);
        }
    }
}
