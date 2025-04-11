package org.spring.di.pojo;

import java.util.List;

public class Address {
    private String village;
    private String district;
    private String state;
    private String country;
    private String pinCode;

    public Address() {
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    //    public Address(String village, String district, String state, String country, String pinCode) {
//        this.village = village;
//        this.district = district;
//        this.state = state;
//        this.country = country;
//        this.pinCode = pinCode;
//    }


    @Override
    public String  toString(){
        return "Village/Town: "+this.village+", District: " + this.district + ", State: "+this.state
                +", Country: " + this.country + ", Pin Code: " + this.pinCode + ".";
    }
}
