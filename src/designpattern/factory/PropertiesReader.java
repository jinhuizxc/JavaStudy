package designpattern.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * PropertiesReader 读写操作类
 */
public class PropertiesReader {

    public Map<String, String> getProperties() {

        Map<String, String> map = new HashMap<>();
        Properties properties = new Properties();

        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
//            System.out.println("in = " + in);
            properties.load(in);
            Enumeration en = properties.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String property = properties.getProperty(key);
                map.put(key, property);
//                System.out.println(key + " " + property);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
