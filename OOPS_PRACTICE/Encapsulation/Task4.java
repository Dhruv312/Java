// Scenario 4: Smart Home Automation System
// In a smart home automation system, encapsulate the internal workings of devices like "Thermostat" and "LightingController" to provide a simplified interface for controlling and monitoring these devices while hiding complex implementation details.

class Thermostat{
    private int temperature;
    private boolean isOn;

    public Thermostat(int temperature){
        this.temperature = temperature;
        this.isOn = false;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Thormostat is now On.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Thormostat is now Off.");
    }

    public void setTemperature(int temperature) {
        if(isOn){
            this.temperature = temperature;
            System.out.println("Temperature set to "+temperature+" degrees.");
        }else{
            System.out.println("Thormostat is  Off.");
        }
    }

    public int getTemperature() {
        return temperature;
    }
}

class LightingController{
    private int brightnees;
    private boolean isOn;

    public LightingController(int brightnees){
        this.brightnees = brightnees;
        this.isOn = false;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Light is now On.");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Light is now Off.");
    }

    public void setBrightnees(int brightnees) {
        if(isOn){
            this.brightnees= brightnees;
            System.out.println("Brightnees set to "+brightnees+"%.");
        }else{
            System.out.println("Light is now Off.");
        }
    }
    public int getBrightnees() {
        return brightnees;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(22);
        LightingController  lightingController = new LightingController(55);

        thermostat.turnOn();
        thermostat.setTemperature(24);
        System.out.println("Current Temperature: " + thermostat.getTemperature());

    }
    
}