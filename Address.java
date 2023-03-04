public class Address {
    private String unitno;
    private String street;
    private String postcode;
    private String district;
    private String state;

    //constructor
    public Address(String unitno, String street, String postcode, String district, String state){
        this.postcode = postcode;
        this.unitno = unitno;
        this.district = district;
        this.state = state;
        this.street = street;
    }

    // setters and getters
    public void setstate(String state) {
        this.state = state;
    }
    public String getstate(){
        return state;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }
    public String getUnitno(){
        return unitno;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    public String getDistrict(){
        return district;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    public String getStreet(){
        return state;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getPostcode(){
        return postcode;
    }
}
