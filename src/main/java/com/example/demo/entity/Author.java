package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public record Author(String firstName, String lastName) {
}