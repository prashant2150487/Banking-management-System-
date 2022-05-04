package com.prashnt;

import java.util.HashMap;


public class Bank {
    private HashMap<Integer, User> Users;
    Bank(){
        Users=new HashMap<Integer,User>();

    }
    public void addUser(int id,String password){
        if(Users.containsKey(id)){
            System.out.println("User id already registered");
        }else{
            User newUser=new User(id,password);
            Users.put(id,newUser);
            System.out.println("Account successfully created");
        }
    }
    public void sendMoney(int id,String password,int destID,double amount){
        User sender =Users.get(id);
        if(sender.getBalance()>=amount){
            System.out.println("Transferring money ....... ");
            User receiver= Users.get(destID);
            if(receiver==null){
                System.out.println("Receiver id is not found");
                return;
            }
            sender.setBalance(sender.getBalance()-amount);
            receiver.setBalance(receiver.getBalance()+amount);
            System.out.println("Transferred money successfully !!!!");
            System.out.println("Your new Balance is"+sender.getBalance());
        }else{
            System.out.println("Insufficient Balance sorry");
        }
        return ;
    }
    public boolean VerifyCredentials(int id, String password){
        User user=Users.get(id);
        if(user==null){
            return false;
        }
        return user.verifyPassword(password);
    }
    public void addMoney(int id,double amount){
        User user=Users.get(id);
        user.addBalance(amount);
        System.out.println("Successfully added money !!! \n your new balance is "+user.getBalance());
    }
    public void checkBalance(int id){
        User user=Users.get(id);
        System.out.println("Your balance is : "+user.getBalance());

    }

}
