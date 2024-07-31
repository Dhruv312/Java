// 3. Simple Interest Calculation:
//    Develop a class `InterestCalculator` with overloaded methods `calculateInterest()` to determine the simple interest using principal, rate, and time provided in different formats (e.g., years, months, days).

class InterestCalculator{
    public double calculateInterest(double principal,double rate,double timeInYear){
        return (principal*rate*timeInYear)/100;
    }

    public double calculateInterest(double principal,double rate,int timeInMonth){
        double timeInYear=timeInMonth/12.0;
        return (principal*rate*timeInYear)/100; 
    }
    public double calculateInterest(double principal,float rate,int timeInDay){
        double timeInYear=timeInDay/365.0;
        return (principal*rate*timeInYear)/100; 
    }
}
public class Task4 {
    public static void main(String[] args){
        InterestCalculator i1=new  InterestCalculator();
        double principal=10000.0;
        double rate=5.0;
        System.out.println("Interest for 5 Year: "+i1.calculateInterest(principal, rate, 5.0));
        System.out.println("Interest for 6 Month: "+i1.calculateInterest(principal, rate, 6));
        System.out.println("Interest for 30 Day: "+i1.calculateInterest(principal, 5.0f, 30));
   
    }
}