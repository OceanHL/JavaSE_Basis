package _02_static静态._09_单例模式_延迟加载模式;

/**
 * ClassName:
 * Package: _02_static静态._09_单例模式_延迟加载模式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:37
 * @Version 1.0
 *
 * 立即加载模式的弊端：
 *      部分场景中，不需要使用对象，但是可能加载该类，导致对象的创建，在一段时间内浪费内存空间
 *
 * 延迟加载模式
 *      1. 类构造器进行私有化private
 *      2.类内部声明一个私有private静态static属性，不进行初始化
 *      3. 提供公共public静态static方法获取对象，并且只有在第一次获取时才初始化静态属性
 */
public class Main {
    public static void main(String[] args) {
        final CEO ceo1 = CEO.getCEO();
        final CEO ceo2 = CEO.getCEO();
        final CEO ceo3 = CEO.getCEO();

        System.out.println(ceo1);
        System.out.println(ceo2);
        System.out.println(ceo3);
    }
}
