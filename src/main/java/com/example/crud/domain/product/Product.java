package com.example.crud.domain.product;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;

@Entity(name = "product")
@Table(name = "product")
@EqualsAndHashCode(of = "id")
public class Product {



}
