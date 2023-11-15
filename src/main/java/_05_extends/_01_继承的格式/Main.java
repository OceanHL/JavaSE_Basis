package _05_extends._01_继承的格式;

/**
 * ClassName:
 * Package: _05_extends._01_继承的格式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/10/16 22:25
 * @Version 1.0
 *
 * 继承的格式：
 *      public class 父类类名 {}
 *      public class 子类类名 extends 父类类名 {}
 */
public class Main {
    public static void main(String[] args) {
        // 创建猫对象
        final Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);
        cat.catchMouse();
        cat.eat();
        cat.sleep();

        // 创建狗对象
        final Dog dog = new Dog();
        dog.setName("TwoHa");
        dog.setAge(3);
        dog.lookHome();
        dog.eat();
        dog.sleep();
    }
}
