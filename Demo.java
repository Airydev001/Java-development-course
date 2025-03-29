class Calculator{
    public int add(int n1, int n2, int n3 ){
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public  double add(int n1, double n2){
        return n1 + n2;
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
// Computer obj = new Computer();
// obj.playMusic();
//  String penOutput = obj.getMeApen(20);
//  System.out.println(penOutput);

// int nums[][] = new int[3][4];

// for (int i =0; i<3; i++){
//     for(int j=0; j<4; j++){
//         nums[i][j] = (int)((Math.random() * 100)); // casting
//         System.out.print(nums[i] [j] +" ");
//     }
//     System.out.println();
// }
int[][] numbers = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    for (int j = 0; j < numbers[i].length; j++) {
        sum += numbers[i][j];
    }
}

System.out.println("Sum = " + sum);

    }
}