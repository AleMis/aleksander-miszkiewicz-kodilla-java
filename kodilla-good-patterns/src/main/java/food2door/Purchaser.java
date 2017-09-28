package food2door;

public class Purchaser {

    private String email;
    private String firstName;
    private String lastName;

    public Purchaser(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(email);
        sb.append(" ; ");
        sb.append(firstName);
        sb.append(" ; ");
        sb.append(lastName);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Purchaser purchaser = (Purchaser) o;

        if (!email.equals(purchaser.email)) return false;
        if (!firstName.equals(purchaser.firstName)) return false;
        return lastName.equals(purchaser.lastName);
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
