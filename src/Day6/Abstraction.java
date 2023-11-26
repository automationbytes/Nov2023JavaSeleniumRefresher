package Day6;


abstract class Parent_MarriageProposal{

    //abstract methd
    abstract void person();
    abstract void mrrgdate();

    //non abstract methd
    void property(){
        System.out.println("Gold and house");
    }
}

class Child_MarriageProposal extends Parent_MarriageProposal{

    @Override
    void person() {
        System.out.println("Abstract methd implementation in child class");
    }

    @Override
    void mrrgdate() {
        System.out.println("Abstract methd implementation in child class");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Child_MarriageProposal c = new Child_MarriageProposal();
        c.mrrgdate();
        c.person();
        c.property();
    }

}
