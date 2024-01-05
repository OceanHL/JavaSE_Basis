package _07_内部类._01_内部类的分类;

/**
 * ClassName:
 * Package: _07_内部类._01_内部类的分类
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/3 21:25
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        dog.eat();

        Person p1 = new Person();
        Person.Bird bird = p1.new Bird(); // 正确调用
        bird.eat();
        // 错误调用
        // Person.Bird bird = new p1.Bird();

        bird.show("黄鹂");

        bird.show1();
    }

}


class Person { // 外部类
    private String name = "Tome";
    private int age = 18;


    // 静态内部类
    static class Dog {
        public void eat() {
            System.out.println("Dog is eating...");
        }
    }

    // 非静态内部类
    class Bird {
        String name = "啄木鸟";
        public void eat() {
            System.out.println("Bird is eating...");
        }

        public void show(String name) {
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("this.name = " + this.name);
            System.out.println("Person.this.name = " + Person.this.name);
        }

        public void show1() {
            eat();
            this.eat();
            Person.this.eat(); // 调用外部类的eat
        }
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void method() {
        // 局部内部类
        class InnerClass1 {}
    }

    public Person () {
        // 局部内部类
        class InnerClass2 {}
    }

    {
        // 局部内部类
        class InnerClass2 {}
    }


}
