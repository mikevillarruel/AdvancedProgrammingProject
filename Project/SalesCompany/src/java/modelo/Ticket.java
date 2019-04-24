/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Mike
 */
public class Ticket {
    
    private int idTicket;
    private int idSeller;
    private double price;
    private String departure;
    private String arrival;
    private String clas;
    private Date date;
    private Time hour;
    private String airline;
    private String gate;
    private String flightNumber;
    private String seat;
    private int stock;
    private int discount;
    private boolean state;

    public Ticket() {
    }

    public Ticket(int idTicket, int idSeller, double price, String departure, String arrival, String clas, Date date, Time hour, String airline, String gate, String flightNumber, String seat, int stock, int discount, boolean state) {
        this.idTicket = idTicket;
        this.idSeller = idSeller;
        this.price = price;
        this.departure = departure;
        this.arrival = arrival;
        this.clas = clas;
        this.date = date;
        this.hour = hour;
        this.airline = airline;
        this.gate = gate;
        this.flightNumber = flightNumber;
        this.seat = seat;
        this.stock = stock;
        this.discount = discount;
        this.state = state;
    }

    public Ticket(Date date) {
        this.date = date;
    }
    
    

    /**
     * @return the idTicket
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * @param idTicket the idTicket to set
     */
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    /**
     * @return the idSeller
     */
    public int getIdSeller() {
        return idSeller;
    }

    /**
     * @param idSeller the idSeller to set
     */
    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the clas
     */
    public String getClas() {
        return clas;
    }

    /**
     * @param clas the clas to set
     */
    public void setClas(String clas) {
        this.clas = clas;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the hour
     */
    public Time getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(Time hour) {
        this.hour = hour;
    }

    /**
     * @return the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * @param airline the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * @return the gate
     */
    public String getGate() {
        return gate;
    }

    /**
     * @param gate the gate to set
     */
    public void setGate(String gate) {
        this.gate = gate;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the discount
     */
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    
}
