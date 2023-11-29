package n2exercici1;

import java.util.Scanner;

public class ShopManager {
    static Scanner in = new Scanner(System.in);
    private static int pickMethod(){
        System.out.println("""
                What payment method do you want to use?
                1.- Paypal
                2.- Credit card
                3.- Bank account""");
        int option =  in.nextInt();
        in.nextLine();
        return option;
    }

    public static Payment askPayment(){
        int method = pickMethod();
        Payment payment;
        System.out.println("How much is the payment?");
        double amount = in.nextDouble();
        in.nextLine();
        switch (method){
            case 1:
                payment = askPayPal(amount);
                break;
            case 2:
                payment = askCreditCard(amount);
                break;
            case 3:
                payment = askBankAccount(amount);
                break;
            default:
                System.out.println("Method error");
                return null;
        }
        return payment;
    }
    private static PayPal askPayPal(double amount){
        System.out.println("Please write Paypal's username");
        String userName = in.next();
        in.nextLine();
        System.out.println("Please type password");
        String password = in.nextLine().trim();
        return new PayPal(userName, password, amount);
    }

    private static CreditCard askCreditCard(double amount){
        System.out.println("Please write card's number without spaces");
        int cardNumber = in.nextInt();
        in.nextLine();
        System.out.println("Please write card owner's name");
        String name = in.nextLine().trim();
        System.out.println("Please write expiration date in MMYY format");
        int expirationDate = in.nextInt();
        in.nextLine();
        System.out.println("Please input cvv security code");
        int cvv = in.nextInt();
        return new CreditCard(cardNumber, name, expirationDate, cvv, amount);
    }

    private static BankAccount askBankAccount(double amount){
        System.out.println("Please write account's IBAN without spaces");
        String iban = in.next();
        in.nextLine();
        System.out.println("Please write account owner's name");
        String name = in.nextLine().trim();
        System.out.println("Please input owner's id");
        String id = in.next().toUpperCase();
        return new BankAccount(iban, name, id, amount);
    }
}
