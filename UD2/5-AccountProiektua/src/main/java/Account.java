
public class Account {
    
    private String id;
    private String name;
    private int balance = 0;
    
    public Account(String id, String name) {
     this.id = id;
     this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getBalance(){
        return balance;
    }
    public int Credit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int Debit(int amount){
        if(amount<=balance){
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded");
        }
        return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= balance){
            another.balance = another.balance + amount;
            this.balance = this.balance - amount;
        }else {
            System.out.println("Amount exceeded");
        }
        return another.balance;
    }
    public String toString() {
        return "Account[ID = "+this.getId()+", Izena = "+this.getName()+", Balance = "+this.getBalance()+"]";
    }
}

