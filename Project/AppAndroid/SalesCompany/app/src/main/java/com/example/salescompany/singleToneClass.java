package com.example.salescompany;

public class singleToneClass {
    String ip;
    int idSeller;
    int idTicket;

    private static final singleToneClass ourInstance = new singleToneClass();

    public static singleToneClass getInstance() {
        return ourInstance;
    }

    private singleToneClass() {
    }

    public void setIP(String ip) {
        this.ip = ip;
    }

    public String getIP() {
        return ip;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
    }

    public int getIdSeller() {
        return idSeller;
    }

    public void setidTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getidTicket() {
        return idTicket;
    }

}

