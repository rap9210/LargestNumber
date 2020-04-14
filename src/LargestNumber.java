import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 numbers to be compared.\n-");
        int num_1 = scn.nextInt();
        System.out.println("-");
        int num_2 = scn.nextInt();
        System.out.println("-");
        int num_3 = scn.nextInt();

        if ((num_1 > num_2)&&(num_1 > num_3)){
            System.out.println("Greatest: "+num_1);
        }
        else if ((num_2 > num_1)&&(num_2 > num_3)){
            System.out.println("Greatest: "+num_2);
        }
        else{
            System.out.println("Greatest: "+num_3);
        }
        if ((num_1 < num_2)&&(num_1 < num_3)){
            System.out.println("Smallest: "+num_1);
        }
        else if ((num_2 < num_1)&&(num_2 < num_3)){
            System.out.println("Smallest: "+num_2);
        }
        else{
            System.out.println("Smallest: "+num_3);
        }
    }
}

