package entities;

import java.util.Date;

public class Order {
    private int customerID;
    private Date createdDate;
    private Date closedDate;
    private String status;

    Order(){}

    Order(int tCustomerID, Date tCreatedDate,
          Date tClosedDate, String tStatus){

        this.customerID = tCustomerID;
        this.createdDate = tCreatedDate;
        this.closedDate = tClosedDate;
        this.status = tStatus;
    }

    public int GetCustomerID() { return this.customerID; }
    public void SetCustomerID(int tCustomerID){
        this.customerID = tCustomerID;
    }

    public Date GetCreatedDate(){
        return this.createdDate;
    }
    public void SetCreatedDate(Date tCreatedDate){
        this.createdDate = tCreatedDate;
    }

    public Date GetClosedDate(){
        return this.closedDate;
    }
    public void SetClosedDate(Date tClosedDate){
        this.closedDate = tClosedDate;
    }

    public String GetStatus(){
        return this.status;
    }
    public void SetStatus(String tStatus){
        this.status = tStatus;
    }
}
