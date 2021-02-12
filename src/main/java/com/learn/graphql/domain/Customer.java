package com.learn.graphql.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
@Value
public class Customer {
    UUID id;
    private String firstName;
    private List<String> middleName;
    private String lastName;
}
