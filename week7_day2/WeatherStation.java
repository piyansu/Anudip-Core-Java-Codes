package week7_day2;

import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void registerObserver(Observer observer);   // Method to register an observer
    void removeObserver(Observer observer);    // Method to remove an observer
    void notifyObservers();                     // Method to notify all observers
}

// Observer interface
interface Observer {
    void update(float temperature, float humidity, float pressure);  // Method called to update observer
}

// WeatherData class - the subject
class WeatherData implements Subject {
    private List<Observer> observers;   // List to store registered observers
    private float temperature;          // Current temperature
    private float humidity;             // Current humidity
    private float pressure;             // Current pressure

    public WeatherData() {
        this.observers = new ArrayList<>();   // Initialize the list of observers
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);   // Add an observer to the list
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);   // Remove an observer from the list
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);   // Notify all observers
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();   // Call this method when weather data changes
    }

    private void measurementsChanged() {
        notifyObservers();   // Notify observers when weather data changes
    }
}

// CurrentConditionsDisplay class - observer displaying current conditions
class CurrentConditionsDisplay implements Observer {
    private float temperature;   // Current temperature
    private float humidity;      // Current humidity

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();   // Update and display current conditions
    }

    public void display() {
        System.out.println("Current Conditions: Temperature " + temperature + "°C, Humidity " + humidity + "%");
    }
}

// StatisticsDisplay class - observer displaying statistics
class StatisticsDisplay implements Observer {
    private float temperatureSum = 0;   // Sum of temperatures
    private float humiditySum = 0;      // Sum of humidities
    private int numReadings = 0;         // Number of readings

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        humiditySum += humidity;
        numReadings++;
        display();   // Update and display statistics
    }

    public void display() {
        float averageTemperature = temperatureSum / numReadings;
        float averageHumidity = humiditySum / numReadings;
        System.out.println("Statistics: Average Temperature " + averageTemperature + "°C, Average Humidity " + averageHumidity + "%");
    }
}

// ForecastDisplay class - observer displaying a weather forecast
class ForecastDisplay implements Observer {
    private float pressure;   // Current pressure

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();   // Update and display weather forecast
    }

    public void display() {
        System.out.println("Weather Forecast: Pressure " + pressure + " hPa");
    }
}

// Main WeatherStation class
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        // Simulate changes in weather data
        weatherData.setMeasurements(25.5f, 60.2f, 1010.1f);
        weatherData.setMeasurements(28.0f, 55.8f, 1008.5f);
        weatherData.setMeasurements(23.7f, 62.5f, 1012.3f);
    }
}
