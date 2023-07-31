public class PojoClassCreated {

    private int idNumber;
    private int orderNumber;
    private String name;
    private String lastName;
    private String address;
    private  String email;

    public PojoClassCreated(int idNumber, int orderNumber, String name, String lastName, String address, String email) {
        this.idNumber = idNumber;
        this.orderNumber = orderNumber;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PojoClassCreated{" +
                "idNumber=" + idNumber +
                ", orderNumber=" + orderNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
