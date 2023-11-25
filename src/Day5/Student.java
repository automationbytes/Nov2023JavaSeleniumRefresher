package Day5;

public class Student {

    String name = "Mahi";
    int mobilenum = 12345789;

    String name1 = "vig";
    int mobilenum1 = 499;
    public void toStudy(){
        System.out.println("Study method of Student "+name);
    }

    public void toStudy1(){
        System.out.println("Study method of Student "+name1);
    }

    public void toWrite(){
        System.out.println("Write method of Student "+name);
    }

    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);
        s.toStudy();
    }
}
