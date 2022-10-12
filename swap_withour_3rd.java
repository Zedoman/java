package mypro;
import java.util.*;
public class swap_withour_3rd {
    
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 nums:");
        a= sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping:"+a+" "+b);
    }
}
    

