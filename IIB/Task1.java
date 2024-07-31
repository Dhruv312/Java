// 1. Temperature Converter: Create a class that converts temperatures between Celsius and Fahrenheit. Use an instance initializer block to set default conversion factors.

class Temperature {
    public double celsiusToFahrenheit;
    public double fahrenheitToCelsius;
    {
        celsiusToFahrenheit = (9.0 / 5.0);
        fahrenheitToCelsius = (5.0 / 9.0);
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsiusToFahrenheit*celsius+32;
    }
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*fahrenheitToCelsius;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        System.out.println("25 Celsius in Fahrenheit is: "+temperature.celsiusToFahrenheit(25));
        System.out.println("77 Fahrenheit in Celsius is: "+temperature.fahrenheitToCelsius(77.0));
    }
}
