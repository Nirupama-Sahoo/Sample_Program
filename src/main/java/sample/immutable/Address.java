package sample.immutable;

public class Address{
    String streetName;
    int pinCode;
    public Address(){

    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Address(String streetName, int pinCode){
        this.streetName = streetName;
        this.pinCode = pinCode;

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "StreetName - "+streetName+", pin - "+pinCode;
    }
}
