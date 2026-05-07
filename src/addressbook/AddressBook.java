<<<<<<<< HEAD:src/Addressbook/AddressBook.java
package Addressbook;
========
package addressbook;
>>>>>>>> 5c6cb0c (fix: rewrite directory):src/addressbook/AddressBook.java

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {

    private ArrayList<Contact> contactArrayList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactArrayList.add(contact);
    }

    public void removeContact(int numberOfContact) {

        Iterator<Contact> contactIterator = contactArrayList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.getId() == numberOfContact) {
                contactIterator.remove();
            }
        }
    }

    public Contact getContact(int id) {
        for (Contact contact : contactArrayList) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public String toString() {
        if (contactArrayList.isEmpty()) {
            return "В спсике нет контактов.";
        }
        return contactArrayList.toString();
    }
}
