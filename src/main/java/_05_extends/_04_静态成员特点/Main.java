package _05_extends._04_静态成员特点;

/**
 * ClassName:
 * Package: _05_extends._04_静态成员特点
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/18 21:03
 * @Version 1.0
 *
 * 静态成员特点
 *      子类可以继承父类的静态成员
 */
public class Main  {
    public static void main(String[] args){
        System.out.println(SuperClass.num);
        SuperClass.method();

        System.out.println("================");

        System.out.println(SubClass.num);
        SubClass.method();
    }
}
