package _08_枚举类._05_练习;

/**
 * ClassName:
 * Package: _08_枚举类._05_练习
 * Description: 测试
 *
 * @Author Ocean_jhl
 * @Create 2024/1/5 20:14
 * @Version 1.0
 */
public class _03_定义颜色枚举类_拓展 {
    public static void main(String[] args) {
        System.out.println(Color.GREEN); // 默认打成员变量名称【name() 或 toString()】
        // GREEN(0, 255, 0)->绿色
    }
}


enum Color {
    // public static final 修饰
    RED(255, 0, 0, "红色"),
    ORANGE(255, 128, 0, "橙色"),
    YELLOW(255, 255, 0, "黄色"),
    GREEN(0, 255, 0, "绿色"),
    CYAN(0, 255, 255, "青色"),
    BLUE(0, 0, 255, "蓝色"),
    PURPLE(128, 0, 255, "紫色");

    // 1. 定义私有常量枚举对象 private final 修饰
    private final int red;
    private final int green;
    private final int blue;
    private final String description; // 描述

    // 2. 定义有参构造器，默认 private 修饰
    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    // 3. 定义 get
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    // 4. 重写 toString

    @Override
    public String toString() {
        /**
         * 使用 super.toString() 或 name() 获取【枚举实例对象名】
         */
        // return name() + "(" + red + ", " + green + ", " + blue + ")->" + description;
        return super.toString() + "(" + red + ", " + green + ", " + blue + ")->" + description;
    }
}
