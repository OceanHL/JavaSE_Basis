package _01_面向对象._06_this的$第1种使用;

/**
 * ClassName: Var
 * Package: _01_面向对象._06_this的使用$第1种
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 19:45
 * @Version 1.0
 */
public class Var {
    int num = 10;

    public void method() {
        int num = 20;
        System.out.println("this = " + this);
        System.out.println("num = " + num);
        System.out.println("this.num = " + this.num);
    }
}
