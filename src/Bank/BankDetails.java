package Bank;

public class BankDetails {

    String name ;
    String nickName;
    static int numberOfAccounts;
    private final int accountNumber;
    String ifsc;
    Double SubmitAmount;
   private Double balance ;
   final static String bankName = "SBI";

   public BankDetails(String name,String ifsc){
       this.name = name;
       this.ifsc = ifsc;
       numberOfAccounts++;
       accountNumber = numberOfAccounts;
   }
    public BankDetails(String name,String ifsc,String nickName,Double submitAmount){
        this.name = name;
        this.ifsc = ifsc;
        this.balance = 0.0;
        this.nickName = nickName;
        this.SubmitAmount = submitAmount;
        numberOfAccounts++;
        this.balance += submitAmount;
        accountNumber = numberOfAccounts;
    }
    public int getAccountNumber(){
       return this.accountNumber;
    }

    public Double getBalance() {
        return balance;
    }
    public Double totalBalance(){
       return this.balance + this.SubmitAmount;
    }
    public void addBalance(Double amount){
       balance = balance + amount;
    }
    public void removeBalance(Double amount){
        balance = balance - amount;
    }

}
