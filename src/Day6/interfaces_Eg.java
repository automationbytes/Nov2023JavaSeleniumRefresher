package Day6;

interface mobile{
    void sms();
    void call();

}

interface camera{
    void photo();
}

class samsung implements mobile, camera{

    @Override
    public void sms() {
        System.out.println("Samsung sms methd");
    }

    @Override
    public void call() {
        System.out.println("Samsung call methd");
    }

    @Override
    public void photo() {
        System.out.println("Samsung Photo methd");
    }
}

class apple implements mobile,camera{

    @Override
    public void sms() {
        System.out.println("Apple sms methd");
    }

    @Override
    public void call() {
        System.out.println("Apple call methd");
    }

    public void photo(){
        System.out.println("Apple photo methd");
    }
}

public class interfaces_Eg {

    public static void main(String[] args) {
        apple a = new apple();
        a.call();
        a.sms();

        samsung s = new samsung();
        s.call();
        s.sms();


    }
}
