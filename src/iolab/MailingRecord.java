/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iolab;

import java.util.Objects;

/**
 *
 * @author mdufek1
 */
public class MailingRecord {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;

    public MailingRecord(String firstName, String lastName, String address, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
        hash = 53 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MailingRecord other = (MailingRecord) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName+"\n"+address+"\n"+city+", "+state+" "+zip;
    }
    
    
}
