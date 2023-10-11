package _01_面向对象._15_this的$第2种使用;

import _01_面向对象._12_对象数组.Student;

/**
 * ClassName: Main
 * Package: _01_面向对象._15_this的$第2种使用
 * Description: 测试
 * @Author Ocean_jhl
 * @Create 2023/10/10 21:56
 * @Version 1.0
 *
 * this 关键字的第2种用法
 *      场景：
 *          (子类的)构造器中
 *      格式：
 *          this(实参);
 *      作用：
 *          调用本类中其它的构造器完成对象成员的初始化操作
 */
public class Main {
    public static void main(String[] args) {
        final Student s1 = new Student();
        System.out.println(s1.print());

        System.out.println("=========================");

        final Student s2 = new Student("张三", 18);
        System.out.println(s2.print());

        System.out.println("=========================");

        final Student s3 = new Student("李四", 19);
        System.out.println(s3.print());
    }
}
