package org.spring.di.constructorDI.xmlBased.pojo;

import java.util.List;

public class Address {
    private String village;
    private String district;
    private String state;
    private String country;
    private String pinCode;

    public Address(String village, String district, String state, String country, String pinCode) {
        this.village = village;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String toString(){
        return "Village: "+this.village+", District: "+this.district+", State: "+this.state
                +", Country: "+this.country+", Pin Code: "+this.pinCode+".";
    }
}
