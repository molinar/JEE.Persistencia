package es.art83.persistence.jpa.models.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Direction [city=" + city + ", street=" + street + "]";
    }

}