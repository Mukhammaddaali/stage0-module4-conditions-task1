package school.mjc.stage0.conditions.task1;

import java.util.Scanner;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        if(numberToBeDetermined>0) System.out.println("true");else System.out.println("false");
    }
    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        isPositive(a);
    }
}
