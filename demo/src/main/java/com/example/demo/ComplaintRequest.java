package com.example.demo;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@AllArgsConstructor
@Getter
@Setter
public class ComplaintRequest {
    public String name;
    public String lastName;
    public String city;
    public String phoneNumber;
    public String complaintText;
    public List<String> media;





    @Override
    public String toString() {
        return "ComplaintRequest{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", complaintText='" + complaintText + '\'' +
                ", media=" + media +
                '}';
    }
}

