package _04_AIP应用程序接口._04_Math;

/**
 * ClassName:
 * Package: _04_AIP应用程序接口._04_Math
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 23:12
 * @Version 1.0
 *
 * Math类
 *      特点
 *          针对数学运算进行操作的工具类
 *      位置
 *          java.long
 *      构造器
 *          私有构造器
 *      方法
 *          public static double random()
 *              返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
 */
public class Main {
    public static void main(String[] args) {
        // [a,b] -> (b - a + 1) * Math.random() + a
        final double random = Math.random();
        System.out.println(random);
    }
}
