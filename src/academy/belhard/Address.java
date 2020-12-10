package academy.belhard;

public class Address {

    private String town;
    private String street;
    private int number;

    public Address(String town, String street, int number) {
        this.town = town;
        this.street = street;
        this.number = number;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if ( town == null ) {
            throw new NullFieldException("Необходимо указать значение"); }
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
            if ( street == null ) {
                throw new NullFieldException("Необходимо указать значение");
        }
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number)  {
        if ( number <= 0) {
            throw new NullFieldException("Необходимо указать верное значение");}
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
