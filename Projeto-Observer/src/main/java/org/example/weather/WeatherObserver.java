package org.example.weather;

public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
