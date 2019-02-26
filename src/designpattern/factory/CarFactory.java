package designpattern.factory;

import java.util.Map;

/**
 * 汽车工厂
 */
public class CarFactory {

    /**
     * 根据类型来创建对象
     *
     * "".equals 避免空指针
     * @param key
     * @return
     */
    public Car getCar(String key){
        if ("A".equals(key)){
            return new ACar();
        }else if ("B".equals(key)){
            return new BCar();
        }
        return null;
    }

    /**
     * 通过反射，根据类型来生产对象
     * @param className
     * @return
     */
    public Car getCarByClass(String className){
        try {
            Car c = (Car) Class.forName(className).newInstance();
            return c;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Car getCarByClassKey(String key){
        Map<String, String> map = new PropertiesReader().getProperties();
        try {
            Car c = (Car) Class.forName(map.get(key)).newInstance();
            return c;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
