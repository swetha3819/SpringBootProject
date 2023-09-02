package com.app.handcraft.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="loginpage")
public class LoginPage {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String usermail;
private Long contactno;
private String password;

@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name="product_id",referencedColumnName = "id")
private List<CraftMenu> menu;

@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
@JoinColumn(name="order_id",referencedColumnName = "id")
private List<Order> order;

public LoginPage() {
super();
// TODO Auto-generated constructor stub
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getUsermail() {
return usermail;
}
public void setUsermail(String usermail) {
this.usermail = usermail;
}
public Long getContactno() {
return contactno;
}
public void setContactno(Long contactno) {
this.contactno = contactno;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}

public List<CraftMenu> getMenu() {
return menu;
}
public void setMenu(List<CraftMenu> menu) {
this.menu = menu;
}

public List<Order> getOrder() {
return order;
}
public void setOrder(List<Order> order) {
this.order = order;
}
public LoginPage(Long id, String username, String usermail, Long contactno, String password) {
super();
this.id = id;
this.username = username;
this.usermail = usermail;
this.contactno = contactno;
this.password = password;
}




}
