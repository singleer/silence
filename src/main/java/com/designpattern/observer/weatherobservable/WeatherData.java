package com.designpattern.observer.weatherobservable;

import java.util.Observable;

/**
 * @author 李祥华
 * @description
 * @time 2018/12/27 15:27
 *
 * 主题
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){

    }
    public void measurementsChanged() {
        //调用notifyObservers之前将状态需要设为改变
        setChanged();
        //没有传输对象表示 观察者自己"拉"数据
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


}
