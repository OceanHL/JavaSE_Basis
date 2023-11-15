package _05_extends._03_私有成员特点;

/**
 * ClassName:
 * Package: _05_extends._03_私有成员特点
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 22:54
 * @Version 1.0
 *
 * 继承关系中私有成员的特点
 *      子类继承父类的私有成员，但受限于private关键字的特点无法直接使用，需要使用set()和get()访问
 *
 * 官方解释：
 *      1. 子类可以继承父类所有的成员（字段/方法/内部类）
 *      2. 子类仅可以继承同包下父类的私有成员，不是同包下的父类私有成员不能继承
 *      3. 子类不可以继承父类的私有成员
 *
 * 自己总结：
 *      子类继承父类的私有成员，但受限于private关键字的特点无法直接使用，需要使用set()和get()访问
 */
public class Main {
    public static void main(String[] args) {

    }
}
