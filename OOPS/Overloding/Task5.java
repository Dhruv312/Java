// 4. Temperature Conversion:
//    Implement a class `TemperatureConverter` with overloaded methods `convert()` to convert temperatures from Celsius to Fahrenheit, Fahrenheit to Celsius, and Celsius to Kelvin.

class TemperatureConverter{

    public double convert(double celsius,String toUnit){
        
        if(toUnit.equals("Fahrenheit")){
            return (9.0/5)*celsius+32;
        }else if(toUnit.equals("Kelvin")){
            return 273.15+celsius;
        }else{
            System.out.println("Invelid unit for conversion");
            return 0.0;
        }
    }

    public double convert(double fahrenheit,boolean isFahrenheit){
        if(isFahrenheit){
            return (fahrenheit-32)*(5.0/9);
        }else{
            return 0.0;
        }
    }
    
    public double convert(double celsius){
        return celsius+273.15;
    }
}
public class Task5 {
    public static void main(String[] args){
        TemperatureConverter t1=new TemperatureConverter();
        System.out.println("23 Celsius to Fahrenheit: "+t1.convert(23,"Fahrenheit"));
        System.out.println("77 Fahrenheit to Celsius"+t1.convert(77, true));
        System.out.println("25 Kelvin to Celsius"+t1.convert(25 ));

    }
}
