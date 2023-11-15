package _05_extends._13_权限访问修饰符级别._02_基本应用;

/**
 * ClassName:
 * Package: _05_extends._13_权限访问修饰符级别._02_基本应用
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 21:42
 * @Version 1.0
 *
 * 权限访问级别基础应用小结
 *      类文件（class，interface，enum）
 *          权限访问级别：public 和 缺省，推荐使用public
 *
 *      类中的成员量
 *          权限访问级别：四种都可以，推荐使用private
 *      类中的成员方法
 *          权限访问级别：四种都可以，推荐使用public和private
 *      类中的成员内部类
 *          权限访问级别：四种都可以，推荐使用private和缺省
 *      类中的构造器
 *          权限访问级别：四种都可以，推荐使用public和private
 *      类中的构造器代码块
 *          权限访问级别：只能缺省
 *      类中的静态代码块
 *          权限访问级别：只能缺省
 *
 *      接口中的静态常量
 *          权限访问级别：只能public，无论显示还是缺省都是public
 *      接口中的抽象方法，默认方法，静态方法，内部接口
 *          权限访问级别：只能public，无论显示还是缺省都是public
 *      接口中的私有方法
 *          权限访问级别：只能private
 *
 *      枚举类中的枚举对象
 *          权限访问级别：只能是public，而且必须是隐式的public
 *      枚举类中的成员量（除枚举对象）
 *          权限访问级别：四种都可以，推荐使用private
 *      枚举类中的成员方法
 *          权限访问级别：四种都可以，推荐使用public和private
 *      枚举类中的成员内部类
 *          权限访问级别：四种都可以，推荐使用private和缺省
 *      枚举类中的构造器
 *          权限访问级别：只能private，无论显示还是隐式都是private
 *      枚举类中的构造器代码块
 *          权限访问级别：只能缺省
 *      枚举类中的静态代码块
 *          权限访问级别：只能缺省
 *
 *      局部成员：
 *          权限访问级别：只能缺省
 */
public class Main {
    public static void main(String[] args) {

    }
}
