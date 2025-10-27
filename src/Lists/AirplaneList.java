package Lists;

import Models.Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneList {
    private List<Airplane> airplanes = new ArrayList<>();

    public AirplaneList() {
        airplanes.add(new Airplane("Boeing 737", 180));
        airplanes.add(new Airplane("Airbus A320", 160));
        airplanes.add(new Airplane("Boeing 747", 416));
        airplanes.add(new Airplane("Airbus A330", 250));
        airplanes.add(new Airplane("Embraer E190", 100));
        airplanes.add(new Airplane("Bombardier CRJ900", 90));
        airplanes.add(new Airplane("Boeing 777", 396));
        airplanes.add(new Airplane("Airbus A350", 325));
        airplanes.add(new Airplane("Concorde", 100));
        airplanes.add(new Airplane("McDonnell Douglas DC-10", 270));
        airplanes.add(new Airplane("Boeing 737 MAX", 200));
        airplanes.add(new Airplane("Airbus A321", 185));
        airplanes.add(new Airplane("Boeing 767", 290));
        airplanes.add(new Airplane("Embraer E175", 88));
        airplanes.add(new Airplane("Bombardier CS300", 130));
        airplanes.add(new Airplane("Boeing 787 Dreamliner", 330));
        airplanes.add(new Airplane("Airbus A380", 525));
        airplanes.add(new Airplane("McDonnell Douglas MD-80", 155));
        airplanes.add(new Airplane("Tupolev Tu-154", 180));
        airplanes.add(new Airplane("Comac C919", 168));
        airplanes.add(new Airplane("Boeing 707", 189));
        airplanes.add(new Airplane("Airbus A310", 280));
        airplanes.add(new Airplane("Boeing 720", 149));
        airplanes.add(new Airplane("Douglas DC-9", 135));
        airplanes.add(new Airplane("Sukhoi Superjet 100", 108));
        airplanes.add(new Airplane("Bombardier Dash 8", 78));
        airplanes.add(new Airplane("BAe 146", 112));
        airplanes.add(new Airplane("Antonov An-124", 150));
        airplanes.add(new Airplane("Lockheed L-1011 TriStar", 250));
        airplanes.add(new Airplane("Ilyushin Il-62", 168));
        airplanes.add(new Airplane("Fokker 100", 107));
        airplanes.add(new Airplane("McDonnell Douglas DC-8", 189));
        airplanes.add(new Airplane("Comac ARJ21", 90));
        airplanes.add(new Airplane("Tupolev Tu-204", 210));
        airplanes.add(new Airplane("Bombardier Global 6000", 19));
        airplanes.add(new Airplane("Embraer Legacy 450", 13));
        airplanes.add(new Airplane("Boeing 737-800", 189));
        airplanes.add(new Airplane("Airbus A319", 124));
        airplanes.add(new Airplane("Bombardier Challenger 350", 10));
        airplanes.add(new Airplane("Gulfstream G650", 18));
        airplanes.add(new Airplane("Cessna Citation X", 12));
        airplanes.add(new Airplane("Piper PA-46", 6));
        airplanes.add(new Airplane("Beechcraft King Air 350", 9));
        airplanes.add(new Airplane("Pilatus PC-12", 8));
        airplanes.add(new Airplane("Cirrus SR22", 4));
        airplanes.add(new Airplane("Dassault Falcon 7X", 16));
        airplanes.add(new Airplane("Embraer Phenom 300", 9));
        airplanes.add(new Airplane("Bombardier Learjet 75", 8));
        airplanes.add(new Airplane("Cessna Citation Latitude", 9));
        airplanes.add(new Airplane("HondaJet HA-420", 6));
    }

    /*
        Function<T, R> — jeden argument → wynik
        BiFunction<T, U, R> — dwa argumenty → wynik
        UnaryOperator<T> — jeden argument → ten sam typ wyniku
        BinaryOperator<T> — dwa argumenty → ten sam typ wyniku
        Supplier<T> — brak argumentów → zwraca wynik
        Consumer<T> — jeden argument → nic nie zwraca
        BiConsumer<T, U> — dwa argumenty → nic nie zwraca
        Predicate<T> — jeden argument → boolean
        BiPredicate<T, U> — dwa argumenty → boolean
        */

    public List<Airplane> getAll() {
        return airplanes;
    }

    public Airplane getAirplaneById(int id) {
        return airplanes.get(id);
    }


    public Airplane getAirplaneByName(String airplane) {
        return airplanes.stream().filter(a -> a.getName().equals(airplane)).findFirst().orElse(null);
    }

    public List<Airplane> getAirplanesByCapacity(int capacity) {
        return airplanes.stream().filter(a ->a.getCapacity()>=capacity).collect(Collectors.toList());
    }
}