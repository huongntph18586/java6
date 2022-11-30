package com.example.j6d3.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String email;
    String fullName;
    Double marks;
    Boolean gender;
    String country;
}
