package _05_extends._14_抽象._01_抽象概念;

/**
 * ClassName:
 * Package: _05_extends._14_抽象._01_抽象概念
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/6 22:18
 * @Version 1.0
 *
 * 抽象：
 *      含义：抽象其实就是为了解决继承关系中的安全隐患
 *      分类：
 *          抽象类
 *          抽象方法
 *
 * 继承关系中的安全隐患：
 *      1. 在继承关系中，父类是多个子类抽取出来的共同属性和行为，希望该类在外界不可以被创建成对象，实际上可以被创建对象
 *      2. 在继承关系中，子类重写父类的方法，最终执行的是子类重写后的方法，不会执行父类被重写方法中的内容，希望声明父类被重写方法的时候，无需编写方法体，实际上如果不写方法体，编译报错。
 *      3. 在继承关系中，子类重写父类的方法，程序员可能忘记某个子类重写父类的方法，希望忘记重写时，编译报错，实际上不会报错。
 */
public class Main {
    public static void main(String[] args) {
        // 创建Cat对象
        final Cat tom = new Cat("Tom", 2);
        tom.catchMouse();
        tom.eat();
        tom.sleep();

        System.out.println("===========");

        // 创建Dog对象
        final Dog jerry = new Dog("Jerry", 3);
        jerry.lookHome();
        jerry.eat();
        jerry.sleep();

        System.out.println("===========");

        final Animal animal = new Animal("Animal", 1);
    }
}
