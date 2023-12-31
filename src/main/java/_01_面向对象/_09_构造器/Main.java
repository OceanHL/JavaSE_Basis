package _01_面向对象._09_构造器;

/**
 * ClassName: Main
 * Package: _01_面向对象._09_构造器
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 20:25
 * @Version 1.0
 *
 * 构造器(构造方法)
 *      含有：
 *          1. 关键字 new 会通过构造器对对象进行堆内存区域的开辟
 *          2. 针对对象的成员进行实例初始化
 *          3. 如果是有参的构造器可以针对对象的属性进行赋值操作
 *      格式：
 *          修饰符 构造器名() {}
 *      特点：
 *          1. 构造器的名字必须与类名相同
 *          2. 构造器没有返回值，不能用void修饰
 *          3. 构造器的格式和方法类似，也叫做构造方法
 *          4. 构造器中的内容共有三个部分
 *              1）第一部分：隐式/显示的super(实参), 显示的this(实参)
 *              2) 第二部分：隐式加载实例成员和构造器代码块
 *              3）第三部分：构造器中除this(实参)或super(实参)的显示代码
 *          5. 当一个类没有构造器时，JVM的编译器在编译时自动补全一个public的无参构造器，供其创建对象时初始化成员；
 *              当一个类有任何的构造器时，JVM的编译器不会自动补全无参构造器，需要手动补全；
 *          6. 构造器支持方法的重载
 *
 *       注意：
 *          set() 和 有参构造器的区别：
 *             1. set() 只有赋值操作，有参构造器除了赋值操作外，还有初始化对象成员的作用
 *             2. set() 可以反复调用多次，构造器只能在创建对象时使用唯一的一次
 */
public class Main {
    public static void main(String[] args) {
        final Student s = new Student();
    }
}
