package Day5;

public class Student_DefaultConstructr {

    String name; //null
    int mobilenum; //0

    public void toStudy(){
        System.out.println("Study method of Student "+name);
    }

    public void toWrite(){
        System.out.println("Write method of Student "+name);
    }

    public static void main(String[] args) {
        Student_DefaultConstructr s = new Student_DefaultConstructr();
        System.out.println(s.name);
        System.out.println(s.mobilenum);
        s.toStudy();
    }
}
