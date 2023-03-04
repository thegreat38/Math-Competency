public class Name {
    private String fname;
    private String lname;
    public Name() { }
    public Name(String fname) {
        this.fname = fname;
    }

    // setter/getter here for names
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getFname(){
        return fname;
    }
    public void setLname(String lname){
        this.lname = lname;
    }
    public String getLname(){
        return lname;
    }
}
