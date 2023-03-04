public class Sales {
    private float amount;
    private Date date;
    public Sales(float amount, Date date) {
        this.amount = amount;
        this.date = date;
    }
    public Sales(float amount) {
        this.amount = amount;
    }
    // setter/getter here (not shown)
    public void setamount(float amount){
        this.amount = amount;
    }
    public float getamount(){
        return amount;
    }
    public void setdate(Date date){
        this.date = date;
    }
    public Date getdate() {
        return date;
    }
}
