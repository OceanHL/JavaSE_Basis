package _05_extends._02_继承的注意事项;

/**
 * ClassName:
 * Package: _05_extends._02_继承的注意事项
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 22:43
 * @Version 1.0
 *
 * 继承的注意事项：
 *      1. 类只支持单继承，不支持多继承
 *      2. 类不支持多继承，但支持多层继承
 *      3. 子类和父类是一个相对的概念，有直接和间接之分
 *              举例：C类继承B类，B类继承A类
 *              C类是B类的【直接子类】，C类是A类的【间接子类】,B类是A类的【直接子类】
 *              A类是B类的【直接父类】，A类是C类的【间接父类】,B类是C类的【直接父类】
 *      4. 一个子类只允许有一个直接父类，一个父类允许有多个直接子类
 *      5. Java中所有的类都直接或间接继承Object类（Object类是所有类的父类）
 */
public class Main {
    public static void main(String[] args) {

    }
}
