package com.example.SmatRentalPro_API.Users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Users")

public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long id;
    String username;
    String password;
}
