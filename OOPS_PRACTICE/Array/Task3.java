// Scenario 3: Weather Tracking
// In a weather monitoring system, create an array to store temperature data for a specific location over a period of time. Perform operations such as finding the average temperature, identifying the hottest and coldest days, and generating a temperature graph.

public class Task3 {
    public static void main(String[] args){
        double temperature[]={
            25.5, 26.7, 24.3, 29.8, 28.4, 30.5, 27.2, 26.1, 25.0, 29.9,
            31.2, 32.3, 28.0, 27.5, 26.6, 30.0, 29.5, 30.1, 28.7, 27.8,
            26.4, 28.9, 30.2, 27.0, 25.6, 24.9, 28.1, 29.3, 30.4, 27.9
        };

        // Display the temperature data
        System.out.println("Tamperature Data:");
        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Day"+(i+1)+": "+temperature[i]+"");//°c
        }
        //finding the average temperature
        double sum=0,average=0.0;
        for (int i = 0; i < temperature.length; i++) {
            sum+=temperature[i];
        }
        average=sum/temperature.length;
        System.out.printf("FInding the Average Tamperature:%.2f",average);


        //identifying the hottest and coldest days
        double hottest=temperature[0];
        double coldest=temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (hottest<temperature[i]) {
                hottest=temperature[i];
            }
            if (coldest>temperature[i]) {
                coldest=temperature[i];
            }
        }
        System.out.println("\nHottest Temperture is: "+hottest);
        System.out.println("Coldest Temperture is: "+coldest);
        
        //generating a temperature grap
        for (int i = 0; i < temperature.length; i++) {
            int graph=(int)temperature[i];
            for (int j = 0; j < graph; j++) {
               System.out.printf("* "); 
            }
            System.out.printf("(%.2f)\n",temperature[i]);
        }

    }
}
