package _08_枚举类._03_枚举类的每个实例对象对同一方法的不同行为;

/**
 * ClassName:
 * Package: _08_枚举类._03_枚举对象对同一方法的不同行为
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/4 22:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Season[] values = Season.values();
        // 枚举类的每个实例对象调用同一个方法，得到的结果不同
        for (Season season: values) {
            season.show();
        }
    }
}

interface Info {
    void show();
}

enum Season implements Info {
    // 1. 必须在枚举类的开头声明多个对象，对象之间使用 , 逗号隔开，结尾用 ; 分号
    // 默认为 public static final 修饰的实例对象
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

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
}
