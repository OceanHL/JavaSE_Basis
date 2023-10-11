package _01_面向对象._13_类中的私有方法;

/**
 * ClassName: Main
 * Package: _01_面向对象._13_类中的私有方法
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 21:37
 * @Version 1.0
 *
 * 类中的私有方法
 *      含义:
 *          private 修饰的方法
 *      特点:
 *          private修饰的方法只能在本类中进行调用使用，不能在本类之外进行调用,如果调用编译报
 *      格式:
 *          private 修饰符 返回美型 方法名 ()
 */
public class Main {
    public static void main(String[] args) {
        // 创建 ClassPrivateMethod 对象
        ClassPrivateMethod cpm = new ClassPrivateMethod();

        cpm.method01();
        System.out.println("===========");
        cpm.method02();
    }
}
