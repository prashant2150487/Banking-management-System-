package com.prashnt;

public class User {
    private int id;
    private String password;
    private String mobileNum;
    private double  balance;

    User(int id, String password) {
        this.id = id;
        this.password = password;
        balance = 500;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobileNum(){
        return mobileNum;
    }
    public void setMobileNum(String mobileNum  ){
        this.mobileNum=mobileNum;
    }
    public boolean verifyPassword(String password){
        return this.password.equals(password);
    }
    public void addBalance(double amount){
        this.balance=this.balance+amount;
    }
}
