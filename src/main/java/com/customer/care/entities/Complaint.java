package com.customer.care.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;

    // Getters and setters
}
