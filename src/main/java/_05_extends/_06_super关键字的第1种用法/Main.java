package _05_extends._06_super关键字的第1种用法;

/**
 * ClassName:
 * Package: _05_extends._06_super关键字._01_第一种使用方式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:33
 * @Version 1.0
 *
 * 回顾this关键字第一种用法
 *      场景：
 *          子类的构造器中或子类的实例方法中
 *      格式：
 *          this.实例变量名;
 *          this.实例方法名(实参);
 *      作用：
 *          用来区分同一个类中同名的实例变量和局部变量
 *      含义：
 *          那个对象调用了包含this关键字的构造器或实例方法，this就指向该对象
 *
 * super关键字的第一种用法：
 *      场景：
 *          子类的构造器中或子类的实例方法中
 *      格式：
 *          super.实例变量名;
 *          super.实例方法名(实参);
 *      作用：
 *          用来区分子父类继承关键中【同名的】实例变量
 *          用来区分子父类继承关系中【重写的】实例方法
 *      含义：
 *          那个对象调用了包含super关键字的【构造器】或【实例方法】，super就指向【该对象】的【父类引用】
 *
 */
public class Main {
    public static void main(String[] args) {
        // 创建SubClass对象
        final SubClass sc = new SubClass();
        sc.method();
    }
}
