/*
Problem 1: Bank Account With Security Rules

Create a BankAccount class with:

Private fields:
- accountNumber
- balance
- pin

Rules:
- No direct setter for balance
- Deposit allowed only if amount > 0
- Withdraw allowed only if:
  * Correct PIN
  * Sufficient balance
  * Amount <= 25000 per transaction
- After 3 wrong PIN attempts → account locked
- Add a method: isAccountLocked()
*/

import java.util.Scanner;
public class BankAcc{
    private int AccNo;
    private double bal;
    private int pin;
    private int wrongAt;
    private Boolean lock;

    public BankAcc(int AccNo,double bal,int pin){
        this.AccNo = AccNo;
        this.bal = bal;
        this.pin = pin;
        this.wrongAt=0;
        this.lock=false;
    }

    public void deposit(double amt){
        if(!lock && amt>0){
            bal+=amt;
        }
        else{
            System.out.println("Cant deposit zero/negative amt or Acc Blocked");
        }
    }

    public void withdraw(double amt,int epin){
        if(lock){
            System.out.println("Acc Blocked");
            return;
        }
        if(epin != pin){
            wrongAt++;
            System.out.println("Wrong PIN");
            if(wrongAt>=3){
                lock = true;
                System.out.println("Cannot withdraw");
            }
            return ;
        }
        wrongAt=0;
        if(amt>0 && amt <=25000 && amt<=bal){
            bal-=amt;
            System.out.println("Withdraw Succesfull of amt: "+amt);
        }
        else{
            System.out.println("Withdraw Failed");
        }
    }
    
    public void getBalance(int epin){
        if(!lock && epin==pin){
            System.out.println("Balance is:"+bal);
        }
        else{
            System.out.println("Wrong Pinn");
        }
    }
    public boolean isAccLocked(){
        return lock;
    }

    public static void main(String[] args){
        BankAcc acc = new BankAcc(12356,50000,1423);
        acc.withdraw(50000,1423);
        acc.withdraw(1000,1090);
        acc.deposit(10000);
        acc.isAccLocked();
        acc.getBalance(1423);
        acc.getBalance(2934);
    }
}