package cn.lastwhisper.javabasic.InnerClass.Static;

/**
 * 成员内部类实例
 * @author lastwhisper
 */
public class OuterClass {
    private static String name="静态内部类";

    // 静态内部类，类比类的静态变量
    static class InnerClass {
        public void print() {
            System.out.println(name+"~类比类的的静态变量");
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass sample = new OuterClass.InnerClass();
        sample.print();
    }
}
