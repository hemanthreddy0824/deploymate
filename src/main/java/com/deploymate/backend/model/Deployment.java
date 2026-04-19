package com.deploymate.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Deployment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String url;

    @ManyToOne
    private Project project;
}