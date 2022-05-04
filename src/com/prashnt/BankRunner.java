package com.prashnt;

import java.util.Scanner;

public class BankRunner{

    public static void main(String[] args) {
        Bank sbiBank=new Bank();
        System.out.println("Welcome to SBI Bank");
        int option;
        do{
            System.out.println("Chose the Option");
            System.out.println("1. Create an account");
            System.out.println("2. Transfer money to account");
            System.out.println("3. Add money");
            System.out.println("4. Check Balance ");
            System.out.println("8. Exist");
            Scanner sc=new Scanner(System.in);
            option =sc.nextInt();
            int id,senderID,receiverID;
            boolean login;
            double amount;
            String password;
            switch(option){
                case 1:
                    System.out.println("Enter your new UserID");
                    id=sc.nextInt();
                    System.out.println("Enter your new password");
                    password=sc.next();
                    sbiBank.addUser(id,password);
                    break;
                case 2:
                    System.out.println("Enter your userID");
                    senderID=sc.nextInt();
                    System.out.println("Enter password");
                    password=sc.next();
                    login=sbiBank.VerifyCredentials(senderID,password);
                    if(login){
                        System.out.println("Enter receiver id : ");
                        receiverID=sc.nextInt();
                        System.out.println("Enter the amount to transfer : ");
                        amount=sc.nextDouble();
                        sbiBank.sendMoney(senderID,password,receiverID,amount);
                    }else{
                        System.out.println("Bad credentials");
                    }
                    break;
                case 3:
                    System.out.println("Enter your user id");
                    id=sc.nextInt();
                    System.out.println("Enter password");
                    password=sc.next();
                    login=sbiBank.VerifyCredentials(id,password);
                    if(login){
                        System.out.println("Enter the amount to add :");
                        amount=sc.nextInt();
                        sbiBank.addMoney(id,amount);
                    }else{
                        System.out.println("Bad credentials");
                    }
                    break;
                case 4:
                    System.out.println("Enter your user id");
                    id=sc.nextInt();
                    System.out.println("Enter password");
                    password=sc.next();
                    login=sbiBank.VerifyCredentials(id,password);
                    if(login){
                        sbiBank.checkBalance(id);
                    }else{
                        System.out.println("Bad credentials");
                    }
                    break;
                case 8:
                    break;
                default:
                    break;

            }


        }while(option!=8);
    }
}
