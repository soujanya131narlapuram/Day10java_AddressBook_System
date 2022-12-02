import java.util.ArrayList;
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
        AddressBook obj1=new  AddressBook("Soujanya","Narlapuram",
                "hn-034","hyd",500088,738257334,"123@gmail.com");
        ArrayList<AddressBook> ads_book=new ArrayList<AddressBook>();
        ads_book.add(obj1);
        System.out.println("Information stored into AddressBook through constructor parameters");
        System.out.println("Showing the information stored on the AddressBook");
        ads_book.get(0).display();
    }
}

