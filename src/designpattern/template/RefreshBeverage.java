package designpattern.template;

/**
 * 抽象基类，为所有子类提供一个算法框架
 *
 * 提神饮料
 */
public abstract class RefreshBeverage {

    /**
     *
     * 定义final, 防止子类更改方法
     *
     * 制备饮料的模板方法
     * 封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate(){
        // 1.将水煮沸
        boilWater();
        // 2.泡制饮料
        brew();
        // 3.将饮料导倒入杯中
        pourInCup();
        if (isCustomWantCondiments()){
            // 加入调味料
            addCondiments();
        }
    }

    /**
     * Hook, 钩子函数, 提供一个默认或空的实现
     * 具体的子类可以自行决定是否挂钩以及如何挂钩
     * 询问用户是否加入调料
     * @return
     */
    protected boolean isCustomWantCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    // 抽象方法，泡制饮料
    public abstract void brew();

    private void boilWater() {
        System.out.println("将水煮沸");
    }
}
