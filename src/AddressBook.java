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
        System.out.println("enter the details of new contact:");
        Scanner sc=new Scanner(System.in);
        System.out.println("FirstName");
        String ip_firstName=sc.nextLine();
        System.out.println("lastName");
        String ip_lastName=sc.nextLine();
        System.out.println("address");
        String ip_address=sc.nextLine();
        System.out.println("City");
        String ip_city=sc.nextLine();
        System.out.println("gmail");
        String ip_gmail=sc.nextLine();
        System.out.println("ZipCode");
        int ip_zipCode=sc.nextInt();
        System.out.println("PhoneNumber");
        long ip_phoneNumber=sc.nextLong();

        AddressBook obj1=new  AddressBook(ip_firstName,ip_lastName,
                ip_address,ip_city,ip_zipCode,ip_phoneNumber,ip_gmail);
        ArrayList<AddressBook> ads_book=new ArrayList<>();
        ads_book.add(obj1);
        System.out.println("Showing the information stored on the AddressBook");
        ads_book.get(0).display();
    }
}

