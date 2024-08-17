package org.example.ObserverPattern.weatherDataExample;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
