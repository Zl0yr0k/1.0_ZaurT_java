<<<<<<<< HEAD:src/Addressbook/manContact.java
package Addressbook;
========
package addressbook;
>>>>>>>> 5c6cb0c (fix: rewrite directory):src/addressbook/manContact.java

import java.time.LocalDate;
import java.util.Objects;

public class manContact extends Contact {
    public manContact(String firstName, String lastName, String phone, LocalDate birthday, LocalDate salaryDay) {
        super(firstName, lastName, phone, birthday);
        this.salaryDay = salaryDay;

    }

    private final LocalDate salaryDay;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        manContact that = (manContact) o;
        return Objects.equals(salaryDay, that.salaryDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salaryDay);
    }

    @Override
    public String toString() {
        return "womanContact{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", birthday=" + super.getBirthday() +
                ", salaryDay=" + this.salaryDay +
                '}' + '\n';
    }
}
