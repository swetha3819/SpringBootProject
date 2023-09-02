package com.app.handcraft.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="craftorder")
public class Order {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private Date orderdate;
private String craftlist;
private int orderquantity;
private double orderprice;
public Order() {
super();

}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public Date getOrderdate() {
return orderdate;
}
public void setOrderdate(Date orderdate) {
this.orderdate = orderdate;
}
public String getCraftlist() {
return craftlist;
}
public void setCraftlist(String craftlist) {
this.craftlist = craftlist;
}
public int getOrderquantity() {
return orderquantity;
}
public void setOrderquantity(int orderquantity) {
this.orderquantity = orderquantity;
}
public double getOrderprice() {
return orderprice;
}
public void setOrderprice(double orderprice) {
this.orderprice = orderprice;
}
public Order(Long id, Date orderdate, String craftlist, int orderquantity, double orderprice) {
super();
this.id = id;
this.orderdate = orderdate;
this.craftlist= craftlist;
this.orderquantity = orderquantity;
this.orderprice = orderprice;
}

}
