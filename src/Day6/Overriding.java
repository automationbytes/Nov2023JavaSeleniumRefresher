package Day6;

class ParentMarriageProposal{
    void person(){
        System.out.println("ABC");
    }

    void property(){
        System.out.println("Gold and house");
    }
}

class ChildMarriageProposal extends ParentMarriageProposal{
    void person(){
        System.out.println("XYZ");
    }
}

public class Overriding {
    public static void main(String[] args) {
        ChildMarriageProposal c = new ChildMarriageProposal();
        c.person();
    }

}
