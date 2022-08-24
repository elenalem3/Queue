public class Person {
    protected String name;
    protected String surname;
    protected int numbTickets;

    public Person(String name, String surname, int numbTickets) {
        this.name = name;
        this.surname = surname;
        this.numbTickets = numbTickets;
    }

    public String toString() {
        return name + " " + surname + ", остаток билетов: " + numbTickets + ". ";
    }
}
