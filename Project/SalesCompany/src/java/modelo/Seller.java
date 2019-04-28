
package modelo;


public class Seller {
    
    private int idSeller;
    private String userName;
    private String password;
    private String name;
    private String lastName;
    private String address;
    private String telephone;
    private String email;
    private double pendingValues;

    public Seller() {
    }

    public Seller(int idSeller, String userName, String password, String name, String lastName, String address, String telephone, String email, double pendingValues) {
        this.idSeller = idSeller;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.pendingValues = pendingValues;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pendingValues
     */
    public double getPendingValues() {
        return pendingValues;
    }

    /**
     * @param pendingValues the pendingValues to set
     */
    public void setPendingValues(double pendingValues) {
        this.pendingValues = pendingValues;
    }

    @Override
    public String toString() {
        return "Seller{" + "idSeller=" + idSeller + ", userName=" + userName + 
                ", password=" + password + ", name=" + name + 
                ", lastName=" + lastName + ", address=" + address + 
                ", telephone=" + telephone + ", email=" + email + 
                ", pendingValues=" + pendingValues + '}';
    }
    
    
    
}