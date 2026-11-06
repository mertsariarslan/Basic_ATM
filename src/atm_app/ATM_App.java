/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm_app;
import java.util.Scanner;

public class ATM_App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("----- Welcome The Merdo&Sehe Bank A.S.-----\n1-) Deposit \n2-) Withdraw Money \n3-) Balance Inquiry \n4-)Exit  \nPlease Enter The You Wish to Perform: ");
        int want=input.nextInt();
        double bakiye = 1000;
        double miktar;
        while(want==1 || want==2 || want==3){
            switch(want){
                case 1:
                    System.out.print("Enter the Amount : ");
                    miktar = input.nextDouble();
                    bakiye+=miktar;
                    System.out.print("Balance = "+bakiye+"TL \n------------------------\n");
                    break;
                case 2:
                    System.out.print("Enter the Amount : ");
                    miktar = input.nextDouble();
                    bakiye-=miktar;
                    System.out.print("Balance = "+bakiye+"TL \n------------------------\n");
                    break;
                case 3:
                    System.out.print("Balance = "+bakiye+"TL \n------------------------\n");
                    break;
            }
            System.out.print("----- Welcome The Merdo&Sehe Bank A.S.-----\n1-) Deposit \n2-) Withdraw Money \n3-) Balance Inquiry \n4-)Exit  \nPlease Enter The You Wish to Perform: ");
            want=input.nextInt();
        }
        if(want!=1 && want!=2 && want!=3 && want!=4){
            System.out.print("Please Enter the Valid Number!!!");
        }else if(want==4){
            System.out.print("You Chose The Exit. Have a Good Day.");
        }
    }
    
}
