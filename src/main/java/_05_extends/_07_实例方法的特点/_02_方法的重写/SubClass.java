package _05_extends._07_实例方法的特点._02_方法的重写;

/**
 * ClassName:
 * Package: _05_extends._07_实例方法的特点._01_子类继承父类的实例方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:51
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    @Override // 修饰符大于或等于，返回值相同，方法名相同，参数列表相同
    public C method() {
        System.out.println("子类的实例方法");
        return null;
    }
}
