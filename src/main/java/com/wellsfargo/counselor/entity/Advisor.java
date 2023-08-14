package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManytoOne;
import jakarta.persistence.JoinColumn;
import jakarta.util.Date

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisorId")
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getClientId() {
        return clientId;
    }

    public Long getAdvisorId() {
        return advisor.getAdvisorId();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Long getPortfolioId() {
        return PortfolioId();
    }

    public Long getClientId() {
        return client.getClientId();
    }

    public Date getcreationDate() {
        return creationDate;
    }
}

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private int purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Client() {

    }

    public Client(String name, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolio.getPortfolioId();
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public void setpurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }
}
