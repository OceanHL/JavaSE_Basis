package _01_面向对象._13_类中的私有方法;

/**
 * ClassName: ClassPrivateMethod
 * Package: _01_面向对象._13_类中的私有方法
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 21:38
 * @Version 1.0
 */
public class ClassPrivateMethod {
    private void method() {
        System.out.println("你好");
        System.out.println("我好");
        System.out.println("大家好");
    }

    public void method01() {
        method();
        System.out.println("喵喵老师好");
    }

    public void method02() {
        method();
        System.out.println("莎莎老师好");
    }
}
