package com.app.handcraft.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="craftmenu")
public class CraftMenu {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String item;
private String description;
private int quantity;
private double price;

public CraftMenu() {
super();

}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getItem() {
return item;
}
public void setItem(String item) {
this.item = item;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public CraftMenu(Long id, String item, String description, int quantity, double price) {
super();
this.id = id;
this.item = item;
this.description = description;
this.quantity = quantity;
this.price = price;
}

}