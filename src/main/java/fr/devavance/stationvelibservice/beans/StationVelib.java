package fr.devavance.stationvelibservice.beans;

import jakarta.persistence.*;

@Entity
@Table(name="stationvelib")
public class StationVelib {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String fullAddress;
    private String address;
    private Double latitude;
    private Double longitude;
    private int open;
    private int bonus;
    private int number;

    public StationVelib(){}

    public StationVelib(String name,String fulladdress, String address, Double latitude, Double longitude, int open, int bonus, int number) {
        this.name=name;
        this.fullAddress = fulladdress;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.open = open;
        this.bonus = bonus;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFulladdress() {
        return fullAddress;
    }

    public void setFulladdress(String fulladdress) {
        this.fullAddress = fulladdress;
    }

    public String getaAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getOpen() {
        return open;
    }

    public void setOpen(int open) {
        this.open = open;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

