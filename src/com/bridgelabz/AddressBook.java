package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

        public String firstName;
        public String lastName;
        public String address;
        public String city;
        public int zipCode;
        public long phoneNumber;
        public String gmail;
        public String address_book_name;

        public AddressBook(String firstname, String lastname, String address, String city, int zipcode, long phonenumber, String gmail) {
            this.firstName = firstname;
            this.lastName = lastname;
            this.address = address;
            this.city = city;
            this.zipCode = zipcode;
            this.phoneNumber = phonenumber;
            this.gmail = gmail;
            AddressBook(String  ads_bk_name){
                this.address_book_name=ads_bk_name;
            }
            public void display(){
                System.out.println("AddressBookName:"+address_book_name+" firstName:"+firstName+" "+
                        "lastName:" + lastName +"  "+ "address:" +address +" "+"city:" +city +" "+
                        "zipCode:"+zipCode+  " " +"phoneNumber:"+phoneNumber +" gmail:"  +gmail);
            }
        }
        }


