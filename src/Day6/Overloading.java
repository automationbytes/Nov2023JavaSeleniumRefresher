package Day6;

public class Overloading {

    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    String sum(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.sum(5.5f,10.5f));
        System.out.println(overloading.sum("Hello","World"));
    }
}
