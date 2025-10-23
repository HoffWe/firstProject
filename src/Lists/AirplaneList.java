package Lists;

import Models.Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirplaneList {
    private List<Airplane> airplanes = new ArrayList<>();

    public AirplaneList() {
        airplanes.add(new Airplane(1, "Boeing 737", 180));
        airplanes.add(new Airplane(2, "Airbus A320", 160));
        airplanes.add(new Airplane(3, "Boeing 747", 416));
        airplanes.add(new Airplane(4, "Airbus A330", 250));
        airplanes.add(new Airplane(5, "Embraer E190", 100));
        airplanes.add(new Airplane(6, "Bombardier CRJ900", 90));
        airplanes.add(new Airplane(7, "Boeing 777", 396));
        airplanes.add(new Airplane(8, "Airbus A350", 325));
        airplanes.add(new Airplane(9, "Concorde", 100));
        airplanes.add(new Airplane(10, "McDonnell Douglas DC-10", 270));
        airplanes.add(new Airplane(11, "Boeing 737 MAX", 200));
        airplanes.add(new Airplane(12, "Airbus A321", 185));
        airplanes.add(new Airplane(13, "Boeing 767", 290));
        airplanes.add(new Airplane(14, "Embraer E175", 88));
        airplanes.add(new Airplane(15, "Bombardier CS300", 130));
        airplanes.add(new Airplane(16, "Boeing 787 Dreamliner", 330));
        airplanes.add(new Airplane(17, "Airbus A380", 525));
        airplanes.add(new Airplane(18, "McDonnell Douglas MD-80", 155));
        airplanes.add(new Airplane(19, "Tupolev Tu-154", 180));
        airplanes.add(new Airplane(20, "Comac C919", 168));
        airplanes.add(new Airplane(21, "Boeing 707", 189));
        airplanes.add(new Airplane(22, "Airbus A310", 280));
        airplanes.add(new Airplane(23, "Boeing 720", 149));
        airplanes.add(new Airplane(24, "Douglas DC-9", 135));
        airplanes.add(new Airplane(25, "Sukhoi Superjet 100", 108));
        airplanes.add(new Airplane(26, "Bombardier Dash 8", 78));
        airplanes.add(new Airplane(27, "BAe 146", 112));
        airplanes.add(new Airplane(28, "Antonov An-124", 150));
        airplanes.add(new Airplane(29, "Lockheed L-1011 TriStar", 250));
        airplanes.add(new Airplane(30, "Ilyushin Il-62", 168));
        airplanes.add(new Airplane(31, "Fokker 100", 107));
        airplanes.add(new Airplane(32, "McDonnell Douglas DC-8", 189));
        airplanes.add(new Airplane(33, "Comac ARJ21", 90));
        airplanes.add(new Airplane(34, "Tupolev Tu-204", 210));
        airplanes.add(new Airplane(35, "Bombardier Global 6000", 19));
        airplanes.add(new Airplane(36, "Embraer Legacy 450", 13));
        airplanes.add(new Airplane(37, "Boeing 737-800", 189));
        airplanes.add(new Airplane(38, "Airbus A319", 124));
        airplanes.add(new Airplane(39, "Bombardier Challenger 350", 10));
        airplanes.add(new Airplane(40, "Gulfstream G650", 18));
        airplanes.add(new Airplane(41, "Cessna Citation X", 12));
        airplanes.add(new Airplane(42, "Piper PA-46", 6));
        airplanes.add(new Airplane(43, "Beechcraft King Air 350", 9));
        airplanes.add(new Airplane(44, "Pilatus PC-12", 8));
        airplanes.add(new Airplane(45, "Cirrus SR22", 4));
        airplanes.add(new Airplane(46, "Dassault Falcon 7X", 16));
        airplanes.add(new Airplane(47, "Embraer Phenom 300", 9));
        airplanes.add(new Airplane(48, "Bombardier Learjet 75", 8));
        airplanes.add(new Airplane(49, "Cessna Citation Latitude", 9));
        airplanes.add(new Airplane(50, "HondaJet HA-420", 6));
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
        return airplanes.stream().filter(airplane -> airplane.getId() == id).findFirst().orElse(null);
    }


    public Airplane getAirplaneByName(String airplane) {
        return airplanes.stream().filter(a -> a.getName().equals(airplane)).findFirst().orElse(null);
    }

    public List<Airplane> getAirplanesByCapacity(int capacity) {
        return airplanes.stream().filter(a ->a.getCapacity()>=capacity).collect(Collectors.toList());
    }
}