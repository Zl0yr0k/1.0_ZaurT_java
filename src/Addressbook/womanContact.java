package Addressbook;

import java.time.LocalDate;
import java.util.Objects;

public class womanContact extends Contact{
    public womanContact(String firstName, String lastName, String phone, LocalDate birthday, int amountOfKids) {
        super(firstName, lastName, phone, birthday);
        this.criticalDays = amountOfKids;
    }
    private final int criticalDays;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        womanContact that = (womanContact) o;
        return Objects.equals(criticalDays, that.criticalDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), criticalDays);
    }

    @Override
    public String toString() {
        return "womanContact{" +
                "id=" + super.getId() +
                ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", phone='" + super.getPhone() + '\'' +
                ", birthday=" + super.getBirthday() +
                ", amountKids=" + this.criticalDays +
                '}' + '\n';
    }
}
