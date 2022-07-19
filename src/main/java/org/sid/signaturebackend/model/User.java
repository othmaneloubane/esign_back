package org.sid.signaturebackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String reference;
    private String family_name;
    private String name;

    private int phone_number;
    private String docType;
    private String docValue;
    //private String topValidity;
    @Column(unique=true)
    private String email;
    private String password;

}
