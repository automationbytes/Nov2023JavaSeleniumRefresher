package Day6;

class Google{

    void homePage(){
        System.out.println("Home Page of Google");
    }

    void loginPage(){
        System.out.println("Login Page of Google");
    }
}

class Youtube extends Google{
    void homePage(){
        System.out.println("Home Page of Youtube");
    }

}
public class Overriding2 {
    public static void main(String[] args) {
        Youtube youtube = new Youtube();
        youtube.homePage();
    }
}
