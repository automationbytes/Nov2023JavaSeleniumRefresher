package Day5;

public class StaticVariable {
    static int count = 0;

    public StaticVariable(){
        System.out.println("Constructer is called");
        count++;//1
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();//0-1
        StaticVariable s2 = new StaticVariable();//1-2
        StaticVariable s3 = new StaticVariable();//2-3

    }
}
