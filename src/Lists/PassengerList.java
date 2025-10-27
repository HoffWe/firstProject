package Lists;

import Models.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {
    private List<Passenger> passengers = new ArrayList<>();

    public PassengerList() {
        passengers.add(new Passenger("Anna", "Nowak", "anna.nowak@example.com", 500000001));
        passengers.add(new Passenger("Piotr", "Kowalski", "piotr.kowalski@example.com", 500000002));
        passengers.add(new Passenger("Maria", "Wiśniewska", "maria.wisniewska@example.com", 500000003));
        passengers.add(new Passenger("Krzysztof", "Wójcik", "krzysztof.wojcik@example.com", 500000004));
        passengers.add(new Passenger("Katarzyna", "Kowalczyk", "katarzyna.kowalczyk@example.com", 500000005));
        passengers.add(new Passenger("Andrzej", "Kamiński", "andrzej.kaminski@example.com", 500000006));
        passengers.add(new Passenger("Małgorzata", "Lewandowska", "malgorzata.lewandowska@example.com", 500000007));
        passengers.add(new Passenger("Jan", "Zieliński", "jan.zielinski@example.com", 500000008));
        passengers.add(new Passenger("Agnieszka", "Szymańska", "agnieszka.szymanska@example.com", 500000009));
        passengers.add(new Passenger("Tomasz", "Dąbrowski", "tomasz.dabrowski@example.com", 500000010));
        passengers.add(new Passenger("Paweł", "Jankowski", "pawel.jankowski@example.com", 500000011));
        passengers.add(new Passenger("Monika", "Woźniak", "monika.wozniak@example.com", 500000012));
        passengers.add(new Passenger("Michał", "Kwiatkowski", "michal.kwiatkowski@example.com", 500000013));
        passengers.add(new Passenger("Ewa", "Kaczmarek", "ewa.kaczmarek@example.com", 500000014));
        passengers.add(new Passenger("Paula", "Piotrowska", "paula.piotrowska@example.com", 500000015));
        passengers.add(new Passenger("Marcin", "Grabowski", "marcin.grabowski@example.com", 500000016));
        passengers.add(new Passenger("Karolina", "Pawlak", "karolina.pawlak@example.com", 500000017));
        passengers.add(new Passenger("Rafał", "Michalski", "rafal.michalski@example.com", 500000018));
        passengers.add(new Passenger("Joanna", "Krawczyk", "joanna.krawczyk@example.com", 500000019));
        passengers.add(new Passenger("Łukasz", "Czarnecki", "lukasz.czarnecki@example.com", 500000020));
        passengers.add(new Passenger("Justyna", "Nowicki", "justyna.nowicki@example.com", 500000021));
        passengers.add(new Passenger("Bartłomiej", "Sikora", "bartlomiej.sikora@example.com", 500000022));
        passengers.add(new Passenger("Aleksandra", "Walczak", "aleksandra.walczak@example.com", 500000023));
        passengers.add(new Passenger("Damian", "Baran", "damian.baran@example.com", 500000024));
        passengers.add(new Passenger("Natalia", "Marciniak", "natalia.marciniak@example.com", 500000025));
        passengers.add(new Passenger("Grzegorz", "Wróbel", "grzegorz.wrobel@example.com", 500000026));
        passengers.add(new Passenger("Magdalena", "Adamczyk", "magdalena.adamczyk@example.com", 500000027));
        passengers.add(new Passenger("Marek", "Zawadzki", "marek.zawadzki@example.com", 500000028));
        passengers.add(new Passenger("Patrycja", "Szczepaniak", "patrycja.szczepaniak@example.com", 500000029));
        passengers.add(new Passenger("Wojciech", "Górski", "wojciech.gorski@example.com", 500000030));
        passengers.add(new Passenger("Sylwia", "Kubiak", "sylwia.kubiak@example.com", 500000031));
        passengers.add(new Passenger("Dawid", "Olszewski", "dawid.olszewski@example.com", 500000032));
        passengers.add(new Passenger("Izabela", "Jaworska", "izabela.jaworska@example.com", 500000033));
        passengers.add(new Passenger("Kamil", "Malinowski", "kamil.malinowski@example.com", 500000034));
        passengers.add(new Passenger("Paulina", "Jaworski", "paulina.jaworski@example.com", 500000035));
        passengers.add(new Passenger("Radosław", "Stępień", "radoslaw.stepien@example.com", 500000036));
        passengers.add(new Passenger("Elżbieta", "Chmielewska", "elzbieta.chmielewska@example.com", 500000037));
        passengers.add(new Passenger("Przemysław", "Sikorski", "przemyslaw.sikorski@example.com", 500000038));
        passengers.add(new Passenger("Joanna", "Brzezińska", "joanna.brzezinska@example.com", 500000039));
        passengers.add(new Passenger("Mateusz", "Kaczor", "mateusz.kaczor@example.com", 500000040));
        passengers.add(new Passenger("Agnieszka", "Kubiak", "agnieszka.kubiak@example.com", 500000041));
        passengers.add(new Passenger("Tadeusz", "Cieślak", "tadeusz.cieslak@example.com", 500000042));
        passengers.add(new Passenger("Monika", "Zielińska", "monika.zielinska@example.com", 500000043));
        passengers.add(new Passenger("Szymon", "Woźniak", "szymon.wozniak@example.com", 500000044));
        passengers.add(new Passenger("Barbara", "Wójcik", "barbara.wojcik@example.com", 500000045));
        passengers.add(new Passenger("Mariusz", "Kowal", "mariusz.kowal@example.com", 500000046));
        passengers.add(new Passenger("Martyna", "Głowacka", "martyna.glowacka@example.com", 500000047));
        passengers.add(new Passenger("Andrzej", "Nowacki", "andrzej.nowacki@example.com", 500000048));
        passengers.add(new Passenger("Dorota", "Stankiewicz", "dorota.stankiewicz@example.com", 500000049));
        passengers.add(new Passenger("Jakub", "Sikorski", "jakub.sikorski@example.com", 500000050));
    }


    public List<Passenger> getAll() {
        return passengers;
    }

    public Passenger getPassenger(int id) {
        return passengers.get(id);
    }
}