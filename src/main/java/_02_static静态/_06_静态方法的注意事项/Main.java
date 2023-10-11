package _02_static静态._06_静态方法的注意事项;

/**
 * ClassName:
 * Package: _02_static静态._06_静态方法的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/11 21:02
 * @Version 1.0
 *
 *
 * 静态方法的注意事项：
 *      1. 静态方法随着类的加载而加载，而且只加载唯一的一次
 *             静态方法的加载：进静态区，只有唯一的一次
 *             静态方法的调用：进栈内存，可以调用多次
 *      2. 静态方法可以通过类名调用，也可以通过对象名调用，但更推荐类名调用，更省堆空间
 *      3. 静态方法中不可以访问非静态成员
 *      4. 静态方法中无法使用this关键字和super关键字
 *      4. 静态方法/非静态方法中都可以访问静态成员，包括静态方法，静态变量，静态代码块
 *      5. 静态方法中不能直接调用非静态成员，必须先创建对象，然后通过对象名调用非静态成员
 */
public class Main {
    public static void main(String[] args) {
      // 静态方法中无法使用this关键字和super关键
//        System.out.println(this);
    }
}
