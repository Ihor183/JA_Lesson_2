package ua.igorbendera.jdbs;

public class Laptop {
    private int id;
    private String brand;
    private String model;
    private int RAM;
    private int programmerId;

    public Laptop(int id, String brand, String model, int RAM, int programmerId) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.programmerId = programmerId;
    }

    public Laptop(String brand, String model, int RAM, int programmerId) {
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.programmerId = programmerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getProgrammerId() {
        return programmerId;
    }

    public void setProgrammerId(int programmerId) {
        this.programmerId = programmerId;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", RAM=" + RAM +
                ", programmerId=" + programmerId +
                '}';
    }
}
