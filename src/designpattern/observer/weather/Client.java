package designpattern.observer.weather;

public class Client {

    public static void main(String[] args) {


        // 1.创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        // 2.创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("小明的女朋友");
        observerGirl.setRemindThing("约定去散步");
        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("小明的老妈");
        observerMum.setRemindThing("去购物");

        // 3.注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);

        // 4.目标发布天气
        weather.setWeatherContent("明天天气晴朗，蓝天白云");
    }
}
