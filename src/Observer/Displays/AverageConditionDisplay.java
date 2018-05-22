package Observer.Displays;

import Observer.Observers.Observer;
import Observer.Subjects.Subject;

import java.util.ArrayList;

public class AverageConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    private ArrayList<Float> temperaturesReadings;
    private ArrayList<Float> humidityReadings;
    private ArrayList<Float> pressureReadings;

    private float averageTemperature;
    private float averageHumidity;
    private float averagePressure;

    public AverageConditionDisplay(Subject wd){
        this.weatherData = wd;
        wd.registerObserver(this);

        temperaturesReadings = new ArrayList<Float>();
        humidityReadings = new ArrayList<Float>();
        pressureReadings = new ArrayList<Float>();
    }

    public static float calculateAverage(ArrayList<Float> n){

        float sum = 0;

        for (Float f : n){
            sum += f;
        }

        return sum/n.size();
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperaturesReadings.add(temperature);
        humidityReadings.add(humidity);
        pressureReadings.add(pressure);

        averageTemperature = calculateAverage(temperaturesReadings);
        averageHumidity = calculateAverage(humidityReadings);
        averagePressure = calculateAverage(pressureReadings);
        display();
    }

    @Override
    public void display() {
        System.out.println("Average temperature is: " + averageTemperature);
        System.out.println("Average humidity is: " + averageHumidity);
        System.out.println("Average pressure is: " + averagePressure);
    }
}
