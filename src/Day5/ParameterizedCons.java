package Day5;

public class ParameterizedCons {
    String name; //object attributes
    int mob;//

    public ParameterizedCons(String name, int mob) {
        this.name = name;
        this.mob = mob;
    }

    public ParameterizedCons() {

    }

    public void toStudy(){
        System.out.println("Study method of Student "+name);
    }

    public void toWrite(){
        System.out.println("Write method of Student "+name);
    }

    public static void main(String[] args) {
        ParameterizedCons student1 = new ParameterizedCons("Neelam",123);
        ParameterizedCons student2 = new ParameterizedCons("Ravali",456);
        ParameterizedCons student3 = new ParameterizedCons("Dhruti",789);

        student1.toStudy();
        student2.toStudy();
        student3.toStudy();

        ParameterizedCons student0 = new ParameterizedCons();
        student0.toStudy();

    }
}
