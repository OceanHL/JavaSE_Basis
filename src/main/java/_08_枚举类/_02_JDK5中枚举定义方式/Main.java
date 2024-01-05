package _08_枚举类._02_JDK5中枚举定义方式;

import java.util.Arrays;

/**
 * ClassName:
 * Package: _08_枚举类._02_JDK5中枚举定义方式
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/4 21:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Season.SPRING); // SPRING
        System.out.println(Season.SPRING.getClass()); // class _08_枚举类._02_JDK5中枚举定义方式.Season
        System.out.println(Season.SPRING.getClass().getSuperclass()); // class java.lang.Enum
        System.out.println(Season.SPRING.getClass().getSuperclass().getSuperclass()); // class java.lang.Object

        // toString() 方法返回枚举常量名（对象名），可重写进行自定义
        System.out.println(Season.SPRING); // SPRING
        System.out.println(Season.SPRING.toString()); // SPRING


        // name() 返回当前对象名称（常量名），即枚举常量名
        System.out.println(Season.SPRING.name()); // SPRING

        // static values() 返回所有枚举常量对象数组
        System.out.println(Arrays.toString(Season.values())); // [SPRING, SUMMER, AUTUMN, WINTER]
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }

        System.out.println("------------------------------------");

        // static valueOf(String objName) 返回【指定名称】的【枚举常量对象】，找不到则抛异常 IllegalArgumentException: No enum constant
        System.out.println(Season.valueOf("WINTER")); // Season{seasonName='冬天', seasonDesc='冰天雪地'}
        // System.out.println(Season.valueOf("WINTER1")); // Season{seasonName='冬天', seasonDesc='冰天雪地'}

        // ordinal() 返回第几个声明时的索引值
        System.out.println(Season.SPRING.ordinal()); // 0
        System.out.println(Season.SUMMER.ordinal()); // 1
        System.out.println(Season.AUTUMN.ordinal()); // 2
        System.out.println(Season.WINTER.ordinal()); // 3

        // 通过枚举类的对象调用重写接口中的方法
        Season.SUMMER.show(); // 这是一个季节
    }
}

interface Info {
    void show();
}

enum Season implements Info {
    // 1. 必须在枚举类的开头声明多个对象，对象之间使用 , 逗号隔开，结尾用 ; 分号
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");

    // 2. 声明实例变量，使用 private final 修饰
    private final String seasonName; //  季节名称
    private final String seasonDesc; // 季节描述

    // 3. 私有化类的构造器，enum默认就是私有构造器
    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 4. 提供实例变量的 get 方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}