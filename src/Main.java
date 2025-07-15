import Models.Airplane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* kolekcje :
        -list ( zachowana kolejnosć dodawania elementów, dozwolone duplikaty)
        -set ( nie zachowuje koloejności dodawania elementów, brak duplikatów)
        -map ( kolekcja klucz-wartość, unikalny klucz)
        -queue(dequeue) (kolejka FIFO)
         */
        Airplane airplane = new Airplane(1,"Samolot1",200);
        Airplane airplane1 = new Airplane(2,"Samolot2",300);
        Airplane airplane2 = new Airplane(3,"Samolot3",100);
        Airplane airplane3 = new Airplane(4,"Samolot4",200);

        List<Airplane> airplanes = new ArrayList<Airplane>();

        airplanes.add(airplane);
        airplanes.add(airplane1);
        airplanes.add(airplane2);

        for (Airplane a : airplanes) {
            System.out.println(a.toString());
        }
    }
}