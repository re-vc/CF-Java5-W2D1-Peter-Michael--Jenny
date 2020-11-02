package Peter;

import java.io.*;
import java.util.Scanner;
public class PersonTest {
    public static void main(String[] args) {

        getPersonDetails person1 = new getPersonDetails("John", "Doe", 33);
        getPersonDetails person2 = new getPersonDetails("Dohn", "Joe", 23);
        getPersonDetails person3 = new getPersonDetails("Hon", "Odej", 54);

        Bank account1 = new Bank("ACCNR: 001", 4000);

        Scanner sc = new Scanner(System.in);
        double x;
        double y = account1.balance;

        // A1 (2 & (1
        /*
        System.out.println("Name: "+person1.name);
        System.out.println("Lastname: "+person1.surname);
        System.out.println("Age: "+person1.age);

         */
        // A2
        /*
        System.out.println("Full Name: " + person1.name + " " + person1.surname.toUpperCase());
        System.out.println("Age: " + person1.age);

         */
        System.out.println(account1.account + " " + account1.balance);
        System.out.println("what sum do you want to withdraw?");
        x = sc.nextDouble();
        double z = y - x;
        if (z > account1.balance){
            System.out.println("your account balance is now negative. " + z);
        } else{
            System.out.println("your account balance is now: " +z);
        }

    }
}
