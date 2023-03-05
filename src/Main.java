import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount[] accounts = new BankAccount[100];
    //var newAccountArray = new BankAccount[accounts.length + 1];
    int numAccounts = 0;
    boolean quit = false;
    do {
      System.out.println("1. Yeni hesap oluştur");
      System.out.println("2. Hesaba para yatır");
      System.out.println("3. Hesaptan para çek");
      System.out.println("4. Hesap bakiyesini görüntüle");
      System.out.println("5. Çıkış");
      System.out.println("Seçiminiz (1-5): ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1 -> {
          System.out.println("Hesap numarası: ");
          String accountNumber = sc.next();
          System.out.println("Adınız: ");
          String firstName = sc.next();
          System.out.println("Soyadınız: ");
          String lastName = sc.next();
          System.out.println("İlk para yatırma bakiyesi: ");
          double initialBalance = sc.nextDouble();
          BankAccount newBankAccount = new BankAccount(accountNumber,
                                                       firstName,
                                                       lastName,
                                                       initialBalance);
          accounts[numAccounts] = newBankAccount;
          numAccounts++;
          System.out.println("Yeni hesap oluşturuldu.");
        }
        case 2 -> {
          System.out.print("Hesap numarası: ");
          String accountNumber = sc.next();
          System.out.println("Yatırılacak miktar: ");
          double amountDeposit = sc.nextDouble();
          for (int i = 0; i < numAccounts; i++) {
            // accounts[i].accountNumber.equals(accountNumber)
            if (accounts[i].accountNumber.equals(accountNumber)) {
              accounts[i].deposit(amountDeposit);
              System.out.println(amountDeposit + "₺ hesaba yatırıldı.");
              break;
            }
          }
        }
        case 3 -> {
          System.out.println("Hesap numarası: ");
          String accountNumber = sc.next();
          System.out.println("Çekilecek miktar: ");
          double withdrawAmount = sc.nextDouble();
          for (int i = 0; i < numAccounts; i++) {
            // accounts[i].accountNumber.equals(accountNumber)
            if (accounts[i].accountNumber.equals(accountNumber)) {
              boolean result = accounts[i].withdraw(withdrawAmount);
              if (result) {
                System.out.println(withdrawAmount + "₺ çekildi.");
              }
              break;
            }
          }
        }
        case 4 -> {
          System.out.println("Hesap numarası: ");
          String accountNumber = sc.next();
          for (int i = 0; i < numAccounts; i++) {

            System.out.println(
                accounts[i].accountNumber + "==" + accountNumber + "=" + accounts[i].accountNumber == accountNumber);
            System.out.println(
                accounts[i].accountNumber + "==" + accountNumber + "=" + accounts[i].accountNumber.equals(
                    accountNumber));

            if (accounts[i].accountNumber.equals(accountNumber)) {
              accounts[i].displayBalance();
              break;
            }
          }
        }
        case 5 -> quit = true;
      }
    } while (!quit);

    System.out.println("--------------------");
  }
}