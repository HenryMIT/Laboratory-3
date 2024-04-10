/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Domain;

/**
 *
 * @author Usuario
 */
public class Client {
    
    //Atributes
    private String id;
    private String name;
    private String phoneNumber;
    private String address;

    public Client(String id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    @Override
    public String toString() {
        String result = "Client Information"
                + "\n-----------------------"
                + "\n ID: " + this.getId()
                + "\n Name: " + this.getName()
                + "\n Phone: " + this.getPhoneNumber()
                + "\n Address: " + this.getAddress();
        return result;
    }
    
}
