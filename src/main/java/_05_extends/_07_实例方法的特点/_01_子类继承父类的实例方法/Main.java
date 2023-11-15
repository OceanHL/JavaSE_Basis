package _05_extends._07_实例方法的特点._01_子类继承父类的实例方法;

/**
 * ClassName:
 * Package: _05_extends._07_实例方法的特点._01_子类继承父类的实例方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:50
 * @Version 1.0
 *
 *  继承关系中实例方法的特点
 *      子类可以继承父类的实例方法
 */
public class Main {
    public static void main(String[] args) {
        // 创建SubClass对象
        final SubClass sc = new SubClass();
        sc.method();
    }
}
