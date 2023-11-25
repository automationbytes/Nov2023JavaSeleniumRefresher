package Day5;


//Parent Class /Super Class / Inherited Class
class Animal{
    void eat(){
        System.out.println("Animal's Eat Method");
    }

    void sleep(){
        System.out.println("Animal's Sleep Method");
    }
}

//child //sub class/ Inherting
class Cat extends Animal{

    void sound(){
        System.out.println("Cat's Sound method");
    }

        }
public class Inheritance_Eg {
    public static void main(String[] args) {

        Cat c = new Cat();
        c.sound();
        c.eat(); // parent
        c.sleep(); // parent
    }
}
