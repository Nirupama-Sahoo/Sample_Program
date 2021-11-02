package sample.immutable;

public final class Person {
   private final String name;
   private final Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() /* throws CloneNotSupportedException */ {

        Address newAddress = new Address();
        newAddress.setPinCode(address.getPinCode());
        newAddress.setStreetName(address.getStreetName());
     //  newAddress = (Address) address.clone();
        return newAddress;

    }

    public Person(String name, Address address){
       this.name = name;
       this.address = new Address();
       this.address.setStreetName(address.getStreetName());
       this.address.setPinCode(address.getPinCode());
   }
   public static void main(String args[]){
        Person person = new Person("Nirupama", new Address("Gunjur",756008));
        Address address = person.getAddress();
        System.out.println(address);
        address.setStreetName("Varthur");
        address.setPinCode(45006);
        System.out.println(person.address);
   }

}
