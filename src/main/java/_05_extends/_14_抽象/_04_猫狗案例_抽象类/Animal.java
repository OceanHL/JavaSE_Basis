package _05_extends._14_抽象._04_猫狗案例_抽象类;

/**
 * ClassName:
 * Package: _05_extends._14_抽象._04_案例
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/8 21:29
 * @Version 1.0
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }


    // 需要子类进行重写的方法（子类们共同拥有方法，但各自执行过程不一样）
    public abstract void eat();

    // 不需要子类们进行重写的方法（子类们共同拥有方法，执行过程一样）
    public void sleep() {
        System.out.println("睡觉觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

