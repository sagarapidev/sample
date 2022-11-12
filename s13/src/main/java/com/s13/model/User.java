package com.s13.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.context.annotation.Role;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 36, nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String  name ;
    @Column(length = 254, unique = true)
    private String email;

}
