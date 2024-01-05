package _08_枚举类._05_练习;

/**
 * ClassName:
 * Package: _08_枚举类._05_练习
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/4 22:35
 * @Version 1.0
 */
public class _01_单例模式_枚举 {
    public static void main(String[] args) {
        System.out.println(Bank2.BOC); // BOC 默认返回【静态常量枚举对象名】

        System.out.println(GirlFriend.XIAO_HONG); // GirlFriend{name='小红', age=18}
        System.out.println(GirlFriend.XIAO_HONG.getName()); // 小红
        System.out.println(GirlFriend.XIAO_HONG.getAge()); // 18
    }
}

// 饿汉式
class Bank {
    private Bank() {
    }
    private static Bank instance = new Bank();
    public static Bank getInstance() {
        return instance;
    }
}

// JDK5.0之前使用枚举类定义单例模式
class Bank1 {
    private Bank1() {
    }
    public static final Bank1 INSTANCE = new Bank1();
}

enum Bank2 {
    BOC;
}

enum GirlFriend {
    XIAO_HONG("小红", 18),
    XIAO_HEI("小黑", 19);

    private final String name;
    private final int age;
    GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}