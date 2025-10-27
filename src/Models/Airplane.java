package Models;

public class Airplane {
    private String name;
    private int capacity;

    public Airplane(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public Airplane() {}

    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setName(String name) {
        this.name = name;
    }
     public String toString() {
        return "Airplane : name=" + name + ", capacity=" + capacity + "]";
     }

}
