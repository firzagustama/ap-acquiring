package corp.bi.go.id.ap.acquiring.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderHeaderUB {
    private String Id;
    private String orderNo;
    private Date orderDate;
    private Date exchangeDate;
    private String khazanahId;
    private String name;
    private String phoneNumber;
    private String email;
    private int status;
    private String noIdentity;
    private int identityTypeId;
    private String description;
    private Timestamp verificationDate;
    private String verificationBy;
    private Timestamp modifiedDate;
    private int orderTimeId;
    private double total;
    private int qtyAll;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(Date exchangeDate) {
        this.exchangeDate = exchangeDate;
    }

    public String getKhazanahId() {
        return khazanahId;
    }

    public void setKhazanahId(String khazanahId) {
        this.khazanahId = khazanahId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNoIdentity() {
        return noIdentity;
    }

    public void setNoIdentity(String noIdentity) {
        this.noIdentity = noIdentity;
    }

    public int getIdentityTypeId() {
        return identityTypeId;
    }

    public void setIdentityTypeId(int identityTypeId) {
        this.identityTypeId = identityTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Timestamp verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getVerificationBy() {
        return verificationBy;
    }

    public void setVerificationBy(String verificationBy) {
        this.verificationBy = verificationBy;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getOrderTimeId() {
        return orderTimeId;
    }

    public void setOrderTimeId(int orderTimeId) {
        this.orderTimeId = orderTimeId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQtyAll() {
        return qtyAll;
    }

    public void setQtyAll(int qtyAll) {
        this.qtyAll = qtyAll;
    }
}
