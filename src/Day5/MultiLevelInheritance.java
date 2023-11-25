package Day5;

//Parent Class /Super Class / Inherited Class
class aAnimal{
    void eat(){
        System.out.println("Animal's Eat Method");
    }

    void sleep(){
        System.out.println("Animal's Sleep Method");
    }
}

//child //sub class/ Inherting
class aCat extends aAnimal{

    void sound(){
        System.out.println("Cat's Sound method");
    }

}

class petCat extends aCat{
    void petAnimal(){
        System.out.println("Pet's Cat Method");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        petCat c = new petCat();
        c.petAnimal();
        c.sound();
        c.eat(); // parent
        c.sleep(); // parent
    }
}
