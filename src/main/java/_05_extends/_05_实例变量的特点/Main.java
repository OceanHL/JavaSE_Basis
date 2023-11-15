package _05_extends._05_实例变量的特点;

/**
 * ClassName:
 * Package: _05_extends._05_实例变量的特点
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:25
 * @Version 1.0
 *
 * 实例变量的特点
 *      子类可以继承父类的实例变量
 */
public class Main {
    public static void main(String[] args) {
        // 创建SubClass对象
        final SubClass sc = new SubClass();
        System.out.println(sc.num);
    }
}
