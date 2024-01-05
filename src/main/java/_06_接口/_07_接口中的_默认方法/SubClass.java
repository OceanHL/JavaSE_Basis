package _06_接口._07_接口中的_默认方法;

/**
 * ClassName:
 * Package: _06_接口._07_接口中的_默认方法
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:38
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    public void method() {
        System.out.println("多个子类含有的公共方法，且不需要重写");
    }
}
