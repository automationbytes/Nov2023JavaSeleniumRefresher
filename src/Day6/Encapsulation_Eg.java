package Day6;

class stud{
    private String collegename = "Devlabs";

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}

public class Encapsulation_Eg {
    public static void main(String[] args) {
        stud s = new stud();
        System.out.println(s.getCollegename());
        s.setCollegename("hello devlabs");
        System.out.println(s.getCollegename());
    }
}
