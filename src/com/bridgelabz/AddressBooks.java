package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {

    static ArrayList<AddressBook> addressbooks = new ArrayList<AddressBook>();

    static void addAddressBook(String name){
        AddressBook book =  new AddressBook(name);
        addressbooks.add(book);
        System.out.println("Address book has been created");
    }

    public static void main(String[] args){
        System.out.println("Welcome to AddressBook");
        Scanner sc=new Scanner(System.in);
        String book_name;
        int choice=5;   //random value
        String searchName=null;
        while (choice != 0) {
            System.out.println("Select one of the below options");
            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add AddressBook. ");
            System.out.println(" 2. Add contact. ");
            System.out.println(" 3. Edit contact. ");
            System.out.println(" 4. Delete contact. ");
            System.out.println(" 5. Display Single Address Book. ");
            System.out.println(" 6. Display all Address Books");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Address book name:");
                    book_name=sc.nextLine();
                    addAddressBook(book_name);
                    break;
                case 2:
                    System.out.println("Enter the name of address book");
                    book_name=sc.nextLine();
                    System.out.println("enter the details of new contact:");
                    System.out.println("FirstName");
                    String ip_firstName = sc.nextLine();
                    System.out.println("lastName");
                    String ip_lastName = sc.nextLine();
                    System.out.println("address");
                    String ip_address = sc.nextLine();
                    System.out.println("City");
                    String ip_city = sc.nextLine();
                    System.out.println("gmail");
                    String ip_gmail = sc.nextLine();
                    System.out.println("ZipCode");
                    int ip_zipCode = sc.nextInt();
                    System.out.println("PhoneNumber");
                    long ip_phoneNumber = sc.nextLong();
                    for (int i = 0; i < addressbooks.size(); i++) {
                        if (addressbooks.get(i).address_book_name.equals(book_name)) {
                            AddressBook temp_obj = addressbooks.get(i);
                            temp_obj.firstName = ip_firstName;
                            temp_obj.lastName=ip_lastName;
                            temp_obj.address=ip_address;
                            temp_obj.city=ip_city;
                            temp_obj.zipCode=ip_zipCode;
                            temp_obj.phoneNumber=ip_phoneNumber;
                            temp_obj.gmail=ip_gmail;
                            addressbooks.set(i, temp_obj);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the Address book name:");
                    book_name=sc.nextLine();
                    System.out.println("Enter name you want to edit");
                    searchName = sc.nextLine();
                    System.out.println("Enter new name ");
                    String newName = sc.nextLine();
                    for (int i = 0; i < addressbooks.size(); i++) {
                        if (addressbooks.get(i).address_book_name.equals(book_name)) {
                            AddressBook temp_obj = addressbooks.get(i);
                            if (temp_obj.firstName.equals(searchName)) {
                                temp_obj.firstName = newName;
                                addressbooks.set(i, temp_obj);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the Address book name:");
                    book_name=sc.nextLine();
                    System.out.println("Enter name you want to delete");
                    searchName = sc.nextLine();
                    for (int i = 0; i < addressbooks.size(); i++) {
                        if (addressbooks.get(i).address_book_name.equals(book_name)) {
                            AddressBook temp_obj = addressbooks.get(i);
                            if (temp_obj.firstName.equals(searchName)) {
                                addressbooks.remove(i);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter the Address book name:");
                    book_name=sc.nextLine();
                    for (int i = 0; i < addressbooks.size(); i++) {
                        if (addressbooks.get(i).address_book_name.equals(book_name)) {
                            addressbooks.get(i).display();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Displaying all the address books");
                    for (int i = 0; i < addressbooks.size(); i++) {
                        addressbooks.get(i).display();
                    }
                    break;
            }
        }
    }
}
