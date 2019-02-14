package designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *  使用容器实现单例
 */
public class Singleton5 {

    /**
     * 将多种类型的单例放到统一的Map将集合中,根据相应的Key获取对应的对象
     *
     * 这种方式是我们可以管理多种类型的单例,可以使用统一接口进行获取操作
     * 降低了使用成本,也隐藏了具体实现,降低了耦合度
     */
    public static Map<String, Object> objMap = new HashMap<String, Object>();

    private Singleton5() {
    }

    public static void registerInstance(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return objMap.get(key);
    }

}
