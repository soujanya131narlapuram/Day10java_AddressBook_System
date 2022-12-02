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
    public AddressBook(String firstname,String lastname,String address,String city,int zipcode,long phonenumber,String gmail ) {
        this.firstName=firstname;
        this.lastName=lastname;
        this.address=address;
        this.city= city;
        this.zipCode=zipcode;
        this.phoneNumber=phonenumber;
        this.gmail=gmail;
    }
    public void display(){
        System.out.println("firstName:"+firstName+" "+  "lastName:" +
                lastName +"  "+ "address:" +address +" "+"city:" +city +" "+
                "zipCode:"+zipCode+  " " +"phoneNumber:"+phoneNumber +" gmail:"  +gmail);
    }

    public static void main(String[] args){
        System.out.println("Welcome to AddressBook");
        Scanner sc=new Scanner(System.in);
        ArrayList<AddressBook> ads_book=new ArrayList<>();
        int choice=5;
        while (choice != 0) {
            System.out.println("Select one of the below options");
            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Display contacts. ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
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

                    ads_book.add(new AddressBook(ip_firstName, ip_lastName,
                            ip_address, ip_city, ip_zipCode, ip_phoneNumber, ip_gmail));
                    break;
                case 2:
                    System.out.println("Enter name you want to edit");
                    String searchName = sc.nextLine();
                    System.out.println("Enter new name ");
                    String newName = sc.nextLine();
                    for (int i = 0; i < ads_book.size(); i++) {
                        if (ads_book.get(i).firstName.equals(searchName)) {
                            AddressBook temp_obj = ads_book.get(i);
                            temp_obj.firstName = newName;
                            ads_book.set(i, temp_obj);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Showing All the contacts from the AddressBook");
                    for (int index = 0; index < ads_book.size(); index++) {
                        ads_book.get(index).display();
                    }
                    break;
            }
        }
    }
}

