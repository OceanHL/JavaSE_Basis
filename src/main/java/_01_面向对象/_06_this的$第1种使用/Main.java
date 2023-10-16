package _01_面向对象._06_this的$第1种使用;

/**
 * ClassName: Main
 * Package: _01_面向对象._06_this的使用$第1种
 * Description:
 *
 * @Author Oceanj_hl
 * @Create 2023/10/10 19:46
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Var var = new Var();
        var.method();

        System.out.println("================");

        Var var2 = new Var();
        var2.method();
    }
}
