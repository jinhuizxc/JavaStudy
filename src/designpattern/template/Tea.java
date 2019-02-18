package designpattern.template;

/**
 * 具体子类， 提供了制备茶的具体实现
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    public void brew() {
        System.out.println("用80°的热水斳浸泡茶叶5分钟");
    }

    /**
     * 子类通过覆盖的形式选择挂载钩子函数
     * @return
     */
    @Override
    protected boolean isCustomWantCondiments() {
//        return super.isCustomWantCondiments();
        return false;
    }
}
