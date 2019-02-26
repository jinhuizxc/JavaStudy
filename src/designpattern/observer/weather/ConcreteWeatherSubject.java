package designpattern.observer.weather;

import designpattern.observer.Subject;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * (天气预报就是具体的目标对象)
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    // 目标对象的状态
    private String WeatherContent;

    public String getWeatherContent() {
        return WeatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        WeatherContent = weatherContent;
        this.notifyObservers();   // 通知所有订阅了的人
    }
}
