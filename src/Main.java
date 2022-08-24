import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Anton", "Pelepenko", 4));
        clients.add(new Person("Rimma", "Reznik", 7));
        clients.add(new Person("Oleg", "Sokolov", 3));
        clients.add(new Person("Mila", "Kozlova", 5));
        clients.add(new Person("Lena", "Milova", 2));
        return clients;
    }

    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>(generateClients());

        while (!attraction.isEmpty()) {
            Person s = attraction.poll();
            s.numbTickets--;
            System.out.println(s + " Прокатился на аттракционе. ");
            if (s.numbTickets != 0) {
                attraction.add(s);
            }

        }

    }
}
