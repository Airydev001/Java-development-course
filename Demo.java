class Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}
class Computer{
    public void playMusic(){
        System.out.println("Music Playing");
    }
    public String getMeApen(int cost){
        if(cost >= 10)
               return "Pen";
        else
            return "Nothing";
    }
}

public class Demo{
    public static void main(String[] args){
    //     int x = 20;
    //   if(x > 10)
    //   System.out.println("This is the right answer");
    // int x = 8;
    // int y = 5;
    // int z = 9;

    // if(x > y && x > z)
    // System.out.println(x);
    // else if  (y> z)
    // System.out.println(y);
    // else 
    // System.out.println(z);
//     int n =4;
//     int result = 0;
//     // if(n % 2 ==0)
//     // result = 10;
//     // else 
//     // result = 20;
//     result = n%2==0 ? 10 : 20;
// System.out.println(result);
Computer obj = new Computer();
obj.playMusic();
 String penOutput = obj.getMeApen(20);
 System.out.println(penOutput);



    }
}