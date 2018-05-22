package Observer;

import Observer.Displays.AverageConditionDisplay;
import Observer.Displays.WeatherDisplay;
import Observer.Subjects.WeatherData;

public class Notify {
    public static void main(String[] args){
        WeatherData wd = new WeatherData();
        AverageConditionDisplay display = new AverageConditionDisplay(wd);

        wd.setMeasurements(60.0f, 0.33f, 0.25f);
        wd.setMeasurements(62.0f, 0.23f, 0.25f);
        wd.setMeasurements(69.0f, 0.13f, 0.25f);
    }
}
