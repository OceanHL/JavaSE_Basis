package _05_extends._12_Object类;

/**
 * ClassName:
 * Package: _05_extends._12_Object类
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 20:03
 * @Version 1.0
 *
 * Object类
 *      类的特点
 *          1. Object类是所有类的顶级父类
 *          2. 所有对象（包括数组）都可以调用Object类中的方法
 *          3. 所有接口都继承Object类中方法的抽象形式（暂不涉及）
 *      类的位置
 *          java.lang
 *      类的构造器
 *          public Object()
 *      类的方法
 *          public boolean equals(Object obj)
 *              指示其他某个对象是否与此对象“相等”。
 *          public String toString()
 *              返回该对象的字符串表示。
 *
 *  toString()的注意事项：
 *      - 使用输出语句打印对象名或数组名时，其实就是打印该对象调用toString()的返回值,char类型数组除外
 *
 *  == 和 equals()的区别:
 *      1. 比较的数据类型不同：
 *          == 可以比较【基本数据类型】和【引用数据类型】
 *          equals()只能比较【引用数据类型】
 *      2， 比较内容的方式不同
 *          == 基本数据类型比较【数据值】，引用类型比较【地址值】
 *          equals()比较引用类型的地址值是否相等，
 */
public class Main {
    public static void main(String[] args) {
        // 创建String对象
        Student s = new Student();
        System.out.println(s); // 底层调用了String.valueOf(),而String.valueOf()底层又调用了toString()
        System.out.println(String.valueOf(s)); // 底层调用了toString()
        System.out.println(s.toString());

        System.out.println("--------------------------------------");

        int[] ints = {11, 22, 33};
        System.out.println(ints);
        System.out.println(String.valueOf(ints));
        System.out.println(ints.toString());

        System.out.println("======================================");

        char[] chars = {'a', 'b', 'c'};
        System.out.println(chars); // abc
        System.out.println(String.valueOf(chars)); // abc
        System.out.println(chars.toString()); // [C@41629346

        System.out.println("======================================");

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2)); // equals底层用的是==

    }
}
