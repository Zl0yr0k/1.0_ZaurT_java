package main.java.com.skillbox.addressbook;

import java.time.LocalDate;
import java.util.Objects;

public class Contact {
    private static int idCounter = 1;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final LocalDate birthday;


    public Contact(String firstName, String lastName, String phone, LocalDate birthday) {
        this.id = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && Objects.equals(phone, contact.phone) && Objects.equals(birthday, contact.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phone, birthday);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
