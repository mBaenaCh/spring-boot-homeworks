package com.mateo.cars.domain;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.Objects;

public class Car {
    /* Para validar el uso de mis modelos del dominio debere añadir clases validadoras por cada
    *  parametro sobre el cual desee realizar validaciones
    * */

    private String id;
    private CarBrand brand;
    private CarModel model;
    private LocalDate dateOfProduction;
    private String color;

    public Car() {
    }


    public Car(String id, CarBrand brand, CarModel model, LocalDate dateOfProduction, String color) {
        Objects.requireNonNull(brand, "Car brand name must not be an empty value");
        Objects.requireNonNull(model, "The car model name must not be an empty value");
        Objects.requireNonNull(dateOfProduction, "The ");
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public LocalDate getYearOfProduction() {
        return dateOfProduction;
    }

    public void setYearOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                ", color='" + color + '\'' +
                '}';
    }
}
