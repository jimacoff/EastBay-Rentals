package edu.csueb.cs3520.bean;

/**
 *
 * @author thiagoloschi
 */
public class Car {
    private int id;
    private String name;
    private String brand;
    private String description;
    private Double cost;
    private String pict;
    private boolean available;

    public Car() {
    }

    public Car(int id, String brand, String name, String description, Double cost, String pict, boolean available) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.pict = pict;
        this.available = available;
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
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getPict() {
        return pict;
    }

    public void setPict(String pict) {
        this.pict = pict;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
    
    
}
