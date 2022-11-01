package addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystemMain {
    //This program is to display Welcome to Address Book System in main class.
//Use Case 1 is to create one contact.

        //Default Constructor
        public AddressBookSystemMain()
        {
            System.out.println("Welcome to Address Book Program !!!");
        }

        public static void main(String[] args) {

            //Initialize Object
            AddressBookSystemMain obj = new AddressBookSystemMain();

            //Calling Encapsulated Class object
            ContactPerson addressBook = new ContactPerson("Rakesh","Reddy","Karimnagar","Hyderabad",
                    "TG","505122","9177376524","byreddyrakesh41@gmail.com");

            System.out.print("\n"+addressBook.toString());
        }
    }
