package _08_枚举类._01_JDK5之前枚举定义方式;

/**
 * ClassName:
 * Package: _08_枚举类._01_JDK5之前枚举定义方式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/4 21:25
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.getSeasonName()); // 春天
        System.out.println(Season.SPRING.getSeasonDesc()); // 春暖花开

        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}


/**
 * jdk5.0之前定义枚举的方式
 */
class Season {
    // 2. 声明实例变量，使用 private final 修饰
    private final String seasonName; //  季节名称
    private final String seasonDesc; // 季节描述

    // 1. 私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 3. 提供实例变量的 get 方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 4. 创建当前类的实例，使用 public static final 修饰
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}