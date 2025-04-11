package org.spring.di.constructorDI.javaBased.pojo;

public class StudentAddress {
    private String village;
    private String district;
    private String state;
    private String country;
    private String pinCode;

    public StudentAddress(String village, String district, String state, String country, String pinCode) {
        this.village = village;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String  toString(){
        return "Village/Town: "+this.village+", District: " + this.district + ", State: "+this.state
                +", Country: " + this.country + ", Pin Code: " + this.pinCode + ".";
    }
}
