/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.maxcars;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author macbookpro
 */
@Entity
@Table(name = "autos", catalog = "carinventory", schema = "")
@NamedQueries({
    @NamedQuery(name = "Autos.findAll", query = "SELECT a FROM Autos a"),
    @NamedQuery(name = "Autos.findById", query = "SELECT a FROM Autos a WHERE a.id = :id"),
    @NamedQuery(name = "Autos.findByMake", query = "SELECT a FROM Autos a WHERE a.make = :make"),
    @NamedQuery(name = "Autos.findByModel", query = "SELECT a FROM Autos a WHERE a.model = :model"),
    @NamedQuery(name = "Autos.findByYear", query = "SELECT a FROM Autos a WHERE a.year = :year"),
    @NamedQuery(name = "Autos.findByVin", query = "SELECT a FROM Autos a WHERE a.vin = :vin"),
    @NamedQuery(name = "Autos.findByMileage", query = "SELECT a FROM Autos a WHERE a.mileage = :mileage"),
    @NamedQuery(name = "Autos.findByColor", query = "SELECT a FROM Autos a WHERE a.color = :color"),
    @NamedQuery(name = "Autos.findByPrice", query = "SELECT a FROM Autos a WHERE a.price = :price"),
    @NamedQuery(name = "Autos.findByEngine", query = "SELECT a FROM Autos a WHERE a.engine = :engine"),
    @NamedQuery(name = "Autos.findByTransmission", query = "SELECT a FROM Autos a WHERE a.transmission = :transmission")})
public class Autos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "make")
    private String make;
    @Basic(optional = false)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @Column(name = "vin")
    private String vin;
    @Basic(optional = false)
    @Column(name = "mileage")
    private int mileage;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @Column(name = "engine")
    private String engine;
    @Basic(optional = false)
    @Column(name = "transmission")
    private String transmission;
    @Basic(optional = false)
    @Lob
    @Column(name = "notes")
    private String notes;

    public Autos() {
    }

    public Autos(Integer id) {
        this.id = id;
    }

    public Autos(Integer id, String make, String model, int year, String vin, int mileage, String color, double price, String engine, String transmission, String notes) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.transmission = transmission;
        this.notes = notes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        String oldMake = this.make;
        this.make = make;
        changeSupport.firePropertyChange("make", oldMake, make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String oldModel = this.model;
        this.model = model;
        changeSupport.firePropertyChange("model", oldModel, model);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        String oldVin = this.vin;
        this.vin = vin;
        changeSupport.firePropertyChange("vin", oldVin, vin);
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        int oldMileage = this.mileage;
        this.mileage = mileage;
        changeSupport.firePropertyChange("mileage", oldMileage, mileage);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String oldColor = this.color;
        this.color = color;
        changeSupport.firePropertyChange("color", oldColor, color);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        String oldEngine = this.engine;
        this.engine = engine;
        changeSupport.firePropertyChange("engine", oldEngine, engine);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        String oldTransmission = this.transmission;
        this.transmission = transmission;
        changeSupport.firePropertyChange("transmission", oldTransmission, transmission);
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        String oldNotes = this.notes;
        this.notes = notes;
        changeSupport.firePropertyChange("notes", oldNotes, notes);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autos)) {
            return false;
        }
        Autos other = (Autos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.maxcars.Autos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
