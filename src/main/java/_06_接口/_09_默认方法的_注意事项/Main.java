package _06_接口._09_默认方法的_注意事项;

/**
 * ClassName:
 * Package: _06_接口._09_默认方法的_注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:56
 * @Version 1.0
 *
 * 默认方法的注意事项：
 *      1. 当子类同时继承和实现，父类中的实例方法和父接口中的默认方法同名时，子类对象调用这个方法时，继承的是父类的实例方法
 *      2. 当子类不继承父类，但实习多个父接口，多个父接口中出现了同名的默认方法，子类需要重写该默认方法
 *      3. 如果在重写的默认方法中调用某个接口被重写的默认方法，需要使用“接口名.super.默认方法名"
 */
public class Main {
    public static void main(String[] args) {
        final SubClass sc = new SubClass();
        sc.method(); // 父类实例方法
    }
}
