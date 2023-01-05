package Bank;

public class BankDetailsUse {
    public static void main(String[] args) {
        BankDetails p1 = new BankDetails("Rahul","SBI65","maldar",300.00);
        BankDetails p2 = new BankDetails("Subhas","SBI65");
        System.out.println("Deatails of first customer is Nick Name:"+
                p1.nickName + "A/C no is " + BankDetails.bankName);
        System.out.println("Deatails of first customer is Nick Name:"+
                p2.nickName + "A/C no is " + p2.numberOfAccounts);
        System.out.println(p1.getAccountNumber());
        System.out.println(p2.getAccountNumber());
        System.out.println(p1.getBalance());
        p1.addBalance(500.0);
        System.out.println(p1.getBalance());
        p1.removeBalance(700.0);
        System.out.println(p1.getBalance());

    }
}
