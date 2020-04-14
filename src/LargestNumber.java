import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int greatest = 0;
        int smallest = 0;
        System.out.println("Enter 3 numbers to be compared.\n-");
        int num_1 = scn.nextInt();
        System.out.println("-");
        int num_2 = scn.nextInt();
        System.out.println("-");
        int num_3 = scn.nextInt();

        if (num_1 > num_2){
            if (num_1 > num_3){
                greatest = num_1;
                System.out.println("Greatest: "+greatest);
            }
        }
        if (num_2 > num_3){
            greatest = num_2;
            System.out.println("Greatest: "+greatest);
        }
        else{
            greatest = num_3;
            System.out.println("Greatest: "+greatest);
        }
        if (num_1 < num_2){
            if (num_1 < num_3){
                smallest = num_1;
                System.out.println("Smallest: "+smallest);
            }
        }
        if (num_2 < num_3){
            smallest = num_2;
            System.out.println("Smallest: "+smallest);
        }
        else{
            smallest = num_3;
            System.out.println("Smallest: "+smallest);
        }
    }
}
