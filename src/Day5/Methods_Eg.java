package Day5;

public class Methods_Eg {

    public static int sum(int a, int b){
        return a+b;
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public int sub(int a, int b){
        return a-b;
    }


    public static void main(String[] args) {



        System.out.println(sum(10,5));

        int ave = sum(10,5) / 2;
        System.out.println(ave);

      //  int avg = add(10,5);
      Methods_Eg obj1 = new Methods_Eg();
        obj1.sub(10,5);

  }
}
