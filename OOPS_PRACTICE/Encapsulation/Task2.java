// Scenario 2: Health Tracking Application
// In a health tracking application, encapsulate the "User" class's personal health data, such as weight, heart rate, and sleep patterns, to maintain privacy and provide controlled access to the user's health information.

class User {
    private double weight;
    private int heartRate;
    private int sleepHours;

    public User(double weight, int heartRate, int sleepHours) {
        this.weight = weight;
        this.heartRate = heartRate;
        this.sleepHours = sleepHours;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public void display(){
        System.out.println("Weight: "+weight+"Kg");
        System.out.println("Hert Rate: "+heartRate+"bpm");
        System.out.println("Sleep Hours: "+sleepHours+"hours");
    }
}
public class Task2 {
    public static void main(String[] args) {
        User user = new User(50.0, 70, 6);

        System.out.println("Weight: "+user.getWeight()+"Kg");
        System.out.println("Hert Rate: "+user.getHeartRate()+"bpm");
        System.out.println("Sleep Hours: "+user.getSleepHours()+"hours");

        user.setHeartRate(72);
        user.setWeight(70.0);
        user.setSleepHours(8);
        System.out.println("Update:");
        user.display();
    }
}
