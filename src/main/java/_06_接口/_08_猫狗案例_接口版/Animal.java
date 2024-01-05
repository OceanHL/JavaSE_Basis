package _06_接口._08_猫狗案例_接口版;

/**
 * ClassName:
 * Package: _06_接口._08_猫狗案例_接口版
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2023/11/15 21:46
 * @Version 1.0
 */
public abstract class Animal implements AnimalInterface {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
