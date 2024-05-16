package com.restapi.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Book-stole")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookNo;
    private String bookName;
    private double bookPrice;
}
