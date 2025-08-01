package Models;

public class Airplane {
    private int id;
    private String name;
    private int capacity;

    public Airplane(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
    public Airplane() {}

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
     public String toString() {
        return "Airplane : id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
     }

}
