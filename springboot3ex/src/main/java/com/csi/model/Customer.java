package com.csi.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int custId;

    @Size(min = 2, message = "Customer Name Should be atleast 2 character")
    private String custName;

    private String custAddress;

    private double custAccountBalance;

    @Column(unique = true)
    private long custContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    @Email(message = "Email ID must be valid")
    private String custEmailId;

    @Size(min = 4, message = "Customer Password Should be atleast 4 character")

    private String custPassword;

}
