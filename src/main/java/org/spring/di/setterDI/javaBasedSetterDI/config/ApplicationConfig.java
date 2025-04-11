package org.spring.di.setterDI.javaBasedSetterDI.config;

import org.spring.di.pojo.Address;
import org.spring.di.pojo.UserDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserDetail userDetail(){
        UserDetail userDetail = new UserDetail();
        userDetail.setUserId(32493);
        userDetail.setUserName("Amit Kumar Pandey");
        userDetail.setUserEmail("amitKumar.pandey@gmail.com");
        List<Integer> listOfMobileNumbers = new ArrayList<>();
        listOfMobileNumbers.add(9847577);
        listOfMobileNumbers.add(8464737);
        Map<String, Address> addressMap = getStringAddressMap();
        userDetail.setListOfAddress(addressMap);
        userDetail.setListOfMobileNumber(listOfMobileNumbers);
        return userDetail;
    }

    private static Map<String, Address> getStringAddressMap() {
        Map<String, Address> addressMap = new HashMap<>();
        Address address = new Address();
        address.setVillage("Churihari");
        address.setCountry("India");
        address.setDistrict("Siddharth Nagar");
        address.setState("Uttar Pradesh");
        address.setPinCode("272207");
        addressMap.put("Permanent Address",address);

        address = new Address();
        address.setVillage("Kanahai");
        address.setCountry("India");
        address.setDistrict("Gurugram");
        address.setState("Haryana");
        address.setPinCode("122003");
        addressMap.put("Current Address",address);
        return addressMap;
    }

//    @Autowired: Automatically injects dependencies.
//    @Component: Marks a class as a Spring bean.
//    @Configuration: Indicates that the class contains Spring configuration.
//    @Bean: Defines a bean in a configuration class.

}
