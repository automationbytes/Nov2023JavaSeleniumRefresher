package Day5;

class animal{
    void sleep(){
        System.out.println("Animal Sleep method");
    }

}

class dog extends animal{
    void sound(){
        System.out.println("Dogs sound method");
    }
}

class bulldog extends dog{
    void breed(){
        System.out.println("bull dog");
    }
}

class cat extends animal{
    void catmetd(){
        System.out.println("Cat methd");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        dog d = new bulldog();
        d.sound();

    }
}
