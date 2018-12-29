package com.designpattern.observer.weatherobservable;

import com.designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/27 15:34
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData data = (WeatherData)obs;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


}
