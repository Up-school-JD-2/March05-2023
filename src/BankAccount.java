public class BankAccount {

  String accountNumber;

  String ownerFirstName;

  String ownerLastName;

  double balance;

  //constructor  -> kurucu metodumuz
  // class ismi ile aynı olmak zorunda
  // dönüş tipi yoktur
  // class'ların örnekleri oluşturulduğunda ilk çalışan metodtur
  public BankAccount(String accountNumber, String ownerFirstName
      , String ownerLastName, double balance) {
    this.accountNumber = accountNumber;
    this.ownerFirstName = ownerFirstName;
    this.ownerLastName = ownerLastName;
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public boolean withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Hesabınızda yeterli para yok!");
      return false;
    }
    if (amount < 0) {
      System.out.println("Geçersiz tutar");
      return false;
    }
    balance -= amount;
    return true;
  }

  public void displayBalance() {
    System.out.println("Hesap bakiyeniz: " + balance);
  }
}
