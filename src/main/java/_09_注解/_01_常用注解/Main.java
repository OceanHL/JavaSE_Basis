package _09_注解._01_常用注解;

/**
 * ClassName:
 * Package: _09_注解
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/5 20:47
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Tome", 18);

        @SuppressWarnings("unused")
        int num = 10;
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    @Deprecated(since = "2024")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人在吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    @Override // 显示校验是否符合重写规则
    public void eat() {
        System.out.println("学生在吃饭");
    }
}

