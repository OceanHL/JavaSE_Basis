package _02_static静态._08_单例设计模式_立即加载模式;

/**
 * ClassName:
 * Package: _02_static静态._08_单例设计模式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:22
 * @Version 1.0
 *
 * 设计模式 与 框架 的区别
 *      设计模式：解决某一类问题的固定解决方案
 *      框架： 一种解决方案，提供了一整套的解决方案
 *
 * 单例设计模式
 *      含义：
 *          创建唯一对象的解决方案
 *      分类：
 *          立即加载模式（饿汉式）
 *          延迟加载模式（懒汉式）
 *
 * 立即加载模式（饿汉式）
 *      1. 类构造器进行私有化private
 *      2. 类内部声明一个私有静态属性，并初始化为一个实例对象
 *      3. 提供公共public静态static方法获取对象
 */
public class Main {
    public static void main(String[] args) {
        final CEO ceo1 = CEO.getCeo();
        final CEO ceo2 = CEO.getCeo();
        final CEO ceo3 = CEO.getCeo();

        System.out.println(ceo1);
        System.out.println(ceo2);
        System.out.println(ceo3);

    }
}
