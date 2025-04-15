package Problem3;

// classes
public class Address {
    private String street;
    private String city;
    private String province;
    private String postal_code;

    // constructor to set everything
    public Address(String street, String city, String province, String postal_code) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;
    }

    // returns the address as one big string
    public String toString() {
        return street + ", " + city + ", " + province + "\n" + postal_code;
    }
}
