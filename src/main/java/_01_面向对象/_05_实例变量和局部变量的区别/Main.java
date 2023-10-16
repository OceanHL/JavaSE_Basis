package _01_面向对象._05_实例变量和局部变量的区别;

/**
 * ClassName: Main
 * Package: _01_面向对象._05_实例变量和局部变量的区别
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/9 22:44
 * @Version 1.0
 */

/**
 * 实例变量：声明在类中代码块外，且没有static关键字修饰的成员变量
 * 局部变量：声明在代码块内或着方法声明上（形参）的变量
 *
 * 实例变量和局部变量的区别
 *      1. 代码中的位置不同
 *            实例变量：声明在类中代码块外，且没有static关键字修饰的成员变量
 *            局部变量：声明在代码块内或着方法声明上（形参）的变量
 *      2. 作用域不同
 *            实例变量：静态成员中无法使用
 *            局部变量：所属方法中
 *      3. 在内存中的位置不同
 *            实例变量：实例变量随着对象的创建而存在，随着对象的消失而消失，存在【堆内存】中
 *            局部变量：局部变量随着方法的调用而存在，随着方法的调用完毕而消失，存在【栈内存】中
 *      4. 生命周期不同
 *            实例变量：随着对象的创建而存在，随着对象的消失而消失
 *            局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 *      5. 初始化值不同
 *            实例变量：有默认初始化值
 *            局部变量：没有默认初始化值，必须定义，赋值，然后才能使用
 *      6. 加载方式和次数不同：
 *            实例变量：随着对象的创建而加载，每创建一次对象加载一次
 *            局部变量：随着方法的调用而加载，每调用一次方法就会加载一次
 *      7. 修饰符的使用不同
 *            实例变量：权限/static/final修饰符
 *            局部变量：只能用 final 进行修饰
 */
public class Main {
}
