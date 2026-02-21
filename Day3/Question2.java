class Account{
    int an;
    double bal;

    static{
        System.out.println("NPS Bank of India");
    }
    {
        System.out.println("Account instance initializing");
    }

    Account(int an, double bal){
        this.an=an;
        this.bal=bal;
    }

    void Withdraw(double amt){
        bal = bal-amt;
    }
}

class SavingsAcc extends Account{
    float iR;

    SavingsAcc(int an, double bal, float iR){
        super(an,bal);
        this.iR=iR;
    }

    void Withdraw(double amt){
        if(bal<1000){
            System.out.println("You cannot Withdraw (bal<1000)");
        }
        else{
            bal= bal-amt;
        }
    }
}

public class Question2{
    public static void main(String[] main){
        Account ob =  new SavingsAcc(1357642, 5545.45f, 4.5f);
        ob.Withdraw(5000);
        ob.Withdraw(500);
    }
}