package Day5;

public class NonStaticVariable {
    int count = 0;

    public NonStaticVariable(){
        System.out.println("Constructer is called");
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        NonStaticVariable s1 = new NonStaticVariable();//0-1
        NonStaticVariable s2 = new NonStaticVariable();//0-1
        NonStaticVariable s3 = new NonStaticVariable();//0-1

    }
}
