package com.learn.graphql.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BankAccount {
    UUID id;
    Customer customer;
    Currency currency;
}
