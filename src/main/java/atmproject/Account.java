package atmproject;

import javax.swing.plaf.PanelUI;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;  // hesap numarasi
    private int pinNumber; // sifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


    // para cekme islemi  ==> paraCekmeIslemindenSonraKalanMiktar    // amount : miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    // para yatirma islemi ==> para yatirma isleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDepozit(double amount){

        checkingBalance= checkingBalance + amount;
        return checkingBalance;
    }

    // para cekme: saving hesabindan para cekildikten sonra kalan bakiyeyi hesapla
    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    // para yatirma: saving hesabina para yatirildiktan sonra kalan bakiyeyi hesapla
    private double calculateSavingBalanceAfterDepozit(double amount){

        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    // Musteri ile para cekmek icin etkilesme gecelim: checking hesap
    public void getCheckingWithdraw(){

        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya negatif rakamlar gecersizdir!");
            getCheckingWithdraw(); // recursive method(ozyinelemeli)(methodu kendi icinde tekrar cagirma)
        } else if (amount <= checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }else {
            System.out.println("Yetersiz bakiye!");
        }
    }


    // para yatirma(checking): Musteri ile para yatirmak icin etkilesime gecelim.
    public void getCheckingDepozit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya negatif rakamlar gecersizdir!");
            getCheckingDepozit();
        }else {
            calculateCheckingBalanceAfterDepozit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }


    // Musteri ile para cekmek icin etkilesme gecelim: saving hesap
    public void getSavingWithdraw() {
        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya negatif rakamlar gecersizdir!");
            getSavingWithdraw();
        } else if (amount <= savingBalance) {
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else {
            System.out.println("Yetersiz bakiye!");
        }
    }


    // para yatirma(saving): Musteri ile para yatirmak icin etkilesime gecelim.
    public void getSavingDepozit(){
        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Sifir veya negatif rakamlar gecersizdir!");
            getSavingDepozit();
        }else {
            calculateSavingBalanceAfterDepozit(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }
    }


    // son bakiyeyi goster methodu
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabinizda bulunan bakiye: " + moneyFormat.format(balance));
    }




}
