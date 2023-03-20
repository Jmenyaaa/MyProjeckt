public class Address extends Employee{
    String Address;

    public Address(String name, String email, int ID_num, String address) {
        super(name, email, ID_num);
        Address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                '}';
    }

    public String getAddress() {
        return Address;
    }



}
